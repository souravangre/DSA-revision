# #sets
# # --> unordered collection of items.enclosed in { }
# # --> mutable and do not contain duplicate values

# s={1,2,1,3,4}
# print(s)
# print(len(s))

# #Empty set  --> empty_set = {} This is empty dict
# empty_set=set()
# print(type(empty_set))

# for i in s:
#     print(i)

#set methods

s2={1,2,3}
s3={3,4,5}

print(s2.union(s3)) # Union -- just joins the set
s2.update(s3)       # Union_update -- update the set
print(s2,s3)

city={"pune","mumbai","akola"}
city2={"nagar","satara","pune"}
city3=city.intersection(city2)  # Intersection -- just return common values
city.intersection_update(city2) # Intersection_update -- update the set
print(city3,city)

city4=city.symmetric_difference(city2)
print(city4)

# issuperset,isdisjoint,issubset,add,remove(Raise error),discard(Does not raise error)
# pop,del(deletes the set),clear(empty the set)