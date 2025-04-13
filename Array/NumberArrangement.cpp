#include <iostream>
using namespace std;

void Arrange(int numbers[], int size, int target) {
    // O(n)T, O(1)S    
    int index = 0;
    for (int i = 0; i < size; i++) {
        if (numbers[i] != target) {
            numbers[index] = numbers[i]; 
            index++;
        }
    }
    for (int i = index; i < size; i++) {
        numbers[i] = target;
    }
}

int main() {
  
    int numbers[] = {1, 6, 7, 7, 5, 7, 2, 7, 7, 9};
    int size = sizeof(numbers) / sizeof(numbers[0]);
    int target = 7;
    Arrange(numbers, size, target);
    cout << "The arranged array is: ";
    for (int i = 0; i < size; i++) {
        cout << numbers[i] << " ";
    }
    cout << endl;

    return 0;
}
