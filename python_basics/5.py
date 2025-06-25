#Match case

x=int(input("enter a number"))

match x:                          
    case 0:                         
        print(x,"is zero")
    case 1:
        print(x,"is one")
    case _ if x !=100:
        print(x,"is not hundred")
    case _ :
        print("x is",x)            