#include <iostream.h>
#include <conio.h>

void main() {
  clrscr();
  int n;
  cout << "Enter length of array: ";
  cin >> n;
  cout << "Enter sorted array\n";
  int a[100];
  for(int i = 0; i < n; i++)
    cin >> a[i];
  int l = 0, h = n, m, k;
  cout << "Enter element to find: ";
  cin >> k;
  int pos = -1;
  while(l <= h) {
    m = (l + h) / 2;
    if(a[m] < k)
      l = m + 1;
    else if(a[m] > k)
      h = m - 1;
    else {
      pos = m;
      break;
    }
  }
  if(pos >= 0)
    cout << "Position: " << pos;
  else
    cout << "Element not found";
  getch();
}