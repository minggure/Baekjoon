#include <iostream>
#include <algorithm>

int main() {
    int index;
    int N;
    std::cin >> N;
    std::string s;
    for (int i = 0; i < N; i++) {
        std::cin >> s;
        std::cout << s.front() << s.back() << std::endl;
    }
    

    

}
