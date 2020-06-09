#include <iostream>
using namespace std;

int fibonacci(int);

int main() {
    // 1 1 2 3 5 8 13 21 34 55
    for (int i = 1; i <= 10; i++) {
        int result = fibonacci(i);
        cout << result << endl;
    }
    return 0;
}

int fibonacci(int n) {
    if (n == 1 || n == 2) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}