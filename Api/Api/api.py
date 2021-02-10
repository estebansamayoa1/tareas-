from flask import Flask 
from random import randint
import string



app=Flask(__name__)


def llenar(key):
   
    values=[]
    for i in range(0,key):
        values.append((randint(0,100)))
    return values

def linear_search(valores, value):
    if value in valores:
        return True
    else: 
        return False
       

def binary_search(arr, l, r, x): 
    x=int(x)
    while l <= r: 
        mid = l + (r - l) // 2
        if arr[mid] == x: 
            return True
        elif arr[mid] < x: 
            l = mid + 1
  
        else: 
            r = mid - 1
    return False


@app.route('/')
def home():
    return ("Bienvenido\n")

@app.route('/linear/<int:largo>/<int:key>/', methods=['GET'])
def linear(largo, key):
    valores=llenar(largo)
    if (linear_search(valores, key))==True:
        return ("El número si está en el arreglo\n")
    else:
        return ("El número no está en el arreglo\n")

@app.route('/binary/<int:largo>/<int:key>/', methods=['GET'])
def binary(largo, key):
    valores=llenar(largo)
    if (binary_search(valores, 0, len(valores)-1, key))==True:
        return ("El número si está en el arreglo\n")
    else:
        return ("El número no está en el arreglo\n")
    

if __name__ == "__main__":
    app.run(host="0.0.0.0", debug=True)