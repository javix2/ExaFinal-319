from django.contrib import admin
from django.urls import path
from . import views 

urlpatterns = [
    path('', views.index, name="index"),
    path('suma', views.suma, name="suma"),
    path('resta', views.resta, name="resta"),
    path('multiplica', views.multiplica, name="multiplica"),
    path('division', views.division, name="division")
]
