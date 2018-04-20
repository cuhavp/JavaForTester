# JavaForTester
This repo show on questions/ assignment during training java session for Tester


1. Kiểm tra một số nhập vào có phải là số nguyên tố hay không?

```java
public static boolean iskSNT(int x){
    if(x<2)
        return false;
    int sqrt = (int) Math.sqrt(x);
    for (int i = 2; i <= sqrt; i++) {
        if (x % i == 0) {
        return false;
    }
    }
    return true;
}
```
2. Sắp xêp mảng tăng dần
```java
public static void EscSort(Integer[] a) {
    if (a != null) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] >= a[j + 1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Array after EscSort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } 
    } else {
        System.out.println("Null array.");
    }
}
```
3. Sắp xếp giảm dần
```java
public static void DescSort(Integer[] a) {
    if (a != null) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Array after DescSort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
      }
    } else {
    System.out.println("Null array.");
    }
}
```
4. Sử dụng For Loop để đảo một số nguyên cho trước
```java
public static void daosoFor(int n){
    List <Integer> list = new ArrayList<>();
    int flag = 0;
    if (n<0){
        n=-n;
        flag =1;
    }
    for (;n!=0;n=n/10 ){
        list.add(n%10);
        if (list.get(0)==0){
            list.remove(0);
        }
    }
    for (int j:list){
        if (flag ==1){
            System.out.print("-");
            flag ++;
        }
        System.out.print(j);
    }
    System.out.println(" ");
}
```
5. Sử dụng While Loop để đảo 1 số nguyên cho trước
```java
public static void daoSoWhile(int n){
    List <Integer> list = new ArrayList<>();
    int flag = 0;
    if (n<0){
        n=-n;
        flag =1;
    }
    while (n!=0){
        list.add(n%10);
        if (list.get(0)==0){
            list.remove(0);    
        }
        n=n/10;
    }
    for (int j:list){
        if (flag ==1){
            System.out.print("-");
            flag ++;
        }
        System.out.print(j);
    }
    System.out.println(" ");
}
```
6. Tìm phần tử lớn nhất trong mảng
```java
public static int findMax(Integer [] a){
    int max = a[0];
    for (int i=0; i<=a.length-1;i++){
        if(a[i]>max){
            max = a[i];
        }
    }
    return max;
}
```
7. Tìm phần tử nhỏ nhất trong mảng
```java
public static int findMin(Integer [] a){
    int min = a[0];
    for (int i=0; i<=a.length-1;i++){
      if(a[i]<min){
        min = a[i];
      }
    }
    return min;
  }
```
8. Viết một chương trình kiểm tra 1 chữ cái nhập vào có phải là nguyên âm, phụ âm hay không?
```java
public static void checkChuCai(char c){
    String s = "" + c;
    if(s.matches("[a-zA-Z]")){
        if (s.matches("[ueoaiUEOAI]")){
            System.out.println(String.format("%c la nguyen am",c));
        }
        else {
            System.out.println(String.format("%c la phu am",c));
        }
    }
    else System.out.println(String.format("%c khong là nguyen am, phu am",c));
}
```
9. Viết 1 hàm cộng 2 số ?, hàm này phải trả về 1 kiểu dữ liệu khác void.
Phân tích: Người dùng có thể nhập vào là số, chuổi, hoặc vừa số vừa chuỗi?

