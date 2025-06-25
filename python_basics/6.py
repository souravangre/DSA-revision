#For loops 

for i in range(6):
    for j in range(i):
        print("#",end=" ")
    print("")    
        
for i in range(5):
    for j in range(i):
        print(i,end=" ")
    print()  

for i in range(5):
    for j in range(i):
        print(j,end=" ")
    print()  

#while loops  -->  executes until the condition is true

a=0
while a<=10:
    c=a+1
    print(c)
    a+=1
print()        

count=5
while count >0:
    print(count)
    count-=1