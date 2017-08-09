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
  cout << "Sorted array: \n";
  for(int j = 0; j < n; j++)
    for(int k = 0; k < n - j - 1; k++)
      if(a[k] > a[k + 1]) {
	a[k] += a[k + 1];
	a[k + 1] = a[k] - a[k + 1];
	a[k] -= a[k + 1];
      }
  for(int l = 0; l < n; l++)
    cout << a[l] << " ";
  getch();
}