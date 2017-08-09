#include <iostream.h>
#include <conio.h>

int fact(int n) {
  if(n > 1)
     return n * fact(n - 1);
  else
    return 1;
}

void main() {
  clrscr();
  int n;
  cout << "Enter n: ";
  cin >> n;
  cout << n << "! = " << fact(n);
  getch();
}