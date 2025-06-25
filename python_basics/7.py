#functions

#creation 
def calci(a,b):
    ans=(a+b)*(a-b)
    print(ans)


a=12
b=3
#fucntion call
calci(a,b)   

c=5
d=3
calci(c,d)

def Passfunction(a,b):  # pass keyword is used to keep the function empty without returning anything
    pass

# _____________________________________________________________________________________________________________

# Default arguments -- Provide a default value to a function ,functions assumes a default value even if no value is provided in a function call
def f1(name="tanish",lastname="angre"):  
    print("Hello",name,lastname)
f1()       
f1("sourav","angre")

 
#Keyword arguments -- provide the value with key and its value so that the order of the arguments do not matter
def f2(a,b):
    c=a+b
    print(c)
f2(b=12,a=2)


#Required args -- if we dont give key and its value in the function, we must give the value in correct order while calling the function

# Variable length args -- takes variable length of args for single argument (Takes tuples/Dict)

def f3(*numbers): #---> numbers taken in the form of tuple
    sum=0
    for i in numbers:
        sum=sum+i
        print(sum)

f3(12,3,4,1,12,12,4)

def f4(**name): #--> names taken as dictionary
    print("hello",name["fname"],name["mname"],name["lname"])

f4(fname="Bharati",lname="Angre",mname="Subhash")


# return statement --> used to return the value of the expression back to the calling fucntion
# Note --> Always first return statement is considered !
def f5(age=12):
    return age+3
    return age+2

ans=f5()
print(ans)