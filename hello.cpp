#include <iostream>
using namespace std;

int sum() {
    return 6 * 9;
}

void print() {
	cout << "Print Method" << endl;
}

int main() {
	int number = 88;
	int* pNumber;
	pNumber = &number;

	cout << pNumber << endl;
	cout << &number << endl;
	cout << *pNumber << endl;
    cout << number << endl;
	cout << "SUM=" << sum() << endl;

	print();

	return 0;
}
