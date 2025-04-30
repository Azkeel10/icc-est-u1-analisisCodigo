import metodos_Ordenamiento as mo
import random
import time
#milisegundos en segundos con: x= time.time()
#nanosegundos con = x=time.time_ns()

class Mechmaking:

    def __init__(self):
        print("Benchmarking instanciado")
        
        self.metodo = mo.MetodoOrdenamiento()
        arreglo = self.build_arreglo(10000)

        tarea = lambda: self.metodo.sort_bubble(arreglo)
        tarea2 = lambda: self.metodo.sort_burbuja_mejorado(arreglo)
        tarea3 = lambda: self.metodo.sort_seleccion(arreglo)

        tiempoMM = self.contar_con_current_time_milles(tarea)
        tiempoNN = self.contar_con_current_time_nano(tarea)
        tiempoBM = self.contar_con_current_time_nano(tarea2)
        tiempoMS = self.contar_con_current_time_nano(tarea3)

        print(f"\nMétodo milisegundos: {tiempoMM}")
        print(f"\nMétodo nanosegundos: {tiempoNN}")
        print(f"\nMétodo busbuja mejorado: {tiempoBM}")
        print(f"\nMétodo seleccion: {tiempoMS}")

    def build_arreglo(self, tamaño):
        arreglo = [random.randint(0, 99999) for _ in range(tamaño)]
        return arreglo

    def contar_con_current_time_milles(self, tarea):
        inicio = time.time()
        tarea()
        fin = time.time()
        return (fin - inicio)

    def contar_con_current_time_nano(self, tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        return (fin - inicio) / 1_000_000_000.0