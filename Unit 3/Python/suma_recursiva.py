def suma_fuerza_bruta(A):
    s = A[0]
    for i in range(1, len(A)):
        s += A[i]
    return s


def suma_recursiva(A, izq, der):
    m, s = 0, 0
    if izq == der:
        s = A[izq]
    else:
        m = (izq + der) // 2
        s = suma_recursiva(A, izq, m) + suma_recursiva(A, m + 1, der)
    return s


suma_recursiva
