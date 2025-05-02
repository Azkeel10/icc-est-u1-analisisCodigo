import mechmaking as bm
from metodos_Ordenamiento import MetodoOrdenamiento

#App o  principal
if __name__ == "__main__":
    print("\n----------Programa Funciona----------")

    bench = bm.Mechmaking()
    metodosO = MetodoOrdenamiento()

    ##tam = 10000
    tamanios = [5000,10000,15000]
    resultado = []

    for tam in tamanios:

        arreglo_base = bench.build_arreglo(tam)

        metodos_dic  = {
            "Burbuja" : metodosO.sort_bubble,
            "Burbuja_Mejorado" : metodosO.sort_burbuja_mejorado,
            "Seleccion" : metodosO.sort_seleccion,
            "Shell" : metodosO.sell_sort
        }    

        for nombre, fun_metodo in metodos_dic.items():

            tiempo_resultado = bench.medir_tiempo(fun_metodo,arreglo_base)
            tupla_resultado = (tam,nombre,tiempo_resultado)
            resultado.append(tupla_resultado)

    for tam,nombre,tiempo_resultad in resultado:
        print(f"\nTamaño: {tam}, Nombre Metodo: {nombre}, Tiempo: {tiempo_resultad:.6f} segundos")

