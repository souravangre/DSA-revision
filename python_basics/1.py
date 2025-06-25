print("________Calculator ________")
operations=["+","-","*","/"]
print(operations)
a=int(input("Enter first number"))
b=int(input("enter second number"))
o=input("choose the operation for two numbers")


def add(a,b):
    add=a+b
    print("The addition is",add)

def sub(a,b):
    sub=a-b
    print("The substraction is",sub)


def mul(a,b):
    mul=a*b
    print("The multiplication is",mul)   


def div(a,b):
    if b==0:
        print("Cannot divide by zero")
    else: div=a/b  
    print("The division is",div)

if o==operations[0]:
    add(a,b)
elif o==operations[1]:
    sub(a,b)
elif o==operations[2]:
    mul(a,b)
elif o==operations[3]:
    div(a,b)


