import requests
from datetime import datetime



#api key = c1f88bf8bb7eeca54fe63ecc3a0658da
#api url = api.openweathermap.org/data/2.5/weather?zip=30030,us&appid=c1f88bf8bb7eeca54fe63ecc3a0658da

user_id = 'Rbrook46'
user_apiid = 'http://api.openweathermap.org/data/2.5/weather?zip=30144,us&appid=c1f88bf8bb7eeca54fe63ecc3a0658da'

response = requests.get(user_apiid)

data = response.json()
print(user_id)
#Name
print('Name: '.ljust(30) + data["name"])

#Current Temperature (converted from K to F)
temp = ((data["main"]["temp"])*9/5) - 459.67
print('Current Temperature: '.ljust(30) + "%.1f" % temp, "degrees Fahrenheit")

#Atmospheric Pressure
pressure = data["main"]["pressure"]
print('Atmospheric Pressure: '.ljust(30) + str(pressure), 'hPa')

#Wind Speed (converted to kpm)
mph = (data["wind"]["speed"]) * 0.621371
print('Wind Speed: '.ljust(30) + "%.1f" % mph, 'mph')

#Wind Direction
print('Wind Direction: '.ljust(30) + "%.1f" % data["wind"]["deg"])

#Time of report(converted to local time)
report_time = datetime.fromtimestamp(data["dt"])
local = datetime.now()
difference = local - report_time
time = difference + report_time
print('Time of Report: '.ljust(30) + str(time))
