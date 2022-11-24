'''13. Escribe una función que, dada una lista de nombres y una letra, devuelva una lista
con todos los nombres que empiezan por dicha letra. Debe validar los datos.'''

nombres = "Hermenegildo,Paco,Hilario,Jose,Heladio."

letra = "H"

def primeraLetra(nombres, letra):
    nombre = ""
    listaNombres = []
    
    for i in range(len(nombres)):
        if(nombres[i] == letra[0]):
            contador = i
            while(nombres[contador] != "," and contador < len(nombres)-1):
                nombre += nombres[contador]
                contador += 1
            listaNombres.append(nombre)
            nombre = ""
    return listaNombres

print(primeraLetra(nombres, letra))