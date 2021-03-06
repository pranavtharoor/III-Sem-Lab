#include <iostream.h>
#include <conio.h>

class SparseMatrix {
	int row, col, val;
	public:
		void readMatrix(SparseMatrix *sm) {
			int m, n, ele, k = 1, numr = 0, numc = 0;
			cout << "Enter dimentions of matrix\n";
			cin >> m >> n;
			cout << "Enter elements\n";
			for(int i = 0; i < m; i++)
				for(int j = 0; j < n; j++) {
					cin >> ele;
					if(ele == 0) continue;
					sm[k].row = i;
					sm[k].col = j;
					sm[k].val = ele;
					k++;
				}
			if(k > 1) {
				int r[100] = {0}, c[100] = {0};
				for(int i = 1; i < k; i++) {
					r[sm[i].row]++;
					c[sm[i].col]++;
				}
				for(i = 0; i < m; i++)
					if(r[i] > 0) numr++;
				for(i = 0; i < n; i++)
					if(c[i] > 0) numc++;
				sm[0].row = numr;
				sm[0].col = numc;
				sm[0].val = --k;
			}
		}
		void displayMatrix(SparseMatrix *sm, int len) {
			for(int i = 0; i < len + 1; i++) {
				cout << sm[i].row << " " << sm[i].col << " " << sm[i].val << "\n";
			}
		}
		int len(SparseMatrix *sm) {
			return sm[0].val;
		}
		void transpose(SparseMatrix *a, SparseMatrix *b, int len) {
			if(len > 0) {
				for(int i = 0; i <= len; i++) {
					b[i].col = a[i].row;
					b[i].row = a[i].col;
					b[i].val = a[i].val;
				}
				for(i = 1; i <= len + 1; i++) {
					for(int j = 1; j <= len - i; j++) {
						if(b[j].row > b[j + 1].row) {
							SparseMatrix t;
							t = b[j];
							b[j] = b[j + 1];
							b[j + 1] = t;
						}
					}
				}
			}
		}
};

int main() {
	SparseMatrix sm[10], a, b[10];
	a.readMatrix(sm);
	cout << "Sparse matrix: \n";
	a.displayMatrix(sm, a.len(sm));
	cout << "\nTranspose:\n";
	a.transpose(sm, b, a.len(sm));
	a.displayMatrix(b, a.len(b));
	getch();
	return 0;
}