public class ReverseNumber {
public static void main(String[] args) {
int number = 12345;// 12345-> 4321->  321-> 21->  1->   0

int reversed = 0;  // 0-> 5-> 54-> 543-> 5432-> 54321

while (number != 0) {
int digit = number % 10;       // get last digit   5-> 4-> 3-> 2-> 1-> 
reversed = reversed * 10 + digit; // append digit  0x10+5=5  5x10+4=54  54x10+3=543 543x10+2=5432 ......54321
number = number / 10;          // remove last digit  12345-> 4321->  321-> 21->  1->   0
}

System.out.println("Reversed Number: " + reversed);
}
}