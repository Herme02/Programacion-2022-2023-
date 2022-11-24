'''14. Escribe una función que, dada una lista de cadenas, devuelva la cadena más larga.
Si dos o más cadenas miden lo mismo y son las más largas, la función devolverá la
que tenga el mayor número de caracteres repetidos .'''

cadena1 = "Esternocleidomastoidoe"

cadena2 = "Hotorrinolaringologooo"


def cadenaLarga(cadena1, cadena2):
    lista1 = ""
    lista2 = ""
    contador1 = 0
    contador2 = 0
    
    if(len(cadena1) > len(cadena2)):
        resultado = cadena1
    elif(len(cadena2) > len(cadena1)):
        resultado = cadena2
        
    else:
        for i in range(len(cadena1)):
            if(cadena1[i] not in lista1):
                lista1 += cadena1[i]
            else:
                contador1 += 1
                
        for j in range(len(cadena2)):
            if(cadena2[j] not in lista2):
                lista2 += cadena2[j]
            else:
                contador2 += 1
        
        if(contador1 > contador2):
            resultado = cadena1
        elif(contador2 > contador1):
            resultado = cadena2
        else:
            resultado = print("Los dos son totalmente del mismo tamaño")
                
        
    return resultado

print(cadenaLarga(cadena1, cadena2))