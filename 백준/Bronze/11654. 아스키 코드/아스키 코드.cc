#include <iostream>
#include <string>
int main() {
    std::string s;
    std::cin >> s;

    char c = s[0];   
    int ascii = (int)c; 

    std::cout << ascii;
    return 0;
}
