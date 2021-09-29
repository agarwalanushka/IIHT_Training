l=[["Anushka","anushka@gmail.com",098786],["Sargam","sargam@gmail.com",1233456],
   ["Raju","raju@gmail.com",765432],["Samay","samay@gmail.com",56478]]

with open('sample.txt','w') as file:
    for i in l:
        file.write(str(str(i)+"\n"))

file2=open('sample.txt','r')
file2.read()
