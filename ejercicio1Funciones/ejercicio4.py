'''4. Crea un programa que lea por teclado números de forma sucesiva y los guarde en
una lista; el proceso de lectura y guardado finalizará cuando metamos un número
negativo. En ese momento se mostrará el elemento mayor y los números pares.'''

lista = []

num = int(input("Dime un numero:"))
numMayor = num
numPares = []

while(num >= 0):
    lista.append(num)
    
    if(num > numMayor):
        numMayor = num
    
    if(num % 2 == 0):
        numPares.append(num)
    
    num = int(input("Dime un numero:"))
    
print("Numero mayor:",numMayor)
print("Numeros pares:",numPares)
