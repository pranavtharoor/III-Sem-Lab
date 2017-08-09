#include <iostream.h>
#include <conio.h>
#include <math.h>

void main() {
  clrscr();
  float a, b, c;
  cout << "Enter coefficients: ";
  cin >> a >> b >> c;
  float d = b * b - 4 * a * c;
  if(d > 0) {
    cout << "\nReal roots:\n" << (- b + pow(d, 0.5)) / 2 / a << "\n"
     << (- b - pow(d, 0.5)) / 2 / a;
  } else if(d == 0) {
    cout << "\nReal equal roots:\n" << - b / 2 * a;
  } else {
    cout << "\nImaginary roots:\n" << - b / 2 * a << " + i(" << - pow(-d, 0.5)
     / 2 * a << ")\n" << - b / 2 * a << " - i(" << - pow(-d, 0.5) / 2 * a
     << ")";
  }
  getch();
}