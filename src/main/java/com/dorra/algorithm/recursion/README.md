### 递归代码最关键的步骤:
* (1)写出递推公式;
* (2)找到终止条件;

### 写递归代码注意事项:
* (1)堆栈溢出;
// 比如将系统栈或者 JVM 堆栈大小设置为 1KB，在求解 f(19999) 时便会StackOverflowError, 解决思路如下: (如果数量很大可以考虑并发框架进行并行运算)
```java
// 全局变量，表示递归的深度。
int depth = 0;

int f(int n) {
  ++depth；
  if (depth > 1000) throw exception;
  
  if (n == 1) return 1;
  return f(n-1) + 1;
}
```

* (2)重复计算;
// 比如计算f(5), f(5)=f(4)+f(3), 计算f(4)时需要计算f(3), 这样f(3)会被计算很多次; 解决思路如下:
```java
public int f(int n) {
  if (n == 1) return 1;
  if (n == 2) return 2;
  
  // hasSolvedList可以理解成一个Map，key是n，value是f(n)
  if (hasSolvedList.containsKey(n)) {
    return hasSolvedList.get(n);
  }
  
  int ret = f(n-1) + f(n-2);
  hasSolvedList.put(n, ret);
  return ret;
}
```

### 递归的利弊:
利是递归代码的表达力很强，写起来非常简洁；

弊就是空间复杂度高、有堆栈溢出的风险、存在重复计算、过多的函数调用会耗时较多等问题。