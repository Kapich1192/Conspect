# Quick Sort (Быстрая сортировка)

    public static int[] quickSort(int[] array) {
        
    }
    //
    private static void doSort(int start, int end) {
        if (start >= end) return;
        int i = start, j = end;
        int cur = i - (i - j)/2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j]))
        }
    }
