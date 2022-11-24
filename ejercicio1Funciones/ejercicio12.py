'''12. Escribe una función unionListas que reciba dos listas y devuelva los elementos que
pertenecen a una, o bien, a la otra, pero sin repetir ninguno (unión de conjuntos).'''

lista1 = ["a", "b", "c", "d", "e"]
lista2 = ["a", "b", "h", "d", "e", "e"]

def unionListas(lista1,lista2):
    unionLista = []
    
    for i in range(len(lista1)):
        if(lista1[i] not in unionLista):
            unionLista.append(lista1[i])
    
    for j in range(len(lista2)):
        if(lista2[j] not in unionLista):
            unionLista.append(lista2[j])
            
    return unionLista

print(unionListas(lista1, lista2))