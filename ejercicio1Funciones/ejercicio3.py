'''3. Realiza un programa que solicite la fecha como tres datos numéricos (día, mes y
año) y muestre a continuación la fecha en formato largo.
Introduce el día de la fecha: 15
Introduce el mes de a fecha: 3
Introduce el año de a fecha: 2009
La fecha en formato largo es 15 de Marzo de 2009
Debe validar los datos y ejecutarse hasta que se introduzca un día negativo.'''

dias = [0,31,28,31,30,31.30,31,30,31,30,31,30]
meses = [" ","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]


dia = int(input("Dia:"))

while(dia > 31):
    print("El dia introducido no existe vuelva a introducirlo")
    dia = int(input("Dia:"))

    
mes = int(input("Mes:"))

while(mes < 1 or mes > 12):
    print("El mes introducido no existe vuelva a introducirlo")
    mes = int(input("Mes:"))

    
ano = int(input("Año:"))

while(ano < 0):
    print("El año introducido no existe vuelva a introducirlo")
    ano = int(input("Año:"))


if((ano % 4 == 0) and (ano % 100 != 0 or ano % 400 == 0)):
    dias[2] = 29


while(dia > 0):
    for i in range(len(dias)):
        if(i == mes):
            if(dia > dias[i]):
                print("El dia introducido es erroneo, ya que no concuerda con el mes")
            
            else:
                print("La fecha en formato largo es",dia,"de",meses[i],"de",ano)
    
    
            
    dia = int(input("Dia:"))

    while(dia > 31):
        print("El dia introducido no existe vuelva a introducirlo")
        dia = int(input("Dia:"))
    
        
    mes = int(input("Mes:"))
    
    while(mes < 1 or mes > 12):
        print("El mes introducido no existe vuelva a introducirlo")
        mes = int(input("Mes:"))
    
        
    ano = int(input("Año:"))
    
    while(ano < 1):
        print("El año introducido no existe vuelva a introducirlo")
        ano = int(input("Año:"))
                
                