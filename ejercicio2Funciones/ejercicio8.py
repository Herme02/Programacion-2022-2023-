'''8. Design a method called solveSecondOrderEquation that receives three integer
positive numbers corresponding to the coefficients of a second order equation
(ax2+bx+c=0) and computes its possible solutions. If the parameters are not valid the
method should return None.'''
import math


def solveSecondOrderEquation(a,b,c):
    listaResultados = []
    
    contenidoRaiz = b**2 -4*a*c
    
    xMas = (-b + math.sqrt(contenidoRaiz)) / (2 * a)
    
    xMenos = (-b - math.sqrt(contenidoRaiz)) / (2 * a)

    listaResultados.append(xMas)
    listaResultados.append(xMenos)
    
    return listaResultados
    
print(solveSecondOrderEquation(2, 3, 4))

