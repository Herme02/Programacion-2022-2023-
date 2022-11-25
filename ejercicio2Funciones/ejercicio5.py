'''5. Design a method called powerIt that receives two integers and raises the first
number to the second. You may use the product or recursion and check the values. If
no exponent is provided the first number is raised to 0.'''


def powerIt():
    
    num1 = int(input("Dime un numero"))
    opcion = input("Quieres un exponente?(S/N)")
    if(opcion == "S"):
        num2 = int(input("Dime otro numero"))
    else:
        num2 = 0
    
    
    resultado = num1 ** num2
    
    return resultado

print(powerIt())