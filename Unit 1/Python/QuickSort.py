# Python implementation of Quicksort Sort 
from random import randint
# This function takes last element as pivot, places 
# the pivot element at its correct position in sorted 
# array, and places all smaller (smaller than pivot) 
# to left of pivot and all greater elements to right 
# of pivot 
def partition(A,low,high): 
    i = (low-1)
    for j in range(low, high): 
        if A[j] <= A[high]: 
            i = i + 1
            A[i], A[j] = A[j], A[i]
    A[i + 1], A[high] = A[high], A[i + 1]
    return (i + 1) 
  
def quickSort(A, low, high):
    if low < high:
        quickSort(A, low, partition(A, low, high) - 1)
        quickSort(A, partition(A, low, high) + 1, high) 
  
A = [randint(-10000, 10000) for i in range(1000000)]
quickSort(A, 0, len(A) - 1)

print('Ok')
  