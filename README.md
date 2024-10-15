---
description: By- Kamonrat Charoenreo 630710636
---

# Indexed Array

Indexed Array คืออะไร ?

อาเรย์ที่เก็บข้อมูลหลายๆ ตัวไว้ในที่เดียวกัน แล้วใช้ตัวเลข (index) เป็นตัวชี้ตำแหน่งของค่าในอาเรย์แต่ละตัว โดยค่า index จะเริ่มต้นจาก 0 แล้วเพิ่มขึ้นทีละ 1 ต่อไปเรื่อย ๆ ตามลำดับ

* Example

```php
$animal = array("cat", "dog", "bird");
echo $animal[0];
```

* output

```
cat
```



## วิธีการสร้าง Indexed Array

1. **วิธีที่ 1: ใช้ฟังก์ชัน array()**

{% tabs %}
{% tab title="Syntax" %}
```php
$ชื่ออาเรย์ = array(ค่าที่ 1, ค่าที่ 2, ค่าที่ 3)
```
{% endtab %}
{% endtabs %}

* Example

<pre class="language-php"><code class="lang-php">&#x3C;?php
$fruits = array("Apple", "Banana", "Cherry");
    echo $fruits[0] . "&#x3C;br>";
<strong>    echo $fruits[1] . "&#x3C;br>";
</strong>    echo $fruits[2] . "&#x3C;br>";
?>
</code></pre>

* output

```
Apple
Banana
Cherry
```

2. **วิธีที่ 2: ใช้เครื่องหมาย \[ ]**

{% tabs %}
{% tab title="Syntax " %}
```php
$ชื่ออาเรย์ = [ค่าที่ 1, ค่าที่ 2, ค่าที่ 3]
```
{% endtab %}
{% endtabs %}

* Example

```php
<?php
$numbers = [1, 2, 3, 4, 5];
foreach ($numbers as $numbers){
    echo $fruits[2] . "<br>"; }
?>
```

* output

```
1
2
3
4
5
```

3. **วิธีที่ 3: เพิ่มค่าทีละตัว**

{% tabs %}
{% tab title="Syntax " %}
```php
$ชื่ออาเรย์ = [ ]P
// เพิ่มค่าทีละตัวเข้าไปในอาเรย์
$ชื่ออาเรย์[] = “ค่าที่ 1”;
$ชื่ออาเรย์[] = “ค่าที่ 2”;

```
{% endtab %}
{% endtabs %}

* Example

```php
<?php
$fruits = [];
$fruits[] = "Apple";
$fruits[] = "Banana";
$fruits[] = "Cherry";

foreach ($fruits as $fruits) {
    echo $fruits . "<br>"; }
?>
```

* output

```
Apple
Banana
Cherry
```

### Change Value (การเปลี่ยนค่า)

{% tabs %}
{% tab title="Syntax" %}
```php
$ชื่ออาเรย์ = ค่าเดิม ; 
$ชื่ออาเรย์ = ค่าที่เปลี่ยนแล้ว; 
```
{% endtab %}
{% endtabs %}

* Example

```php
<?php
$number = 10 ; 
    echo "ค่าเดิม: " . $number;
$number = 20; 
    echo "ค่าที่เปลี่ยนแล้ว: " . $number;
?>
```

* output

```
ค่าเดิม: 10
ค่าที่เปลี่ยนแล้ว: 20
```



## เปรียบเทียบภาษา PHP/Java/C/Python/C#/JavaScript



{% tabs %}
{% tab title="PHP" %}
```php
<?php
$cities = array("New York", "Tokyo", "London", "Paris");
foreach ($cities as $city){
    echo $city . "<br>"; }
?>
```
{% endtab %}

{% tab title="Java" %}
```java
public class Main {
    public static void main(String[] args) {
        String[] cities = {"New York", "Tokyo", "London", "Paris"};
        
        for (String city : cities) {
            System.out.println(city);
            }
        }
    }
```
{% endtab %}

{% tab title="C" %}
```c
#include <stdio.h>
int main() {
    char *cities[] = {"New York", "Tokyo", "London", "Paris"};
    
    for (int i=0; i<4; i++){
        printf("%s\n", cities[i]);
        }
    return 0:
}
```
{% endtab %}

{% tab title="Python" %}
```python
cities = ["New York", "Tokyo", "London", "Paris"]

for city in cities:
    print(city)
```
{% endtab %}

{% tab title="C#" %}
```csharp
using System;

class Program {
    static void Main() {
        string[] cities = { "New York", "Tokyo", "London", "Paris" };
        foreach (string city in cities) {
            Console.WriteLine(city);
        }
    }
}
```
{% endtab %}

{% tab title="JavaScript" %}
```javascript
let cities = ["New York", "Tokyo", "London", "Paris"];
cities.forEach(function(city) {
    console.log(city);
});
```
{% endtab %}
{% endtabs %}

* output

```
New York
Tokyo
London
Paris
```

### PHP

อาร์เรย์มีการจัดการแบบ Dynamic ไม่จำเป็นต้องประกาศขนาดล่วงหน้า สามารถเพิ่มหรือลดข้อมูลในอาร์เรย์ได้อย่างยืดหยุ่น

* ใช้คำสั่ง `foreach` เพื่อวนลูปผ่านอาเรย์
* ใช้ `echo` และ HTML `<br>` เพื่อขึ้นบรรทัดใหม่และแสดงผลลัพธ์
* เป็น Dynamic, Interpreted Languages

### Java

อาร์เรย์มีขนาดคงที่เมื่อสร้างขึ้น และชนิดข้อมูลต้องกำหนดไว้ชัดเจนตั้งแต่เริ่มต้น ไม่สามารถเพิ่มหรือลดขนาดได้ภายหลัง

