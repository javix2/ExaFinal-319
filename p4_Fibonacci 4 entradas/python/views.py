from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def index(request):
    return render (request,'form4.html')
    
def genera(request):
    num = int(request.GET["numero"])
    a=0;b=-1;c=1;d=0;f=0;res="";
    for i in range(num):
        f=a+b+c+d
        a=b
        b=c
        c=d
        d=f
        res+=str(f)+","
    #print(res)
    
    return render (request,'resp4.html', {"resp4":res})
