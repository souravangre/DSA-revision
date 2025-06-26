#Dictionary --> Collections of items stored in Key-Value pair
# Ordered collection

dict={
    "name":"sourav",
    "age":21,
    "address":"pune",
    "id": 1234
}
print(dict)

print(dict["name"])
print(dict.keys())
print(dict.values())

for key in dict.keys():
    print(dict[key])

print(dict.items())


#Dict methods

dic1={"name":"raghu","id":12,"score":99}
dic2={"age":33,"address":"Pune","salary":99000}

dic1.update(dic2)
print(dic1)

# dic1.clear() --> Clears the dict
# print(dic1)

dic1.pop("name")
print(dic1)

del dic1 #--> deletes the dict item or whole dict 

for i in dic2:
    print(i)