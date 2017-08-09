#include <iostream.h>
#include <conio.h>

void main() {
  clrscr();
  int n, b;
  cout << "Enter number of terms: ";
  cin >> n;
  int a[100];
  cout << "Enter terms: \n";
  for(int i = 0; i < n; i++)
    cin >> a[i];
  cout << "Enter term to find: ";
  cin >> b;
  cout << "Position(s) of " << b << ": ";
  for(int j = 0; j < n; j++)
    if(a[j] == b)
      cout << j << " ";
  getch();
}