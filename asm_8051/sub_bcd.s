;Two 16-bit BCD number subtraction.
;This program is written in 8051 assembly.

          C1  =  0         ;high-4-bit adjust flag
          C2  =  1         ;low-4-bit adjust flag

          MOV  0x11,#0x12  ;minuend high byte
          MOV  0x10,#0x34  ;minuend low byte
          MOV  0x21,#0x56  ;subtrahend high byte
          MOV  0x20,#0x78  ;subtrahend low byte
     ;
 A  :
SUB_BCD:MOV   R0,0x10    ;16-bit minuend
          MOV   R1,0x20    ;16-bit subtrahend
          MOV   R2,0x2     ;2 bytes
CLR   C

NEXT:     MOV   A,@R0
          SUBB  A,@R1      ;subtract two numbers
          ACALL DS         ;BCD subtraction adjustion
          MOV   @R0,A
          INC   R0
          INC   R1
          DJNZ  R2,NEXT
          RET
          ;
          ;
          ; d
DS:       PUSH  PSW        ;BCD subtraction adjustion subroutine
          PUSH  A
          CLR   C1
          CLR   C2
          JNB   AC,S1      ;if AC = 1 then must adjust low-4-bit
          SETB  C1         ;set C1 = 1, means must adjust low-4-bit
S1:       JNB   CY,S2      ;if c1 = 1 then must adjust high-4-bit
          SETB  C2         ;set c2 = 1, means must adjust high-4-bit
S2:       ANL   A,#0xF
          CLR   C
          SUBB  A,#0xA     ;if low-4-bit N3-N0 > 9 then adjust low-4-bit
          JB    CY,S3
          SETB  C1
S3:       POP   A
          PUSH  A
          ANL   A,#0xF0
          CLR   C
          SUBB  A,#0xA0    ;if high-4-bit N7-N4 > 9 then adjust high-4-bit
          JB    CY,S4
          SETB  C2
S4:       POP   A
          JNB   C1,S5
          CLR   C
          SUBB  A,#0x6     ;low-4-bit minus 6 to adjust
S5:       JNB   C2,S6
          CLR   C
          SUBB  A,#0x60    ;high-4-bit minus 6 to adjust
S6:       POP   PSW
          RET
