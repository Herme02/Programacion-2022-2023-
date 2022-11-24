'''10. Diseña una función conversor que convierta un número de binario a decimal o de
decimal a binario. Esta función recibirá un número en formato de cadena de texto
cuya última posición indica el sistema numérico utilizado (D-decimal, B-binario).

Debe validar la información, así, por ejemplo, el número ‘1020101B’ no sería válido
puesto que los valores en binario son 0 y 1.'''


num = input("Dime un numero binario o decimal:")
diferenciasBinario = 0


def conversor(num):
    
    conversionFinal = []
    
    if(num[len(num)-1] == "D"):
        conversion = []
        
        num = int(num[0 : -1])
        
        cociente = num
        while(cociente > 1):
            resto = cociente % 2
            conversion.append(int(resto))
            cociente /= 2
            
        for i in range(len(conversion)-1,-1,-1):
            conversionFinal.append(conversion[i])
        
        
        
    elif(num[len(num)-1] == "B"):
        resultado = 0
        
        num = num[0 : -1]
        
        
        for i in range(len(num)):
            if(num[i] == "1"):
                resultado += 2 ** i
        
        conversionFinal.append(resultado)
    
    return conversionFinal
    
    
    
    
if(num[len(num)-1] == "B"):
    
    for i in range(len(num)):
        if(num[i] != "0" and num[i] != "1"):
            diferenciasBinario += 1
    
    if(diferenciasBinario == 1):
        print(conversor(num))

elif(num[len(num)-1] == "D"):
    print(conversor(num))
    