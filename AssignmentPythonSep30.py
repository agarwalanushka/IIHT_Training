'''

                            Online Python Compiler.
                Code, Compile, Run and Debug python program online.
Write your code in this editor and press "Run" button to execute it.

'''
class Project():
    def __init__(self,id,name,user):
        self.id=id
        self.name=name
        self.user=user
class Users():
    def __init__(self,id,name,salary):
        self.id=id
        self.name=name
        self.salary=salary
users_list=[]
users_list.append(Users(1,"Anushka",80000))
users_list.append(Users(2,"Sargam",60000))
users_list.append(Users(3,"Alisha",90000))
users_list.append(Users(4,"Chetan",30000))
users_list.append(Users(5,"Ramya",50000))
users_list.append(Users(6,"Shanti",30000))
users_list.append(Users(8,"Atul",15000))
for i in users_list:
    print(i.id,i.name,i.salary)
project_list=[]
project_list.append(Project("P1","project1",[i for i in users_list[:3]]))
project_list.append(Project("P2","project2",[i for i in users_list[4:6]]))
project_list.append(Project("P3","project3",[i for i in users_list[6:7]]))
for i in project_list:
    print(i.id,i.name,[[j.id,j.name,j.salary] for j in i.user])
    
#part 1
for i in project_list:
    print(i.id,i.name)
    l=[j.salary for j in i.user]
    for j in sorted(l):
        print(j,i.user)
    print("----------------------------------------------------------")
def print_details(salary,l):
    for i in l:
        if i.salary==salary:
            print(i.id,i.name,i.salary)
            
#part 2
d={}
for i in project_list:
    for k in i.user:
        d[i.name,k.name]=k.salary 
def get_key(value,d):
    for k,v in d.items():
        if v==value:
            return k
for i in sorted(d.values()):
    print(get_key(i,d),"salary",i)

            
#part 3
project_dic={}

def get_details(salary,l):
    for i in l:
        if i.salary==salary:
            return [i.id,i.name,i.salary]
            
for i in project_list:
    l1=[]
    l=[j.salary for j in i.user]
    for j in sorted(l):
        l1.append(get_details(j,i.user))
    project_dic[i.id,i.name]=l1

for k,v in project_dic.items():
    print(k,v)
    
