# #Tuples --> Tuples are immutable and ordered
# # Enclosed in ( ) brackets

# tup=(1,2,3)
# print(type(tup),tup[1])
# # tup[0]=12 -----> Cannot be done with tuple
# # similar slicing as lists but immutable

# #manipulating tuples
# tuple=(12,3,54,6,7,12,7,9)
# ans=tuple.count(12)
# ans=tuple.index(6,1,5)
# print(ans)

# tuple2=("sourav","angre",21)
# tuple3=tuple+tuple2
# print(tuple3)

# To manipulate the tuple ,we need to convert the tuple into list,do operations and convert to tuple back
tup = (1, 2, 3, 4)

temp_list = list(tup)

temp_list[1] = 20
temp_list.append(5)
temp_list.remove(3)

tup = tuple(temp_list)
print(tup)  # (1, 20, 4, 5)

#F string
print(f"The tuple is {tup} and this is f string")

#Doc String --> It is a string literal that appears right the definition of function,method,class,module
def function(N):
    '''
    This is the function 
    '''
    print(N*2)
N=12
function(N)   
print(function.__doc__) 