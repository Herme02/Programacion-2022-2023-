'''11. Escribe una función intersect que reciba dos listas y devuelva otra lista con los
elementos que son comunes a ambas, sin repetir ninguno.'''

lista1 = ["a", "b", "c", "d", "e"]
lista2 = ["a", "b", "h", "d", "e", "e"]

def intersect(lista1, lista2):
    unionLista = []
    for i in range(len(lista1)):
        
        for j in range(len(lista2)):
            
            if(lista1[i] == lista2[j]):
                unionLista.append(lista1[i])
                
    listaComprimida = []
    
    for k in range(len(unionLista)):
        if(unionLista[k] not in listaComprimida):
            listaComprimida.append(unionLista[k])
            
    return listaComprimida


print(intersect(lista1, lista2))