'''7. Design a method called isPrime that receives one integer positive number greater
than 0 as parameter. The method should return True if the number is prime or False if
not prime. If the parameter is not valid the method should return None.'''

def es_primo(num):
    
    if(num > 0):
    
        esPrimo = True
        
        if(num > 2):
            for i in range(2, num):
                if(num % i) == 0:
                    esPrimo = False
    
        return esPrimo
    
    
print(es_primo(7))








