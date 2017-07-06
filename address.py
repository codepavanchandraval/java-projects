import requests
from bs4 import BeautifulSoup
val=input("provide the pincode number")
data=requests.get('https://pincode.net.in/'+val)
soup=BeautifulSoup(data.text,'html.parser')
data1=soup.find('div',{'class','articles'})
data2=data1.find_all('a')
for each in data2:
	print(each.string)
input();    
    