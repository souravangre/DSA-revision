# break statement is used to skip the part of the code,terminates the very loop it lies within

for i in range(12):
    if i==10:
        break
    print(5*(i+1))
print("Break executed after i is 10")

# continue statement is used to skip the iteration and execute further iteration 
for i in range(5):
    if i==3:
        print("skipped 3rd iteration")
        continue
    print("#"*i)  
    
