#include <iostream.h>
#include <conio.h>

void main() {
  clrscr();
  int m, n;
  cout << "Enter dimentions: ";
  cin >> m >> n;
  int a[100][100], b[100][100], c[100][100];
  cout << "Enter first matrix:\n";
  for(int i = 0; i < m; i++)
    for(int j = 0; j < n; j++)
     cin >> a[i][j];
  cout << "Enter second matrix:\n";
  for(int k = 0; k < m; k++)
    for(int l = 0; l < n; l++)
      cin >> b[k][l];
  for(int o = 0; o < m; o++)
    for(int p = 0; p < n; p++)
      c[o][p] = a[o][p] > b[o][p] ? a[o][p] : b[o][p];
  cout << "Matrix of larger elements:\n";
  for(int q = 0; q < m; q++) {
    for(int r = 0; r < n; r++)
      cout << c[q][r] << " ";
    cout << "\n";
  }
  getch();
}