10. In ra màn hình số ngày trông một tháng nếu người dùng nhập vào một chuỗi gồm tháng và năm theo format: "MM/yyyy"
11. Nhập vào một số dương N, In ra màn hình N+ 1 dòng với môi dòng bắt đầu từ 0.
    ví dụ, N= 5,  in ra màn hình sẽ là:
    ```0
    0 1
    0 1 2
    0 1 2 3
    0 1 2 3 4 
    0 1 2 3 4 5
```java
public static void Matrix(int n) {
    for(int i = 0; i <= n; i++){
        for(int j =0; j <= i; j ++){
            System.out.print(" " + j);
        }
        System.out.println(" ");
    }
}
```
12. Viết Một Hàm Kiểm tra chuổi nhập vào có đối xứng hay không (palindrome)
```java
public static boolean isPalidrome(String input) {
    int flag = 1;
    for (int i = 0; i <= input.length() / 2 - 1; i++) {
        if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
          flag = 1;
        } else
          flag = 0;
    }
    if (flag == 1) {
        System.out.println(input + " is Palidrome");
        return true;
    } else{
         System.out.println(input + " isn't Palidrome");
         return false;
       }
}
```
13. Viết 1 hàm kiểm tra có phải năm nhuận hay không
Phân tích: Năm nhuận là năm chia hết cho 4 và ko chia hết cho 100.
14. Làm việc với Class
```text
Xây dựng class SinhVien có các thuộc tính như sau:
+ Mã Sinh Viên : Kiểu chuỗi
+ Họ Tên : Kiểu chuỗi
+ Giới Tính : Kiểu bool
+ Toán : Kiểu số thực
+ Lý : Kiểu số thực
+ Hóa : Kiểu số thực

1. Khai báo các thuộc tính cho lớp.

2. Khai báo hàm tạo với 2 thuộc tính là Họ Tên và Giới tính,
Mã sinh viên là một chuỗi random bắt đầu bằng "JAK-",
Điểm các môn học được tạo ngẫu nhiên từ 0 tới 10.

3. Khai báo hàm nhập và xuất cho lớp SinhVien có kiểm tra điều kiện nếu điểm toán, lý, hóa nhỏ hơn 0 hoặc lớn hơn 10 thì cho phép người sử dụng nhập lại.

4. Xây dựng hàm tính điểm trung bình của sinh viên với quy tắc sau:
DTB = (toan*3 + ly*2 + hoa)/6

5. Tìm sinh viên có điểm trung bình lớn nhất giữa 3 sinh viên cho trước. Xuất thông tin sinh viên đó.
```     
14. Làm việc với Class
```text
Xây dựng class Diem có các thuộc tính như sau:
+ X : Kiểu số nguyên
+ Y : Kiểu số nguyên

1. Khai báo các thuộc tính trong lớp Diem.

2. Khai báo hàm tạo không tham số và hàm tạo có đầy đủ tham số cho lớp Diem.

3. Khai báo hàm nhập và xuất trong lớp Diem. Kiểm tra điều kiện nếu x, y lớn hơn 2000 hoặc nhỏ hơn -2000 thì cho phép người sử dụng nhập lại x, y.

4. Xây dựng hàm tính độ dài 2 điểm theo quy tắc sau:

AB = Math.Sqrt( (Xb-Xa)* (Xb-Xa) + (Yb-Ya)* (Yb-Ya) )

