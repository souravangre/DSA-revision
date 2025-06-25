#Strings

name="sourav"
print(len(name))

print(name[0])
print(name[2:5])
print(name[:4])
print(name[-1])
print(name[-5:-2])
print(name[:])

#String methods  --> Strings are immutable , if methods are carried on the strings ,it creates new strings

string="power Rangers @@@@"
print(string.upper())                     # Creates new sring with all upper letters
print(string.lower())
print(string.rstrip("@"))                 # strips/cuts the last characters with @
print(string.replace("Power","Strong"))
print(string.split(" "))                  # splits the strings at the specified instance and returns list
print(string.capitalize())                # converts the first letter to uppercase and rest to lowercase
print(string.count("@"))                  #counts the no of characters in string
print(string.endswith("P"))
print(string.find("O"))                   # return -1 if not found
print(string.index("w"))                  # raises exception if not found                 
print(string.isalnum())
print(string.isalpha())
