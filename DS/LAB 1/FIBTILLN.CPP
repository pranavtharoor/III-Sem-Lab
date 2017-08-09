#include <iostream.h>
#include <conio.h>

void main() {
  clrscr();
  int n, a = 0, b = 1;
  cout << "Enter n: ";
  cin >> n;
  cout << "Fibonacci terms till " << n << ":\n";
  while(a <= n) {
    cout << a << "\n";
    if(b <= n)
      cout << b << "\n";
    a += b;
    b += a;
  }
  getch();
}