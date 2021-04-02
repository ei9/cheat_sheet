# How to compile a program?

- java
```
javac program.java  # this will generate program.class
java program  # execute
```

- java (termux)
```
ecj program.java
dx --dex --output=program.dex program.class
dalvikvm -cp program.dex program
```

- gcc
```
gcc main.c -o main.o  # compile
./main.o  # execute
```

- verilog
```
iverilog -o bin.o src.v  # compile
vvp bin.o  # execute
```

- 8051 assembly (using sdcc)
```
sdas8051 -los your_program.s
sdld -i your_program
packihx your_program.ihx > your_program.hex
```
