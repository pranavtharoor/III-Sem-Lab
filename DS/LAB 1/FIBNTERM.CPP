#include <iostream.h>
#include <conio.h>

void main() {
  clrscr();
  int n, a = 0, b = 1;
  cout << "Enter n: ";
  cin >> n;
  cout << "First " << n << " fibonacci terms:\n";
  if(n % 2 != 0) {
    cout << a << "\n";
    a = 1;
    b = 1;
  }
  for(int i = 0; i < n / 2; i++) {
    cout << a << "\n" << b << "\n";
    a += b;
    b += a;
  }
  getch();
}