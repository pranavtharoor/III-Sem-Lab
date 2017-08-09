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
  for(i = 1; i < n; i++) {
    for(int j = i - 1; j >= 0; j--) {
      if(a[i] < a[j] && (a[i] >= a[j - 1] || j == 0)) {
	// shift(i, j);
	int t = a[i];
	for(int k = i; k > j; k--) {
	  a[k] = a[k - 1];

	}
	a[j] = t;
      }
    }
  }
  for(i = 0; i < n; i++)
   cout << a[i] << " ";
  getch();
}



