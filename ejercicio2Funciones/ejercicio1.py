'''1. Design a method called computeFactorial that receives a positive integer and
returns the factorial for that number. If the number is negative the method should
return None.'''

def computeFactorial(num):
    if(num > 0):

        factorial = 1
        
        contador = num
        
        if(num > 1):    
            while(contador >= 1):
                factorial *= contador
                contador -= 1
                
        return factorial
    
print(computeFactorial(7))
    