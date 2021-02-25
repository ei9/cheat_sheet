# Each command should start with a <tab>
help:
	@echo 'Help details:'
	@echo 'hex: compile hex file'
	@echo 'flash: install hex file'
	@echo 'program: compile hex and install'

program_file = blink.c
file_str = $(subst ., ,$(program_file))
name = $(word 1, $(file_str))
chip = atmega328p
freq = 16000000
port = /dev/ttyACM0

hex:
	@echo $(name)
	avr-gcc -Os -DF_CPU=$(freq) -mmcu=$(chip) -c $(name).c
	avr-gcc -DF_CPU=$(freq) -mmcu=$(chip) -o $(name).elf $(name).o
	avr-objcopy -O ihex $(name).elf $(name).hex
	rm $(name).o
	rm $(name).elf

flash:
	avrdude -c arduino -p $(chip) -P $(port) -U flash:w:$(name).hex

program: hex flash
