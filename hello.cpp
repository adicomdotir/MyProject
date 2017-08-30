#include "iostream"

class MyClass {
	MyClass() {
		std::cout << "Constructor";
	}
};

int main(void) 
{
    std::cout << "Hello! This is a C++ program.\n";
    for(int i=0; i<10; i++) {
    	std::cout << i << "\n";
    }
    MyClass mClass = new MyClass();
    return 0;
}