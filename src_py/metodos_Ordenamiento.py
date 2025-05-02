class MetodoOrdenamiento:
#--------------------------------------------------------------------------------------------------------------
    def sort_bubble(self, array):
        arreglo = array.copy()  # No modificar el original

        tam = len(arreglo)
        for i in range(tam):
            for j in range(i + 1, tam):
                if arreglo[i] >= arreglo[j]:
                    arreglo[i], arreglo[j] = arreglo[j], arreglo[i]

        return arreglo
#--------------------------------------------------------------------------------------------------------------
    def sort_burbuja_mejorado(self,array):
        arreglo = array.copy()
        tam = len(arreglo)

        for i in range(tam):
            intercambio = False

            for j in range(0, tam - i - 1):
                if arreglo[j] > arreglo[j + 1]:
                    arreglo[j], arreglo[j + 1] = arreglo[j + 1], arreglo[j]
                    intercambio = True

        return arreglo
#--------------------------------------------------------------------------------------------------------------
    def sort_seleccion(self, array):
        arreglo = array.copy()
        tam = len(arreglo)

        for i in range(tam - 1):
            indiceMinimo = i

            for j in range(i + 1, tam):
                if arreglo[j] < arreglo[indiceMinimo]:
                    indiceMinimo = j
        
        arreglo[i], arreglo[indiceMinimo] = arreglo[indiceMinimo], arreglo[i]

        return arreglo
#--------------------------------------------------------------------------------------------------------------
    def sell_sort(self,array):
        arreglo = array.copy()
        tam = len(arreglo)

        gap = tam // 2

        while gap > 0:
            for i in range(gap, tam):
                temp = arreglo[i]
                j = i
                while j >= gap and arreglo[j - gap] > temp:
                    arreglo[j] = arreglo[j - gap]
                    j -= gap
                arreglo[j] = temp
            gap //= 2

        return arreglo
#--------------------------------------------------------------------------------------------------------------