5. Cho 3 điểm A,B,C tìm độ dài lớn nhất của 3 cạnh AB, AC, BC. Xây dựng hàm tính chu vi tam giác được tạo thành từ 3 điểm trên. Chu vi tam giác bằng tổng 3 cạnh cộng lại.
```
15. Làm việc với class

    Xây dựng class PhanSo có các thuộc tính như sau:
    + Tu : Số nguyên
    + Mau : Số nguyên

    1. Khai báo các thuộc tính.
    
    2. Khai báo hàm tạo không tham số và hàm tạo có đầy đủ tham số cho lớp PhanSo.
    
    3. Khai báo hàm nhập và xuất cho lớp PhanSo. Nếu mẫu số là 0 cho phép người sử dụng nhập lại mẫu số.
    
    4. Xây dựng hàm tìm phân số tổng của 2 phân số. Xuất ra phân số kết quả không cần rút gọn phân số.
    
    5. Xây dựng hàm so sánh 2 phân số. Xuất ra phân số lớn hơn. Hướng dẫn : Chuyển phân số thành số thập phân bằng cách lấy tử chia mẫu. Nhớ ép kiểu qua kiểu số thực khi chia tử cho mẫu.
    
    6. Tìm phân số lớn nhất giữa 3 phân số. Xuất ra phân số kết quả.


16. Viết chương trinhg giải phương trình bậc 2, chương trình trả về phương trình có 1 nghiêmj, có 2 nghiệm, vô nghiệm và vô số nghiệm.
Yêu cầu viết test case để kiểm tra chương trình chạy đúng hay không.
Mô tả giải thuật của bạn.


Công thức nghiệm tổng quát của phương trình bậc hai
Trong đại số sơ cấp, phương trình bậc hai là phương trình có dạng:

               aX^2 + bX + c = 0

với x là ẩn số chưa biết và a, b, c là các số đã biết sao cho a khác 0. Các số a, b, và c là những hệ số của phương trình và có thể phân biệt bằng cách gọi tương ứng hệ số bậc hai, hệ số bậc một, và hằng số hay số hạng tự do.[1]


![Nghiệm của phương ](https://upload.wikimedia.org/wikipedia/commons/c/c4/Quadratic_formula.svg)

17. Cho môt mảng số nguyên int[] A, Viết một chương trình xuất ra mảng B = A + 1

ví dụ:
 A = {1,3,2,4}  ==> B = {1,3,2,5}
 A = {9,9,9}    ==> B = {1,0,0,0}

18. Cho 2 số nguyên int a, b, viết chương trình đảo giá trị 2 số này mà ko được phép dùng biến thứ 3.

19. Cho một mảng số nguyên, viết 1 chương trình xuất ra mảng con có tổng là lớn nhất.
ví dụ: Mảng số nguyên a = {1,-2,1,3,-7,5} thí mảng con sẽ là {1,3} == tông lớn nhất là 4
20. Loại bỏ khoảng trắng thừa trong 1 câu. Khoảng trắng thừ là khoảng trắng nằm ở đầu và cuối câu hoặc khoảng trắng nằm ngay sau môt khoảng trắng khác.
21. Cho một mảng N phần tử, in ra cực trị địa phướng (local max, local )min của mảng
  + Local max là phần tử a[i] sao cho a[i] > a[i+1] && a[i] > a[i-1]
  + Local min là phần tử a[i] sao cho a[i] < a[i+1] && a[i] > a[i-1]
22. Remove Duplicate. Cho một mảng có N phần tử. Xoá các phần tử bị trùng và giữ nguyên thứ tự.
23. Cho một dãy số tự nhiên không theo thứ tự. In ra danh sách những số Fibonacci nằm giữa những cặp số tự nhiên đó nhưng không trùng. Dãy Fibonacci in ra theo thứ tự tăng dần và không trùng nhau.
24. Cho một chuỗi kí tự gồm số và kí tự a-z (lowercase). Xoay chuỗi kí tự X lần trên bảng mã [0-9a-z]. Lưu ý bảng mã [0-9a-z] là [0, 1, 2, 4, 5, 6, 7, 8, 9, a, b, c, …., x, y, z]
25. Cho một chuỗi chỉ gồm các kí tự chữ số. Thực hiện liên tục việc cộng các chữ số lại cho đến khi tổng chỉ còn một chữ số. 
```
Ví dụ:
Input                         Output
3                            
123                             6
998                             6
999999999955                    1
Giải thích:
1 + 2 + 3 = 6
9 + 9 + 8 = 26	 =>  2 + 6 = 8
9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 9 + 5 + 5 = 100 => 1 + 0 + 0 = 1
```
26. Cho một số tự nhiên N, sắp xếp lại các chữ số của nó sao cho được một số nhỏ nhất.
Phân tích: số tự nhiên là số luôn lớn hơn hoặc bằng 0, nên chỉ cần đưa số tự nhiên này vào một mảng, sắp xếp lại theo thư tự lớn dần rồi đưa ngược trở lại.

27. Cho một số nguyên N (-9999<=N<=9999) và hợp lệ (không có số 0 ở đầu). In ra cách đọc trong tiếng Việt, không dấu, của số đó. 
Quy ước cách đọc:

>Bộ chữ cái được dùng là: "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", chín", "mười", "mươi", "lăm", "trăm", "nghìn", "lẻ", "âm", "không".

>Với số hàng đơn vị:
>>0 sẽ không đọc
>>1 sẽ đọc là “một” nếu hàng chục là 0 hoặc 1, ngược lại thì đọc là “mốt”
>>5 sẽ đọc là “năm” nếu hàng chục là 0, ngược lại thì đọc là “lăm"
>>Các số còn lại đọc tương ứng như số lẻ bình thường (2 đọc là “hai”, 3 đọc là “ba", …)

>Với số hàng chục:
>>0 sẽ đọc là “lẻ" nếu hàng đơn vị có giá trị khác 0. Ví dụ 102 đọc là “một trăm lẻ hai”. Ngược lại không cần đọc số 0.
>>1 đọc là “mười”
>>Các số còn lại đọc tương ứng như số lẻ bình thường kết hợp với chữ “mươi" thể hiện đây là vị trí hàng chục (2x đọc là “hai mươi x”, 3x đọc là “ba mươi x”, …)

>Với số hàng trăm:
>>0 sẽ đọc là “không trăm" nếu hàng chục hoặc hàng đơn vị có giá trị khác 0. Ví dụ 5012 đọc là “năm nghìn không trăm mười hai". Ngược lại không cần đọc số 0.
>>Các số còn lại đọc tương ứng như số lẻ bình thường kết hợp với chữ “trăm" thể hiện đây là vị trí hàng trăm (2xx đọc là “hai trăm xx”, 3xx đọc là “ba trăm xx", …)

>Với số hàng nghìn:
>Không cần xét số 0 ở đầu do yêu cầu của đề đơn giản hoá bài toán.
>>Các số còn lại đọc tương ứng như số lẻ bình thường kết hợp với chữ “nghìn" thể hiện đây là vị trí hàng nghìn (2xxx đọc là “hai nghìn xxx, 3xxx đọc là “ba nghìn xxx”, …)

+ Input:
	Dòng đầu tiên gồm một số T, số test của bài.
	T dòng tiếp theo, mỗi dòng là một test case bao gồm số N. giá trị tuyệt đối của N < 10000
+ Output:
	Gồm T dòng, mỗi dòng in ra một chuỗi cách đọc số, viết thường, không dấu. 
+ Ví dụ:

| Input         | Output                           |
| ------------- |:--------------------------------:|
| 15            |   muoi lam                       |
| 101           |   mot tram le mot                |
| 2002          |   hai nghin khong tram le hai    |
| -1            |   am mot                         |


```java
public static void main(String[] args) {
        int a = 1115;
        System.out.println(readMe(-9999));
        System.out.println(readMe(9));
        System.out.println(readMe(106));
        System.out.println(readMe(1100));

    }

    public static String vietHoa(int a) {
        switch (a) {
            case 0:
                return "khong";
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
            case 1000:
                return "ngan";
            case 100:
                return "tram";
            case 10:
                return "muoi";

        }
        return "";
    }

    public static String readMe(int a) {
        int tram;
        int chuc;
        int donvi;
        String outPut = "";
        if (a < 0) {
            outPut = outPut + "am ";
            a = a * -1;
        }
        if (a <= 10) {
            outPut = outPut+" "+vietHoa(a);
        } else {
            //Ngan
            if (a / 1000 > 0) {
                tram = a % 1000;
                outPut = outPut + vietHoa(a / 1000) + " ";
                outPut = outPut + vietHoa(1000) + " ";
            }
//tram

            if ((a % 1000) / 100 > 0) {
                outPut = outPut + vietHoa((a % 1000) / 100) + " ";
                outPut = outPut + vietHoa(100) + " ";
            }


//chuc
            if ((a % 100) / 10 > 0) {
                if ((a % 100) / 10 > 1) {
                    outPut = outPut + vietHoa((a % 100) / 10) + " ";
                }

                outPut = outPut + vietHoa(10) + " ";
            }
            //don vi
            if (a % 10 > 0) {
                chuc = (a % 100) / 10;
                donvi = a % 10;
                if (chuc == 0 && donvi > 0) {
                    outPut = outPut + " le " + vietHoa((a % 10)) + " ";

                } else if (chuc > 0 && donvi == 5) {
                    outPut = outPut + " lam";
                } else {
                    outPut = outPut + vietHoa((a % 10)) + " ";
                }
            }
        }
        return outPut;

    }
