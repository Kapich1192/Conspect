/*
* Дано целое число ножек NN.
*  Напечатать сколько из них можно сделать столов.
*  У кого в ответе будет 3.5 стола, будет сам сидеть за половиной стола в классе.
*/

#include <stdio.h>

int main() {
    int N, res;
    scanf("%d",&N);

    res = N / 4;
    printf("%d", res);
    return(0);
}