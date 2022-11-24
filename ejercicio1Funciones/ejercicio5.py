'''5. Realiza una función reverse que reciba una lista y devuelva una nueva lista cuyo
contenido sea igual a la original pero invertida. Así, dada la lista [‘Di’, ‘buen’, ‘día’, ‘a’,
‘papa’], deberá devolver [‘papa’, ‘a’, ‘día’, ‘buen’, ‘Di’].'''

lista = ["Di", "buen", "dia", "a", "papa"]
listaInvertida = []

def reverse(lista, listaInvertida):
    for i in range(len(lista)-1,-1,-1):
        listaInvertida.append(lista[i])
    
    return listaInvertida

print(reverse(lista, listaInvertida))