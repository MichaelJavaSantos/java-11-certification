## java-11-certification

```
javac -d ./[directory destnation to compilade classes]

java -cp ./[.class flies directory] [classname]
```

## Primitive types

|     | byte   | short   | int            |long                        | float         | double                   |
|-----|--------|---------|----------------|----------------------------|---------------|--------------------------|
|     | 1 byte | 2 bytes | 4 bytes        | 8 bytes                    | 4 bytes       | 8 bytes                  |
| Min | -128   | -32,768 | -2,147,483,648 | -9,223,372,036,854,775,808 | 1.4E-45       | 4.9E-324                 |
| Max | 127    | 32,767  | 2,147,483,647  | 9,223,372,036,854,775,807  | 3.4028235E+38 | 1.79769313348623157E+308 |


| boolean                     | char                                             |
|-----------------------------|--------------------------------------------------|
| 1 bit                       | 2 bytes                                          |
| Stores true or false values | Stores a single character/letter or ASCII values |



Smaller types are automaticaly casted (promoted) to bigger types:
> byte->short->char->int->long->float->double


### Declare and Initialize

```
int    a = 0b101010; // binary
short  b = 052;      // octal
byte   c = 42;       // decimal
long   d = 0x2A;    // hex
float  e = 1.99E2F;
double f = 1.99;

long   g = 5, h = c;
float  i = g;
char   j = 'A';
char   k = '\u0041', l = '\101';

int    s;
s = 77;

####################  OUTPUT #####################

int a::: 42   s::: 77
short b::: 42
byte c::: 42
long d::: 42   g::: 5   h::: 42
float e::: 2   i::: 5.0
double f::: 1.99
char j::: A   k::: A   l::: A

```

### Not to do with primitives

```

byte a;
byte b = a;       //  a not initialyzed

byte c = 128;     // byte max is 127

int d = 42L;      // long é maior que int, 42 without L is valid

float e = 1.2     // 1.2 is a double, 1.2 is a float number

char f = "a";
char g = 'AB';

boolean h = "true";
boolean i = 'false';
boolean j = 0;
boolean k = False;

```




