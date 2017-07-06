import requests
from bs4 import BeautifulSoup
state=input("provid your state in capital and if there is space in between use underscore")
dist=input("provid your dist in capital and if there is space in between use underscore")
latter=input("provid your  post office first latter in capital")
office=input("provid your post office name in capital and if there is space in between use underscore")

data=requests.get('https://pincode.net.in/'+state+'/'+dist+'/'+latter+'/'+office)
soup=BeautifulSoup(data.text,'html.parser')
data1=soup.find_all('h2')
for each in data1:
	sta=each.find('a')
	if sta :
		print(sta.string)
input()