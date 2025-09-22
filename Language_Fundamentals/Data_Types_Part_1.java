//DATA TYPES IN JAVA PART-1

/*
1.>>In java ,Every variable and evry expression has some data type associated with it.Each and every data type is clearly defined.Every assignment should be checked for type compatibility by the compiler at compile time itself.


Because of the above reasons ,we can conclude java language is a strongly typed language.

2.>>Java is not considered as pure object oriented language because several oops features are not satisfied by java like operator overloading, multiple inheritance etc.

Moreover, we are depending on primitive data types which are non objects.

-------------------------------------------------------------------------------Primitive Data Types in Java--------------------------------------------------------------
There are 8 primitive data types in java.

i.>>Numeric Data Types
1.Integral Data Types -->byte,short,int,long
2.Floating Point Data Types-->float,double


ii.>>Non-numeric Data Types
1.Boolean Data Type -->boolean
2.character Data Type -->char


Except char and boolean ,remaining data types are considered as signed data types because we can represent both positive and negative numbers.



1.>>Byte Data Type
Size-->1 byte(8 bits)
Range-->-128 to 127 (inclusive)
Default Value-->0   
Max Value-->127
Min Value-->-128    
Wrapper Class-->java.lang.Byte

The most significant bit(MSB) is used as sign bit(0 for positive and 1 for negative) and remaining bits represents the value.
Positive numbers will be represented as it is in binary form.
Negative numbers will be represented in 2's complement form.
For example:-
+5 in binary form -->00000101   
-5 in binary form -->11111011 (1's complement)-->11111100 (2's complement)

Ex:1-
public class Data_Types_Part_1 {
    public static void main(String[] args) {
        // byte b=128; //CE: incompatible types: possible lossy conversion from int to byte
        // byte b=10.5; //CE: incompatible types: possible lossy conversion from double to byte
        // byte b= true; //CE: incompatible types: boolean cannot be converted to byte
        // byte b = "Hello" ; //CE: incompatible types: String cannot be converted to byte

        System.out.println(b);
    }
}

---->Byte is best choice if we want to handle the data in terms of streams either from the file or from the network (File supported form  or network supported form is in bytes only).


2.>>Short Data Type
Size-->2 bytes(16 bits)
Range-->-32,768 to 32,767 (inclusive)
Default Value-->0
Max Value-->32,767
Min Value-->-32,768
Wrapper Class-->java.lang.Short
This is the most rarely used data type in java.

Ex:2-
public class Data_Types_Part_1 {
    public static void main(String[] args) {
        // short s = 32768; //CE: incompatible types: possible lossy conversion from int to short
        // short s = 10.5f; //CE: incompatible types: possible lossy conversion from float to short
        // short s = true; //CE: incompatible types: boolean cannot be converted to short
        // short s = "Hello"; //CE: incompatible types: String cannot be converted to short
        short s = 10; //valid
        

        System.out.println(s);
    }
}

--->Short data type is best suitable for 16 bit processors like 8085 but these processors are completely outdated and hence corresponding short data type is also rarely used now-a-days.

3.>>Int Data Type
Size-->4 bytes(32 bits)     
Range-->-2,147,483,648 to 2,147,483,647 (inclusive)
Default Value-->0
Max Value-->2,147,483,647
Min Value-->-2,147,483,648
Wrapper Class-->java.lang.Integer
This is the most commonly used data type in java.

Ex:3-
public class Data_Types_Part_1 {
    public static void main(String[] args) {
        // int i = 2147483648; //CE: integer number too large
        // int i = 10.5; //CE: incompatible types: possible lossy conversion from double to int
        // int i =2147483648l; //CE: incompatible types: possible lossy conversion from long to int
        // int i = true; //CE: incompatible types: boolean cannot be converted to int
        // int i = "Hello"; //CE: incompatible types: String cannot be converted to int
        int i = 10; //valid

        System.out.println(i);
    }
}





 */






