# 指针数组
```C
int *p[4];
```
这意味着每一个数组元素都是一个指针类型

# 结构体
``` C
struct structName{
  el1, el2
} variable.
```

## 结构体指针
```C
struct sturctName *point = &varable;
```
可简写为
```C
point -> el1
```
或
```C
(*point).el1
```