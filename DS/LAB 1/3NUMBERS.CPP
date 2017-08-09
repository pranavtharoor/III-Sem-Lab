#include <iostream.h>
#include <conio.h>
void main() {
 clrscr();
 int a, b, c;
 cout << "Enter 3 numbers\n";
 cin >> a >> b >> c;
 if(a > b && a > c)
	cout << "Largest: " << a << "\n";
 else if (b > a && b > c)
	cout << "Largest: " << b << "\n";
 else
	cout << "Largest: " << c << "\n";
 if(a < b && a < c)
	cout << "Smallest: " << a;
 else if (b < a && b < c)
	cout << "Smallest: " << b;
 else
	cout << "Smallest: " << c;
 getch();
}