a,b,c = 123 , 3.14 ,3-7j

print(a )
print(type(a))

print(b)
print(type(b))

print(c)
print(type(c))

global A
A  = 1000

def my_Funtion():
    print(A)

my_Funtion()


#           Python Data types

String = "Hello, World"         #str
print(String , type(String))

Int = 20                                    #int
print(Int , type(Int))

Float = 3.14                                #float
print(Float , type(Float))

Complex = 1 + 3j                    #complex
print(Complex , type(Complex))

List = list((1,2,3,"Hello" , 3.14) )      #list
print(List , type(List))

Tuple = tuple((1,2,3 ,'Hello' , 3.14))     #tuple
print(Tuple , type(Tuple))

Range = range(1, 100 ,2)            # range
print(Range , type(Range))

Dict = dict(Ram = 1 , Ravi =2 , Kavi = 3)       #dict
print(Dict , type(Dict))

Set = set((1,3,2))                  #set
print(Set , type(Set))

Frozenset = frozenset(('apple' , 'Orange' , 'Mango'))             #frozenset
print(Frozenset , type(Frozenset))

Boll = bool(1)                      #bool
print(Boll , type(Boll))

Byte = b'Hello, world'              #byte
print(Byte , type(Byte))


Bytearray = bytearray(5)            #bytearray
print(Bytearray , type(bytearray))


Memoryview = memoryview(b'5')
print(Memoryview , type(Memoryview))

















































