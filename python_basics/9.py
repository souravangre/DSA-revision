# Lists --> Collection of data 
#  -- Mutable And Ordered
# enclosed in [ ] brackets


# colors=["red","@3h",34,True]
# print(colors)
# print(colors[2])
# colors[0]="Blue"
# print(colors)

# for i in colors:
#     print(i)

# if 34 in colors:
#     print("yes")
# else:
#     print("no")        

# #jump index --> Jumps 2 indexes
# arr=[1,2,3,4,5,6,7,8]
# print(arr[1:7:2]) 

# #Lists comprehension --> used for creating new lists from other iterables like lists,tuples,dict,sets,arrays,strings
# list1=["sara","miwe","kighu","byzezr"]
# list2=[i for i in list1 if "a" in i]

# print(list2)

# list3=[i for i in list1 if len(i)>4]
# print(list3)

#Lists Methods
# arr=[12,34,3,6,89,45,1]
# arr.sort()
# arr.append(2)
# print(arr.count(12))
# print(arr.index(89))
# print(arr)

# arr2=arr.copy()  #-->  Copies the content of arr into arr2 
# arr2[0]=123      #--> here the arr is not changed with changes in arr2
# print(arr)
# print(arr2)

# arr.insert(2,345)
# print(arr)

#Extend method
a=[1,2,3,4]
b=[5,6,7]
a.extend(b)
print(a)

# concatenation
c=a+b
print(c)
