'''9. Crear una función que, tomando una cadena de texto como entrada, construya y devuelva
otra cadena formada de la siguiente manera: el método debe colocar todas las consonantes
al principio y todas las vocales al final de la misma, eliminando los blancos.
Por ejemplo, pasándole la cadena "curso de programacion", una posible solución sería
"crsdprgrmcnuoeoaaio'''

def colocacion(cadena):
    cadenaColocada = ""
    
    vocales = "aeiou"
    consonantes= "bcdfghjklmnñpqrstvwxyz"
    
    for i in range(len(cadena)):
        for j in range(len(consonantes)):
            if(cadena[i] == consonantes[j]):
                cadenaColocada += consonantes[j]
                
    
    for i in range(len(cadena)):
        for k in range(len(vocales)):
            if(cadena[i] == vocales[k]):
                cadenaColocada += vocales[k]
                
    return cadenaColocada


print(colocacion("curso de programacion"))