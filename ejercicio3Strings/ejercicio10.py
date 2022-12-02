'''10. Escribir una función que, devuelva el número de palabras que hay en una cadena que recibe
como parámetro. Ten en cuenta que entre dos palabras puede haber más de un blanco.
También al principio y al final de la frase puede haber blancos redundantes.
Por ejemplo, si la cadena es “He estudiado mucho”, debe devolver 3'''

def numPalabras(cadena):
    contadorPalabras = 1
    espacio = " "
    
    for i in range(len(cadena)):
        if(cadena[i] == espacio[0] and i != 0 and i!= len(cadena)-1):
            contadorPalabras += 1
            
    return contadorPalabras


print(numPalabras("He estudiado mucho"))