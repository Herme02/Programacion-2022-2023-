'''6. Realizar una función que busque una palabra escondida dentro de un texto. Por ejemplo, si
la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”, entonces si se
encontrará y deberá devolver True, en caso contrario deberá devolver False.'''

def palabraEscondida(cadena, palabraEncontrar):
    resultado = False
    
    
    
    encontrada = ""
    for i in range(len(palabraEncontrar)):
        j = 0
        
        if(palabraEncontrar[i] == cadena[j]):
                encontrada += palabraEncontrar[i]
        else:
        
            while(palabraEncontrar[i] != cadena[j]):
                j += 1
                if(palabraEncontrar[i] == cadena[j]):
                    encontrada += palabraEncontrar[i]
        
    
    if(encontrada == palabraEncontrar):
        resultado = True

    return resultado

print(palabraEscondida("shybaoxlna", "hola"))