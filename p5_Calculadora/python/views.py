from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def index(request):
    return render (request,'form5.html')

def suma(request):
    num1 = int(request.GET["num1"])
    num2 = int(request.GET["num2"])

    return render (request,'resp5.html', {"resp5":num1+num2})
    

def resta(request):
    num1 = int(request.GET["num1"])
    num2 = int(request.GET["num2"])

    return render (request,'resp5.html', {"resp5":num1-num2})

def multiplica(request):
    num1 = int(request.GET["num1"])
    num2 = int(request.GET["num2"])

    return render (request,'resp5.html', {"resp5":num1*num2})
    
def division(request):
    num1 = int(request.GET["num1"])
    num2 = int(request.GET["num2"])
    if num2 == 0:
        res = "no es posible dividir entre cero"
        return render(request, "resp5.html", {"resp5": res})
    else:
        res = num1 / num2
        return render(request, "resp5.html", {"resp5": res})
