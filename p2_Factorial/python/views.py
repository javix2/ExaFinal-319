from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def index(request):
    return render (request,'form2.html')
    
def genera(request):
    num = int(request.GET["numero"])
    f=1;res=""
    for i in range (num):
    
        f*=(i+1)
        res+=str(i+1)+"*"

    res+=' = '+str(f)
    return render (request,'respuesta2.html', {"respuesta2":res})
