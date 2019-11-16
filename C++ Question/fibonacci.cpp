#include <iostream>
using namespace std;

int main() {
	int number = 0;
	cin >> number;
	int a = 0,b = 1,c;
	cout << a << " " << b << " ";
	for (int i = 0; i < number; i++) {
		c = a + b;
		a = b;
		b = c;
		cout << b << " ";
	}
	return 0;
}
