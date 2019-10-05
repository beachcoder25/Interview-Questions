import math

def complement(n):
    s = ''
    i = math.floor(math.log(n, 2))

    while n > 0:
        if 2**i <= n:
            s += '1'
            n -= 2**i 
        else:
            s += '0'
        i -= 1 
    
    for x in range(i+1):
        s += '0'
    print('Binary:', s)

    comp = 0
    for i in range(len(s)):
        if s[len(s)-i-1] == '0':
            comp += 2**(i) 
    return comp 

n = 10
print(complement(n))