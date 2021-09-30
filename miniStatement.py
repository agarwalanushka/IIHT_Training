balance=0
wallet={100:2,200:3,500:10}
for i in wallet:
    balance=balance+(i*wallet[i])
print("Starting balance:",balance)
l=[]
while(True):
    print("To withdraw money ")
    amt=int(input("enter the amount to be withdrawn: "))
    if amt< (balance*90)/100:
        amt1=amt
        #print("check 90% balance")
        while(amt1!=0):
            if amt1%500==0:
                #print("check 500")
                if wallet[500]!=0:
                    if amt1/500<=wallet[500]:
                        
                        wallet[200]=int(wallet[500])-int(amt1/500)
                        amt1=0
                    else:
                        am1t=amt1-wallet[500]*500
                        wallet[500]=0
                else:
                    print("THIS DENOMINATION IS NOT AVAILABLE")
                    amt=0
                    break
                    
            elif amt1%200==0:
                print("check 200")
                if wallet[200]!=0:
                    if amt1/200<=wallet[200]:
                        
                        wallet[200]=int(wallet[200])-int(amt1/200)
                        amt1=0
                    else:
                        am1t=amt1-wallet[200]*200
                        wallet[200]=0
                else:
                    print("THIS DENOMINATION IS NOT AVAILABLE")
                    amt=0
                    break;
                
            elif amt1%100==0:
                #print("check 100",amt1)
                if wallet[100]!=0:
                    #print(wallet[100])
                    if amt1/100<=wallet[100]:
                        wallet[100]=int(wallet.get(100))-int(amt1/100)
                        #print(wallet[100],int(amt1/100),amt)
                        amt1=amt1-int(amt1/100)*100
                        #print(amt1)
                    else:
                        am1t=amt1-(int(wallet[100])*100)
                        wallet[100]=0
                        #print(amt1)
                    
                else:
                    print("THIS DENOMINATION IS NOT AVAILABLE")
                    amt=0
                    break;
                
            else:
                print("THIS DENOMINATION COMBINATION IS NOT AVAILABLE")
                amt=0
                break;
        balance=balance-amt
        l.append("withdrawn "+str(amt)+" remaining balance: "+str(balance))
        print("-----------------------------------------------------------------------------")
        print(l)
        print("-----------------------------------------------------------------------------")

    else:
        print("you don't have suffucient balance")
        
        
    ch=int(input("0. to continue press 0 \n1. to exit press 1 \n2. to view last 3 transactions press 2\n"))
    if ch==1:
        break
    elif ch==2:
        c=0
        print("-----------------------------------------------------------------------------")
        print("\t\t MINI STATEMENT \t\t")
        for i in reversed(l):
            print(i)
            c=c+1
            if c==3:
                break
        print("-----------------------------------------------------------------------------")
    print("Do you still want to continue :")
    ch1=input("enter choice: yes/ no \n") 
    if ch1=="no" or ch1=="NO":
        break
