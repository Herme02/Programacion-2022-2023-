'''10. Design a method called isFriendNumber that receives two positive numbers and
returns True if the numbers are friends, False otherwise. Two numbers are
considered to be friends if the sum of its divisors, except the given number, is equal
to the second and vice versa.'''
def isFriendNumber(num1, num2):
    result = False
    
    sumaNum1 = 0
    
    for i in range(1, num1):
        sumaNum1 += i
    
    if(sumaNum1 == num2):
        result = True
    
    return result
    
    
print(isFriendNumber(5, 10))