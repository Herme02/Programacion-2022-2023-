'''6. Design a method called getNumberOfDigits that receives one number (it can be
real, integer, positive or negative) and should return the number of digits it contains. If
the parameter is not valid the method should return None. Extend this function to
other numeric systems (hexadecimal, decimal, binary, octal).'''

def getNumbersDigits(num):
    contadorDigit = 0
    num = str(num)
    
    for i in range(len(num)):
        if(num[i] != "."  and num[i] != "-"):
            contadorDigit += 1
       
    return contadorDigit

print(getNumbersDigits(1001))

