'''7. Diseñar una función que reciba como parámetro tres cadenas, la primera será una frase y
deberá buscar si existe la palabra que recibe como segundo parámetro y reemplazarla por la
tercera.'''

def reemplazar(cadena1, cadena2, cadena3):
    cadenaCambiada = ""
    cadena2Validacion = ""
    i = 0
    
    while(i < len(cadena1)):
    
   
        if(cadena1[i] != cadena2[0]):
            cadenaCambiada += cadena1[i]
            i += 1
        else:
            
            for j in range(len(cadena2)):
                if(i < len(cadena1)):
                    if(cadena2[j] == cadena1[i]):
                        cadena2Validacion += cadena2[j]
                        i += 1
                        if(i == len(cadena1)):
                            cadenaCambiada += cadena2Validacion
                    else:
                        cadenaCambiada += cadena2Validacion
                        cadenaCambiada += cadena1[i]
                        i += 1
                        cadena2Validacion = ""
                        
            if(cadena2 == cadena2Validacion):
                cadenaCambiada += cadena3
                cadena2Validacion = ""
    
    return cadenaCambiada

print(reemplazar("Mi primo Adrian se llama Adrian Adria", "Adrian", "Javier"))