```
28. Tắt báo thức
Tắt báo thức. Cho một dãy N đặt báo thức dạng HH:MM, từ 00:00 đến 23:59, đảm bảo tăng dần. Bạn chỉ thức dậy khi có ít nhất X báo thức bật lên liên tiếp trong vòng Y phút. Tính thời điểm thức dậy. Lưu ý từ 00:00 đến 01:00 là phút thứ 61.

+ Input:
	Dòng đầu tiên gồm một số T, số test của bài.
	T cặp dòng tiếp theo:
Dòng thứ nhất là 3 số nguyên dương X, Y, N
Dòng thứ hai là một dãy báo thức dạng HH:MM, không trùng nhau.
+ Output:
	Gồm T dòng, mỗi dòng in thời điểm thức dậy dạng HH:MM. Nếu không thể thức dậy, in "cannot wake!"

+ Ví dụ

| Input                    | Output        |
| ------------------------ |:-------------:|
| 1 10 4                   |               |
| 01:00 02:00 03:00 04:00  |   01:0        |
| 3 60 6                   |               |
|01:00 01:30 02:00 03:00 03:30 03:40|03:40 |
|2 10 1                    |               |
|01:00                     |cannot wake!   |

>Giải thích:Test case 1, chỉ cần 1 báo thức để thức dậy. Do đó bạn thức dậy ngay lần báo thức đầu tiên mà không quan tâm đến thời gian Y.
	Test case 2, bạn cần 3 báo thức trong vòng 60 phút để thức dậy. Từ 03:00 đến 03:40 có 3 báo thức bật lên liên tiếp là 03:00 03:30 03:40 nên bạn thức dậy lúc 03:40. Lưu ý bạn không thể thức dậy lúc 2:00 vì từ 01:00 đến 02:00 là 61 phút.
```java
public static void main(String[] args) {
        System.out.println(convertTo24HoursFormat("01:00"));
        System.out.println(convertTo24HoursFormat("02:00"));


        String[] a = {"01:00", "01:30", "02:00", "03:00", "03:30", "03:40"};
        System.out.println(solveQ4(3, 60, 6, a));
    }

    public static int convertTo24HoursFormat(String twelveHourTime) {
        List<String> a = Arrays.asList(twelveHourTime.split(":"));
        int time = Integer.parseInt(a.get(0)) * 60 + Integer.parseInt(a.get(1));
        return time;

    }

    public static String solveQ4(int X, int Y, int N, String[] alarmList) {
        String output = "";

        if (N < X) {
            output = "cannot wake!";

        } else if (X == 1) {
            System.out.println(alarmList[0]);
        } else {
            for (int i = 0; i < alarmList.length - X; i++) {
                if ((convertTo24HoursFormat(alarmList[i + X - 1]) - convertTo24HoursFormat(alarmList[i]) + 1) <= Y) {
                    output = alarmList[i + X - 1];
                    break;
                } else {
                    output = "cannot wake!";
                    break;
                }

            }
        }
        return output;
    }
```