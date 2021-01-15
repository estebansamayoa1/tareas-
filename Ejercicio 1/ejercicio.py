
def suma(num):
    if num>=1:
        return num+suma(num-1)
    else:
        return num




num=int(input("Ingrese un número\n"))
total=suma(num)
print(f"El resultado de la suma es: {total}")
