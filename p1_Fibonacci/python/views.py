from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def index(request):
    return render (request,'form.html')
    
def genera(request):
    num = int(request.GET["numero"])
    a=0;b=1;f=0;res="";
    for i in range(num):
        f=a+b
        b=a
        a=f
        res+=str(f)+","
    
    return render (request,'respuesta.html', {"respuesta":res})
