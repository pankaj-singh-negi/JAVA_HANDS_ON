//Identifiers and Reserved Words in Java

//-----------------------------------------------------------------------------------<<<<1.Identifiers>>>>---------------------------------------------------------------------------------------

//Identifier:-A name in Java Program is called Identifier which can be used for identification purpose.It can be used for naming variables,methods,classes,packages and interfaces.

/*
Ex:-How many identifiers are there in the below program and what are they?
class Test
{
    public static void main(String args[])
    {
        int a=10; 
        
    }
}

Identifiers:-  5  ----->Test(class name),main(method name),args(array name),a(variable name),String(Predefinedclass name)


//----------------------------------------------------------------<<<<2.Rules to create/or define Identifiers in Java>>>>-------------------------------------------------------------------------


1.Java allows only the following characters for identifiers:-
   a.Alphabets(A-Z,a-z)
   b.Digits(0-9)
   c.Underscore(_)
   d.Dollar($)
if we are using any other characters except these we will get compile time error.

Ex:- total_number ----->valid
     total#number   ----->invalid



2.Identifiers should not start with digits(0-9)
Ex:- 1number   ----->invalid
     number1   ----->valid



3.Java Identifiers are case sensitive of course java language itself is treated as case sensitive language.
Ex:- Number,number,NUMBER are three different identifiers.(We can diffrentiate wrt case sensitivity)

4.There is no length limit for identifiers in Java.But it is not recommended to take too lengthy identifiers.
Ex:- a,ab,abc,abcd,abcde,abcdef,abcdefgh,abcdefghi,abcdefghij,abcdefghijklmno,pqrstuvwxyz are all valid identifiers.

5.We should not use white spaces in between the identifiers.
Ex:- total number  ----->invalid
     total_number  ----->valid



6.We should not use reserved words as identifiers in Java.
Ex:- 
        int    ----->invalid
        Int    ----->valid
        INT    ----->valid
        integer----->valid



7.All predefined class and interface names in Java are valid identifiers but it is not recommended to use them as identifiers as it reduces the readability of the program and creates confusion.
Ex:- String,Runnable,System,Math,List,ArrayList etc are all valid identifiers.

EX:-class Test
{
    public static void main(String args[])
    {
        int String=10;  //valid
        int Runnable=20; //valid

}}


Questions:-
1.Which of the following are valid identifiers in Java?
   a.total#number---->invalid
   b.total_number--->valid
   c.1number---->invalid
   d.number1--->valid
   e.int---->invalid
   f.Int--->valid
   g.Integer--->valid
   h.String--->valid
   i.$value--->valid
   j._value--->valid
   k.total number   --->invalid
   l.ca$h--->valid
   m._$_$_$--->valid
   n.abcdefghijabcdefghijabcdefghijabcdefghij--->valid



----------------------------------------------------------------<<<<2.Reserved Words in Java>>>>-------------------------------------------------------------------------

1.In Java,Some words are reserved to represent some meaning or functionality.These words are called Reserved Words or Keywords.There are total 53 reserved words in Java.

Reserved Words(53) in Java:-

Keywords(50):-Reserved words to represent functionality in Java.
Used Keywords(48)
Unused Keywords(2):-goto, const


Reserved Literals(3):- Reserved words to represent some constant values in Java.
Ex:-true,false,null


i>Keywords for Primitive Data Types(8):-
1.byte
2.short
3.int
4.long 
5.float
6.double
7.char
8.boolean


ii>Keywords for Control Statements(11):-
1.if
2.else
3.switch
4.case
5.default
6.while
7.do
8.for
9.break
10.continue
11.return

iii>Keywords for Object Oriented Programming(11):-
1.class
2.interface
3.extends
4.implements
5.new
6.this
7.super
8.package
9.import
10.instanceof
11.enum(1.5 version)


iv>Keywords for Exception Handling(5):-
1.try
2.catch
3.finally
4.throw
5.throws
6.assert(1.4 version)

v>Keywords for Access Specifiers(4):-
1.public
2.private
3.protected
4.default

vi>Keywords for Modifiers(6):-
1.static
2.final
3.abstract
4.synchronized
5.native
6.strictfp(1.2 version)
7.transient
8.volatile

vii>return type keywords(1):-
1.void



Unused Keywords(2):-
1.goto-->Usage of goto created several problems in old languages and hence sun people banned the usage of goto in java.
2.const-->const is used to declare constant values in C and C++.But in java we can declare constant values by using final keyword.Hence sun people banned the usage of const.

goto and const are unused keywords in java and if we are using them we will get compile time error.



In java ,return type is mandotory .if a method is not returning any value then we should use void keyword as return type.But in C and C++ return type is optional and default return type is int.



Reserved Literals(3):-
1.true  --->boolean literal to represent true value
2.false --->boolean literal to represent false value
3.null  --->literal to represent null value,default value for all object references



enum keyword(1.5 version) is used to declare enum class in java.it is used to represent group of named constant values.

enum Months {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;}



----------------------------------------------------------------Conclusions------------------------------------------------------------------------

1.All 53 reserved words in java contains only lowercase letters.
2.In java,we have only new keyword but there is no delete keyword because java has automatic garbage collection.
3.The following are new keywords introduced in different versions of java.
   a.enum(1.5 version)
   b.assert(1.4 version)
   c.strictfp(1.2 version)


Q>Which of the following contains only reserved words in Java?

1.new , delete  ----->invalid
2.goto , constant  ----->invalid
3.break , continue , return , exit ----->invalid
4.final , finally , finalize ----->invalid
5.throw , throws , thrown ----->invalid
6.notify , wait , notifyAll ----->invalid
7.implements , extends , imports ----->invalid
8.sizeof , instanceof ----->invalid
9.instanceOf , strictFp ----->invalid
10.byte , short , Int---->invalid

Answer:None of the above 


Q>Which of the following are reserved words in Java?
a.public---->valid
b.static---->valid
c.void---->valid
d.main---->invalid
e.String---->invalid
f.args---->invalid

 */