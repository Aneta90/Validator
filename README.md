# Validator
Pesel and ID validator classes. Check out how to validate PESEL and ID number.

https://en.wikipedia.org/wiki/PESEL#Checksum_calculation

PESEL number has the form of YYMMDDZZZXQ, where YYMMDD is the date of birth (with century encoded in month field), ZZZX is the personal identification number, where X codes sex (even number for females, odd number for males) and Q is a check digit, which is used to verify whether a given PESEL is correct or not.

Checksum calculation
Having a PESEL in the form of ABCDEFGHIJK, one can check the validity of the number by computing the following expression:

A*1 + B*3 + C*7 + D*9 + E*1 + F*3 + G*7 + H*9 + I*1 + J*3

The checksum is the last digit of result of the above expression subtracted from 10. If this last digit is 0 then the checksum is 0.

If the result of the last operation is not equal to the last digit (K) of a given PESEL, the PESEL is incorrect. This system works reliably well for catching one-digit mistakes and digit swaps.

Example: Checking validity of PESEL 44051401358
4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 3*1 + 5*3 = 101

The last digit of the result (101 modulo 10): 1

The last digit is not 0 so, the checksum is 10 - 1 = 9

9 is not equal to the last digit of PESEL, which is 8, so the PESEL number contains errors.

https://en.wikipedia.org/wiki/Polish_identity_card#Validation

The card number consists of 3 letters followed by 6 digits (for example, ABA300000), of which the first digit (at position 4) is the check digit.

Each letter has a numerical value, as shown below:

 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35
The next step is to multiply each so obtained value by its respective "weight". The assigned weights for each position are

 1 2 3 4 5 6 7 8 9
 7 3 1 0 7 3 1 7 3
The remainder of the division by 10 of the sum of the weighted values should be equal to the check digit (indicated between asterisks in the example below).

Verification example (ID card number for this example: ABA300000):

Card number:  A    B    A   *3*   0    0    0    0    0
Value:       10   11   10   *3*   0    0    0    0    0
Weight:       7    3    1    0    7    3    1    7    3
Result:      70   33   10    0    0    0    0    0    0
Sum:         70 + 33 + 10 +  0 +  0 +  0 +  0 +  0 +  0 = 113
The remainder of the division of 113 by 10 equals 3 (113 mod 10 = 3), and is also equal to the first digit of the ID card number, so this ID card number is correct.




