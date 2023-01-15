# 8-And-16-Bit-Full-Adder

An 8-bit full ripple adder is a digital circuit that can add two 8-bit binary numbers. It works by performing the addition operation bit by bit, starting from the least significant bit (LSB) and working its way to the most significant bit (MSB). Each bit of the sum is calculated by considering the corresponding bit of the two numbers being added, as well as any carry-in from the previous addition. A carry-out from a one-bit position is then passed on as a carry-in to the next-bit position. This process is repeated until all the bits have been added, and the final sum is produced.
A 16-bit full ripple adder is similar, but it can add two 16-bit binary numbers instead. The process is the same as the 8-bit adder, with the only difference being that it has more bit positions to add.
It is important to note that a full ripple adder is the simplest and most basic type of adder. It is relatively slow, as the carry-out from the one-bit position must propagate through all the subsequent bit positions before it can be used. There are other types of adders like a carry-skip adder, carry-lookahead adder, and Kogge-Stone adder which are faster but more complex than full ripple adder.


Must have Java installed.

To run, first download the project as a zip. Extract the folder from the zip file and open up your terminal. Change the directory to the inside of the extracted folder. Type 'java Adder8' or 'java Adder16' to run the compiled code.
You may change the numbers this program adds by modifying the parameters on lines 7, 28, 50, and 71.
