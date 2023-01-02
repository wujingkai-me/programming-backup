# Java程序笔记

## 流程控制语句

### if语句

if-else语句

```java
if(){ }
else { }
```

if-else if-else语句

```java
if() { }
else if() { }
else {}
```

> 值得注意的是如果只有一条语句，那么 `{ }` 将不用写。

### switch 语句

```java
switch() {
	case 1:
    System.out.println();
    break;
  default:
    throw new Exception();
}
```

## 循环结构

for循环

```java
for(int i = 0; i < 3; i++) { }
for(;;;) { } // 相当于死循环 相当于 while(true)
```

do-while循环

```java
do{
  
}while();
```

while循环

```java
while(){ }
```

## 类

```java
public class What{
  private String name;
  protected byte isBoy;
  Object User;
  public int value;
}
```

- `private` 私有方法只可以在该类中使用
- `protected` 同一个类和继承该类的类中使用
- `default` 默认，可以在该包和该类中使用
- `public` 可以跨包和跨类使用

类中默认会有一个对于该类的构造方法，不需要特别的写明。并没有写，但是它就在那儿。

```java
public class What{
  public What(){ }
}
```

类中同样可以写出一个带有参数的构造方法，但是，如果写明了构造方法，那么无参的默认构造方法将会被删除

```java
public class What{
	public What(int t) { }
  // public What() { }
}
```

在类中会有三种关系

1. 封装：`private` 关键词使得某些属性只可以在该类中使用
2. 继承：`extends` 关键字可以使某些方法可以继承到子类中来，子类可以重构父类中的方法，通过子类可以使用`super()` 关键字来指明父类对象
3. 多态：**在经过继承关系后**，使用父类的类型引用子类的对象就成作为多态

```java
class Object { }
class Mouse extends Object{ }

class Main{
  public static void main(String[] args){
  	Object mouse = new Mouse(); // yes
    Mouse reallyMouse = (Mouse) mouse; // yes
  }
}
```

>继承了类中可以使用@Override 对类进行重载，@Override好处是可以使Java编译器知道我们正在重载父类中的方法，对我们提供代码的检查

## 包装类

Java中有很多对应基本类型而形成的包装类其目的主要是为了可以使用类中的一些方法和属性

```java
class Main{
  public static void main(String[] args){
  	Integer n = new Integer(1);
    int n1 = n.intValue();
    
    Boolean n = new Boolean(true);
    boolean n1 = n.booleanValue();
    
    Character n = new Character('1');
    char n1 = n.characterValue();
    
    ...   
  }
}
```

在包装类中还有两种特征

- 自动装箱（Boxing）
- 自动拆箱（Unboxing）

```java
class Main{
  public static void main(String[] args){
  	Integer n = 1; // Boxing
    int n = new Interger(1); // Unboxing
  }
}
```

## 抽象类和接口

抽象类和接口的定义十分相似。

接口更多的用来定义类中代码的规范性，而抽象类更多的是定义方法的共享

```java
// Demo.java
// Interafce
public Interface Demo {
  // finnal int n = 10; 这样没有问题但是，没有什么意义
  public abstract void eat();
  default void run() {
    System.out.println("Running"); // 接口中可以实现功能但是避免这么做
  }
}

// 使用接口但是这是另一个文件
// useageDemoInterface.java
public class UseageDemoInterface implements Demo { 
	@Override
  public void eat() { 
  	System.out.println("to eat");
  }
}
```

```java
// abstract
public abstract class Demo {
  public void run() {
    System.out.println("Running");
  }
}

public class DemoBrother extends Demo { } // That's OK.
```

## 泛型

Java中的泛型可以使参数的传递更加灵活多变

```java
class Main{
  public static void main(String[] args){
    show("String");
    show("Integer" + 1);
    show(true);
    show(1.1);
  }
  
  public static <T> void show(T name) {
    System.out.println(name);
  }
}
```

同时可以指定两个参数甚至多个作为泛型类的参数

```java
public static <T, V> void show(T name, V value) {
  System.out.println(name + "=" + value);
}
```

## Java内置的接口

Collection<>

```java
Collection<String> collection = new ArrayList<>();

list.add("a");
list.add("b");
list.add("c");
list.add(1, "c");

Collections.addAll(collection, "a", "b", "c"); // 注意这个是Collection[s]

collection.remove("a");

collection.clear();

collection.isEmpty();

collection.contains("a");
```

将Collection转换为数组

```java
Object[] newObject = collection.toArray();
String[] s = collection.toArray(new String[3]);
```

List<>  与Collection不同的是List扩展了Collection的功能支持通过下标来获得数组

```java
List<String> list = new ArrayList<>();
Collections.addAll(list, "a", "bb", "c");

System.out.println(list);

System.out.println(list.indexOf("a"));

System.out.println(list.lastIndexOf("a"));

System.out.println(list.subList(0, 2));
```

Set<> 集合

```java
Set<String> set1 =
  new HashSet<>(Arrays.asList("a", "b", "c"));

Set<String> set2 =
  new HashSet<>(Arrays.asList("b", "c", "d"));

// 并集运算 Union
set1.addAll(set2);

//交集运算 Intersection
set1.retainAll(set2);

// 差集运算 Difference
set1.removeAll(set2);

// 转换为数组
set1.toArray();
```

