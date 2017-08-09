#include <iostream.h>
#include <conio.h>


void main() {
  clrscr();
  int a[100];
  cout << "Enter array length: ";
  int n;
  cin >> n;
  cout << "Enter array:\n";
  for(int i = 0; i < n; i++)
    cin >> a[i];
  int s, t, pos;
  for(i = 0; i < n - 1; i++) {
    s = a[i];
    pos = i;
    for(int j = i + 1; j < n; j++)
      if(s > a[j]) {
	s = a[j];
	pos = j;
      }
    t = a[i];
    a[i] = a[pos];
    a[pos] = t;
  }
  cout << "Sorted array\n";
  for(i = 0; i < n; i++)
    cout << a[i] << " ";
  getch();
}



