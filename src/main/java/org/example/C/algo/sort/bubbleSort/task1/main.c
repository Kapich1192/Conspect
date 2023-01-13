#include <stdio.h>
#include <stdlib.h>
#include "bubble_sort.h"

int main(void) {
    int len = 5;
    int* array = (int *)malloc(sizeof(int) * len);

    select_array(array,len);
    print_array(array,len);
    bubble_sorting(array,len);
    printf("\n");
    print_array(array,len);
    free(array);

    return(0);
}