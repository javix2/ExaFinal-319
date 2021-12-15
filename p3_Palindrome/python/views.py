from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def index(request):
    return render (request,'form3.html')
    
def verifica(request):
    pal = request.GET["palabra"]
    res="";
    if str(pal) == str(pal)[::-1] :
        res ="Palindrome"
    else:
        res ="No es Palindrome"
    
    return render (request,'resp3.html', {"resp3":res})