#include <iostream>

using namespace std;

class SparseMatrix {
	int row, col, val;
	public:
		void readMatrix(SparseMatrix sm[]) {
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
				int rf = 1, cf = 1, r[m] = {0}, c[n] = {0};
				for(int i = 1; i < k; i++) {
					r[sm[i].row]++;
					c[sm[i].col]++;
				}
				for(int i = 0; i < m; i++)
					if(r[i] > 0) numr++;
				for(int i = 0; i < n; i++)
					if(c[i] > 0) numc++;
				sm[0].row = numr;
				sm[0].col = numc;
				sm[0].val = --k;
			}
		}
		void displayMatrix(SparseMatrix sm[], int len) {
			for(int i = 0; i < len + 1; i++) {
				cout << sm[i].row << " " << sm[i].col << " " << sm[i].val << "\n";
			}
		}
		int len(SparseMatrix sm[]) {
			return sm[0].val;
		}
		void fastTranspose(SparseMatrix a[],SparseMatrix b[], int len) {
			b[0].row = a[0].col;
			b[0].col = a[0].row;
			b[0].val = a[0].val;
			int rowTerms[a[0].col] = {0};
			int startingPos[10];
			if(len > 0) {
				for(int i = 1; i <= len; i++)
					rowTerms[a[i].col]++;
				startingPos[0] = 1;
				for(int i = 1; i <= len; i++) {
					startingPos[i] = startingPos[i - 1] + rowTerms[i - 1];
				}
				int j;
				for(int i = 0; i <= len; i++) {
					j = startingPos[a[i].col]++;
					b[j].row = a[i].col;
					b[j].col = a[i].row;
					b[j].val = a[i].val;
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
	a.fastTranspose(sm, b, a.len(sm));
	a.displayMatrix(b, a.len(b));
	return 0;
}