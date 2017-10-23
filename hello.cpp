#include <iostream>
using namespace std;
 
int main() {
	int number = 88;
	int* pNumber;
	pNumber = &number;
	
	cout << pNumber << endl;
	cout << &number << endl;
	cout << *pNumber << endl;
	cout << number << endl;
	
	return 0;
}