* ใช้ลูป `for-each` เพื่อวนลูปผ่านอาเรย์
* ใช้ `System.out.println()` เพื่อแสดงผลลัพธ์
* เป็น Static, Compiled Languages

### C

ต้องประกาศขนาดของอาร์เรย์ล่วงหน้าและชนิดข้อมูลก็ต้องชัดเจน ไม่สามารถเปลี่ยนชนิดข้อมูลได้หลังจากประกาศ&#x20;

* ใช้ลูป `for` เพื่อวนลูปผ่านอาเรย์ของพ้อยเตอร์
* ใช้ `printf()` เพื่อแสดงผลลัพธ์
* เป็น Static, Compiled Languages

### Python

อาร์เรย์ถูกแทนที่ด้วยโครงสร้างข้อมูลที่เรียกว่า List ซึ่งมีความยืดหยุ่นสูง สามารถเพิ่ม ลด หรือเปลี่ยนแปลงขนาดได้ตลอดเวลา โดยไม่ต้องกำหนดชนิดข้อมูล

* ใช้ลูป `for` เพื่อวนลูปผ่านอาเรย์
* ใช้ `print()` เพื่อแสดงผลลัพธ์
* เป็น Dynamic, Interpreted Languages

### C\#

ต้องประกาศขนาดและชนิดข้อมูลล่วงหน้า แต่สามารถใช้ `List<T> เพื่อขยายขาดของอาเรย์ได้`

* ใช้ `foreach` เพื่อวนลูปผ่านอาร์เรย์หรือ `List<T>`
* ใช้ `Console.WriteLine()` เพื่อแสดงผลลัพธ์
* เป็น Static, Compiled Languages

### JavaScript

อาร์เรย์สามารถเพิ่มหรือลบข้อมูลได้ตลอดเวลา โดยไม่ต้องประกาศขนาดหรือชนิดข้อมูล.

* ใช้ `forEach` หรือ `for` เพื่อวนลูปผ่านอาร์เรย์
* ใช้ `console.log()`หรือ `document.write()`เพื่อแสดงผลลัพธ์
* เป็น Dynamic, Interpreted Languages

## สรุปการเปรียบเทียบภาษา PHP/Java/C/Python/C#/JavaScript

<table><thead><tr><th width="126">ภาษา</th><th width="160">การประกาศอาร์เรย์</th><th width="194">ขนาดอาร์เรย์</th><th>ชนิดข้อมูล</th></tr></thead><tbody><tr><td>PHP</td><td>ใช้ array() หรือ [ ]</td><td>ยืดหยุ่น (ไม่ต้องกำหนดขนาด)</td><td>ไม่ต้องประกาศชนิดล่วงหน้า</td></tr><tr><td>Java</td><td>ใช้ { }</td><td>ขนาดคงที่</td><td>ต้องประกาศชนิดข้อมูล</td></tr><tr><td>C</td><td>ใช้ { }</td><td>ขนาดคงที่</td><td>ต้องประกาศชนิดข้อมูล</td></tr><tr><td>Python</td><td>ใช้ [ ] (List)</td><td>ยืดหยุ่น (ขยายได้)</td><td>ไม่ต้องประกาศชนิดล่วงหน้า</td></tr><tr><td>C#</td><td>ใช้ { }</td><td>ขนาดคงที่ (ถ้าเป็น Array) หรือยืดหยุ่น (ถ้าใช้ List)</td><td>ต้องประกาศชนิดข้อมูลล่วงหน้า</td></tr><tr><td>JavaScript</td><td>ใช้ <code>[]</code></td><td>ยืดหยุ่น (ไม่ต้องกำหนดขนาด)</td><td>ไม่ต้องประกาศชนิดล่วงหน้า</td></tr></tbody></table>



## \<Reference>

* W3Schools. (1999-2024). _PHP Indexed Array_. Retrieved from W3Schools: [https://www.w3schools.com/php/php\_arrays\_indexed.asp](https://www.w3schools.com/php/php\_arrays\_indexed.asp)
* GeeksforGeeks . (2024). _PHP Array Functions_. Retrieved from GeeksforGeeks: [https://www.geeksforgeeks.org/php-tutorial/](https://www.geeksforgeeks.org/php-tutorial/)
* Javatpoint. (2024). _PHP Indexed Array_. Retrieved from Javatpoint: [https://www.javatpoint.com/php-tutorial](https://www.javatpoint.com/php-tutorial)
* Tutorialspoint. ( 2024). _PHP - Indexed Arrays_. Retrieved from Tutorialspoint: [https://www.tutorialspoint.com/php/php\_indexed\_array.htm](https://www.tutorialspoint.com/php/index.htm)
* MrExamples. (2024). _PHP Indexed Arrays_. Retrieved from MrExamples: [https://mrexamples.com/php/php-indexed-arrays/](https://mrexamples.com/php/php-indexed-arrays/)
* PHP Documentation Group. (2024). _PHP Manual_. Retrieved from PHP.net: [https://www.php.net/manual/en/](https://www.php.net/manual/en/)
* W3Schools. (1999-2024). C# Arrays. Retrieved from W3Schools:[https://www.w3schools.com/cs/cs\_arrays.php](https://www.w3schools.com/cs/cs\_arrays.php)
* W3Schools. (1999-2024). JavaScript Arrays. Retrieved from W3Schools:[https://www.w3schools.com/js/js\_arrays.asp](https://www.w3schools.com/js/js\_arrays.asp)



## Slide / Clips

{% embed url="https://youtu.be/9mU1hISJn_0?si=8j5ICn-EyqYCMgb8" %}

**Slide Files** : &#x20;

{% file src=".gitbook/assets/Indexed_arrays.pdf" %}

