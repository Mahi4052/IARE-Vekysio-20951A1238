t=int(input())
for i in range(t):
  y,m,z,x=map(int,input().split())
  try:
    print((y*m)/(z*x))
  execpt:
    print("Don't enter zeros and negatives")
    
    
  
