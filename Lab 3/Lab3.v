module Lab3(SW,KEY,HEX0,HEX1);

    //we restate inputs along with if they are a wire or a reg(register) and size of each input and output.
    input wire [8:0] SW;
    input wire [2:0] KEY; 
    output wire [6:0] HEX0; 
    output wire [6:0] HEX1;

   //next we create any registers (variables or storage elements) and any wires(temporary variables or intermediate combinational logic nodes)
   reg [7:0] result_r; //this is declared with “reg” because it is a register which means it holds state
                                   //the “_r” is just a naming convention to use to easily identify that it is a register and not a wire
  wire [7:0] result_next; //this is declared as a wire because it is not going to hold state, “_next” is a naming convention because this will be the next result value the next time the register gets updated(clocked).
 
//This says the next value of the register will be based on the value of the switches, we will next see how to make the value of the register change and what to make it change off of.
    assign result_next = (SW==2'd0) ? result_r - 8'd1 : 
                                         (SW==2'd1) ? result_r + 8'd1 : 
                                         (SW==2'd2) ? 8'd0 : result_r; 

//the below tells the register to be updated on the rising edge of the KEY[0] signal
// (when the button get pressed)  you could list multiple triggers in the block to cause
// the register to update by using an “or” EX: always @(posedge KEY[0] or posedge KEY[1]) begin.  
//However this can potentially cause problems and is not good practice.
    always @(posedge KEY[0]) begin
        result_r <= result_next;
    end
              //the final part we need to do is output our register to the displays we are going to do this by
             //reusing our module we created in LAB2
             //the first part is the module name the second is the instance name (incase we have more than one of the same module
            //then we follow it by list of inputs/output and the wires/reg we are using for those parameters
            //This looks similar a function call
            //in this case we do not need to wire up the LEDR so we will leave it blank but we could wire it up if we wanted.
            lab2 hexDisplay0(
                .SW     (result_r[3:0]),
                .HEX0 (HEX0),
                .LEDR  ()
            );
             //now to connect the upper 4 bits of the register to the second 7seg display notice the instance 
            //name change and the inputs and output changes
				            lab2 hexDisplay1(
                .SW     (result_r[7:4]),
                .HEX0 (HEX1),
                .LEDR  ()
            );
        endmodule

