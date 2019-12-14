#include <iostream>

using namespace std;

int sum() {
    return 6 * 9 * 3;
}

void print() {
	cout << "Print Method" << endl;
	cout << "Hello Git Flow" << endl;
}

void swap(int *x, int *y) {
	int temp = *x;
	*x = *y;
	*y = temp;
}

class Geeks {

	private:
	int age;
    string geekname;

    public:
	Geeks(int age, string geekname) {
		this->age = age;
		this->geekname = geekname;
	}

	~Geeks() {
		cout << "Calling destructor" << endl;
	}
  
    // Member Functions() 
    void printname() { 
       cout << "Geekname is: " << geekname << endl; 
    }

	void setAge(int age) {
		this->age = age;
	}

	int getAge() {
		return this->age;
	}

	void toString();
}; 

void Geeks::toString() {
	cout << "[Age: " << this->age << ", Name: " << this->geekname << "]" << endl;
}

int main() {
	int number = 88;
	int x = 66, y = 87;
	int* pNumber;
	pNumber = &number;

	cout << "pNumber: " << pNumber << endl;
	cout << "&number: " << &number << endl;
	cout << "*pNumber: " << *pNumber << endl;
	cout << "*&number: " << *&number << endl;
	cout << "SUM=" << sum() << endl;

	cout << "Numbers before swap: " << x << ", " << y << endl;
	swap(&x, &y);
	cout << "Numbers after swap: " << x << ", " << y << endl;

	print();

	Geeks geeks = Geeks(23, "NoName");
	Geeks* geeksPtr = new Geeks(geeks);
	geeksPtr->setAge(18);
	geeksPtr->toString();
	geeks.toString();
	delete geeksPtr;

	return 0;
}