Queue<>

```java
Queue<String> queue = new ArrayDeque<>();
queue.add("c");
queue.add("b");
queue.add("a"); // return Exception, when queue get full.
queue.offer("c"); // return false

// var front = queue.element(); // return exception when queue get empty
var peek = queue.peek(); // return false

// queue.remove();  // return exception
// queue.poll(); // return null

System.out.println("peek=" + peek);
// System.out.println("front=" + front);
// System.out.println(queue);
// System.out.println(queue.size());

System.out.println(queue);
```

hashMap<K, V> hashMap**不可迭代 **Key=Value

```java
// key: String
// value: object(customer)
Map<String, Customer> map = new HashMap<>();

/*
	map.get("e10"); // 通过key获取如果不存在得到一个false
	map.getOrDefault("key", default) //  通过key获取如果不存在得到一个default
	
	map.containsKey("key")  // 如果key不存在将会返回一个false，否则返回true
	
	map.keySet() // 获得一个之后key的结合  可迭代
	
	map.entrySet() // 获得一个key和value的集合 key=value 可迭代
		key.getKey()  // 通过entrySet迭代获得Key和Value
		key.getValue()
	
	map.values()  // 获得所有值 可迭代
	
*/
    for(var key: map.keySet())
      System.out.println(key); // each key, not value
    
    for(var key: map.entrySet()){
      System.out.println(key); // you get "key=value" like this.
      System.out.println(key.getKey());
      System.out.println(key.getValue());
    }

    for(var entry: map.values())
      System.out.println(entry);
```

## Lambda表达式的写法

```java
public static void methods(Interface i) {  Interface.print("HELLO WORLD");
} 
Lamabda
  - methods(new Interface(){ @Override })
  - methods(() -> {})

  + methods(Object/Class::methods)
    + methods(Demo::new) equals methdos(message -> new Demo(message))
    + methods(System.out::println)

  * Interface variable = (message) -> System.out.println();

```

## Stream流

不作存储仅仅只是做处理

- 命令式编程(if/else/for)
- 声明式编程(方法的调用)

```java
List<Movies> movies = List.of(
  new Movies("a", 10),
  new Movies("b", 20),
  new Movies("c", 30)
);

// 命令式编程(if/else/for)
int count = 0;
for(var movie: movies)
  if(movie.getLikes() > 10)
    count++;

// 声明式编程(方法的调用)
long count2 = movies.stream()
  .filter(movie -> movie.getLikes() > 10)
  .count();
```

- 可以通过对象名`.stream()` 得到一个stream对象
- `.filter` 获取一个满足条件的内容
- `.count` 获取以满足条件内容的个数

```java
movies.stream()
  .mapToInt(number -> number.getLikes()) // map(), mapToDouble, mapToLong
  .forEach(n -> System.out.println(n));
```

---

其他的

```java
int[] numbers = { 1, 2, 3 };
Arrays.stream(numbers)
  .limit(3)
  .forEach(n -> System.out.println(n));
```

从Stream中获取一个可迭代对象 `Stream.iterate()`

```java
Stream.iterate(1, n -> n + 1)
  .limit(10)
  .forEach(n -> System.out.println(n));
```

Skip方法

```java
List<Movies> movies = List.of(
  new Movies("a", 10),
  new Movies("b", 20),
  new Movies("c", 20)
);

movies.stream()
  .skip(2) // 跳过两个对象得到了 new Movies("c", 20)
  .forEach(m -> System.out.println(m.getTitle()));
```

takeWhile方法

```java
List<Movies> movies = List.of(
  new Movies("a", 10),
  new Movies("b", 20),
  new Movies("c", 20)
);

movies.stream()
  .takeWhile(m -> m.getLikes() < 20)
  .forEach(m -> System.out.println(m.getTitle()));
```

**和filter的区别是：filter查询整个列表，但是takeWhile找到这个列表后将会停止搜索，效率更高**

dropWhile会跳过满足条件的那一个

### 排序

```java
movies.stream()
  .sorted((a, b) -> a.getTitle().compareTo(b.getTitle())) // 第一种排序
  .sorted(Comparator.comparing(n -> n.getTitle()))  // 第二种排序
  .forEach(m -> System.out.println(m.getTitle()));
```

## 匹配

- `anyMatch` 只要有一个匹配谓语表达式即 返回true
- `allMatch` 所有的都匹配谓语表达式就返回 true
- `noneMatch` 所有都不匹配位于表达式就返回true



# 多线程和高并发

- Process
- Thread

显示当前线程个数

```java
Thread.activeCount()
```

显示当前可用的进程名称

```java
Runtime.getRuntime().availableProcessors())
```

**创建一个线程**，线程中的对象必须实现了 Runnable 这个接口

``` 
Thread thread = new Thread(new Object())
thread.start(); //开始这个线程
```

**线程睡眠**

```java
Thread.sleep();
```

向线程发送一个中断请求，这并不会立即中断线程

```java
thread.interrupt();

// 需要在当前线程中判断是否有线程中断请求过来
if(Thread.currentThread().isInterrupted()) break; 
```

**如果中断正在Sleep的线程可能会导致*异常***
