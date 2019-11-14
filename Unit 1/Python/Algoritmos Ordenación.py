def selection_sort(A):
    i, j, minimum = 0, 0, 0
    for i in range(len(A)):
        minimum = i
        for j in range(i, len(A)):
            if A[j] < A[minimum]:
                minimum = j
        A[i], A[minimum] = A[minimum], A[i]
    return A



def insertion_sort(A):
    i, j, r = 0, 0, 0
    for i in range(1, len(A)):
        r = A[i]
        j = i - 1
        while j >= 0 and A[j] > r:
            A[j + 1] = A[j]
            j = j - 1
        A[j + 1] = r
    return A


def bubble_sort(A):
    i, j = 0, 0
    for i in range(0, len(A)-2):
        for j in range(len(A)-1, i, -1):
            if A[j] < A[j - 1]:
                A[j], A[j - 1] = A[j - 1], A[j]
    return A



A = [682, 637, 917, 303, 830, 165, 618, 468, 374, 60, 148, 873, 405,
     886, 833, 594, 55, 838, 124, 594, 902, 870, 290, 352, 307, 257]



print(selection_sort(A))

print(insertion_sort(A))

print(bubble_sort(A))


