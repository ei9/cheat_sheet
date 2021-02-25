/* blink.c
 * Reference:
 * https://www.tderflinger.com/en/arduino-blinking-led-pure-c
 */

#include <avr/io.h>
#include <util/delay.h>

#define DELAY_TIME 500

int main(void)
{
    // setup port B pin 5 as output
    DDRB |= 0b100000;  // pin 13 is at pin 5 of port B.

    while(1) {
        PORTB |= 0b100000;  // portB pin 5 set to high
        _delay_ms(DELAY_TIME);

        PORTB &= ~ 0b100000;  // reverse pin 5 state to set to low.
        _delay_ms(DELAY_TIME);
    }
}
