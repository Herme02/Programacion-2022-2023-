'''1. Design a function called charactersInString that has a character string and a character as
input parameters and returns how many times that character appears in the string. It should
do if the string and character are lower case or upper case characters.'''

def charactersInString(cadena, caracter):
    contadorNum = 0
    for i in range(len(cadena)):
        if(caracter.upper() == cadena[i].upper()):
            contadorNum += 1
    
    return contadorNum

print(charactersInString("Excelente", "e"))

