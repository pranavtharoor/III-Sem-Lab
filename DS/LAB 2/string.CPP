#include <iostream.h>
#include <conio.h>


void main() {
  clrscr();
  char str1[100];
  cout << "Enter string: ";
  cin.getline(str1, 100);
  int l1;
  for(l1 = 0; str1[l1] != '\0'; l1++);
  cout << "Length: " << l1;
  cout << "\nEnter second string: ";
  char str2[100];
  cin.getline(str2, 100);
  int l2;
  for(l2 = 0; str2[l2] != '\0'; l2++);
  int f = 1;
  for(int i = 0; i < l1 && i < l2; i++)
    if(str1[i] > str2[i]) {
      cout << str1 << " is larger";
      f = 0;
      break;
    } else if(str2[i] > str1[i]) {
      cout << str2 << " is larger";
      f = 0;
      break;
    }
    if(f) {
      if(l1 > l2)
	cout << str1 << " is larger";
      else if(l2 > l1)
	cout << str2 << " is larger";
      else
	cout << "Strings are equal";
    }
  for(i = l1; i < l1 + l2 + 1; i++)
    str1[i] = str2[i - l1];
  cout << "\nConcatenated string: " << str1;
  cout << "\n\nEnter base string: ";
  cin >> str1;
  cout << "Enter string to insert: ";
  cin >> str2;
  for(l1 = 0; str1[l1] != '\0'; l1++);
  for(l2 = 0; str2[l2] != '\0'; l2++);
  cout << "Enter position to insert string: ";
  int pos = 0;
  cin >> pos;
  pos--;
  char temp[100];
  for(i = 0; i < l1 - pos + 1; i++)
    temp[i] = str1[pos + i];
  for(i = pos; i < pos + l2 + 1; i++)
    str1[i] = str2[i - pos];
  for(l1 = 0; str1[l1] != '\0'; l1++);
  for(l2 = 0; temp[l2] != '\0'; l2++);
  for(i = l1; i < l1 + l2 + 1; i++)
    str1[i] = temp[i - l1];
  cout << "Inserted string: " << str1;
  cout << "\n\nEnter base string: ";
  cin >> str1;
  cout << "Enter substring: ";
  cin >> str2;
  for(l1 = 0; str1[l1] != '\0'; l1++);
  for(l2 = 0; str2[l2] != '\0'; l2++);
  for(i = 0; i < l1; i++) {
    f = 1;
    for(int j = 0; j < l2; j++) {
      if(str1[i + j] != str2[j]) {
	f = 0;
	break;
      }
    }
    if(f) {
      pos = i;
      break;
    }
  }
  if(f) {
    for(i = 0; i < l1; i++)
      str1[i + pos] = str1[i + pos + l2];
    cout << "String after deletion: " << str1;
  } else {
    cout << "Substring not found";
  }
  getch();
}



