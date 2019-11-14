from random import randint

array = [randint(-10000, 10000) for i in range(1000000)]
array.sort()
x = 30

# Implementación eficiente
def Efficient(array):
    i = 0
    j = len(array) - 1
    while (i < j):
        s = array[i] + array[j]
        if s == x: return (array[i], array[j])
        elif s < x: i += 1
        else: j -= 1

# Implementación pocha (fuerza bruta)
def BruteForce(array):
    for i in range(len(array)-1):
        for j in range(i+1, len(array)-1):
            if array[i] + array[j] == x:
                return (array[i], array[j])


print(Efficient(array))
print(BruteForce(array))



            
        
