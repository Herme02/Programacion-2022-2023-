'''8. Diseñar una función que determine la cantidad de vocales diferentes, que tiene una palabra
o frase introducida por teclado. Por ejemplo, la cadena “Abaco”, devolvería 2.'''

def numVocales(cadena):
    vocales = "aeiou"
    contadorVocales = 0
    
    contadorNumVocales = [0,0,0,0,0]
    
    for i in range(len(vocales)):
        for j in range(len(cadena)):
            if((vocales[i] == cadena[j].lower()) and (contadorNumVocales[i] == 0)):
                contadorVocales += 1
                contadorNumVocales[i] += 1
        
    return contadorVocales


print(numVocales("Abaco"))