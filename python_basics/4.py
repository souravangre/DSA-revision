# conditionals

a=int(input("enter a number"))
if a%2==0:
    print(a,"is even")
else:
    print(a,"is odd")    

# nested

b=int(input("enter number"))
if b<=0:
    print(b,"is negative")

elif b>0:
    if b>9 and b<100:
        print("two digit no")
    elif b>0 and b<10:
        print("one digit") 
    else:
        print("greater than two digit")           
print("Done")