#include <iostream>
#include <algorithm>

int main() {
    std::string s;
    std::cin >> s;

    for (char i = 'a'; i <= 'z'; i++) {
        std::cout << (int)s.find(i) << " ";
    }
}
