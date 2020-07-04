n = int(input("Enter any odd number: "))
print()

for i in range(1, n//2+2):
    for j in range(1, n+1):
        if i == j or j == n - i + 1:
            print(j, end = "")
        else:
            print(" ", end = "")
            
    print()
    
'''
Sample pattern:
1             15
 2           14 
  3         13  
   4       12   
    5     11    
     6   10     
      7 9      
       8 
'''
