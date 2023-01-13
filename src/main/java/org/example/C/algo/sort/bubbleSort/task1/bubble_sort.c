#include "bubble_sort.h"

void bubble_sorting(int* array, int len) {
    int temp = 0;
    for(int i = 0; i < len; i++) {
        for(int j = i; j < len; j++) {
            if(array[i] > array[j]) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}

void print_array(int* array, int len) {
    for(int i = 0; i < len; i++) {
        printf("--> %d ;", array[i]);
    }
}

void select_array(int* array, int len) {
    for(int i = 0; i < len; i++) {
        array[i] = -1 * i;
    }
}