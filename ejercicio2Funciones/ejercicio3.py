'''3. Design a method called computeDaysInMonth that returns the number of days for
the month and year that are received as arguments. You may use the method
leapYear above. If the values are not valid the method should return -1.'''


def isLeapYear(year):
    leapYear = False
    
    if((year % 4 == 0) and (year % 100 != 0 or year % 400 == 0)):
        leapYear = True
        
    return leapYear



def computeDaysInMonth(month, year):
    
    dias = [0,31,28,31,30,31.30,31,30,31,30,31,30]

    if(isLeapYear(year) == True):
        dias[2] = 29
    
    if(month < 1 or month > 12) or (year < 0):
        days = -1
    else:
        days = dias[month]
        
    return days

print(computeDaysInMonth(2, 2024))
    
        
    