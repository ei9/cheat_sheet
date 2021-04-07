# CPU

### SAP1 - Simple As Possible CPU version 1
This is a  simple Von Neumann architecture cpu. It includes:

- 5 instructions.

| Instruction | Opcode | Meaning | Example | Machine cycle |
| :----: | :----: | :---- | :---- | :----: |
| LDA | 0000 | Load the accumulator | LDA 9H | 5T |
| ADD | 0001 | Add to the accumulator | ADD AH | 6T |
| SUB | 0010 | Accumulator subtracts a number | SUB CH | 6T |
| OUT | 1110 | Accumulator to the output port | OUT | 4T |
| HLT | 1111 | Stop cpu clock | HLT | 3T |

- 16 x 8 RAM (16 Bytes). That means you can only write 16 lines of codes.

### Compile & Test:
```
iverilog -o tb_sap1.o tb_sap1.v
vvp tb_sap1.o
gtkwave tb_sap1.vcd
```
