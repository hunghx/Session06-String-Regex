package ra;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        // Các phương thức làm viec voi chuoi
        String str = "Hello";
        // lấy ra độ dài chuoi
        System.out.println("độ dài chuỗi là : "+str.length());
        // lấy ra k tự tại vị trí index
        System.out.println("kí tự ở index = 3 là "+str.charAt(3));
        // nối chuoi
        String newStr = str.concat(" world");
        System.out.println("str :"+str);
        System.out.println("newStr :"+newStr);
        // in hoa in thường,cắt khoảng trắng 2 đầu
        // so sánh
        System.out.println("so sánh str vs newStr =>>>>>"+str.equals(newStr));
        String string = "HaLLO";
        System.out.println("ko phân biệt hoa thường :"+str.equalsIgnoreCase(string));
        // hiệu của 2 chuỗi
        System.out.println("hiệu 2 chuỗi :"+str.compareTo(string)); // Hello-HaLLO
        // Tim kiếm tương đối
        System.out.println("kiểm tra có phải chuỗi con hay không :" + newStr.contains("worl"));
        // cắt chuỗi theo vị trí
        System.out.println(newStr.substring(0,5));



        // StringBuilder (bất đồng bộ) và StringBuffer(đồng bộ, bộ nhớ đệm ) --> hướng tới đa luồng
        StringBuilder stringBuilder = new StringBuilder(str);
        // nối chuỗi
        StringBuilder stringBuilder1 =  stringBuilder.append(" world");
        // nối chuỗi theo vị trí chỉ định
        stringBuilder.append("rikkei academy",7,14);
        System.out.println(stringBuilder);
        // chèn theo vị trí
        stringBuilder.insert(0,"rikkei");
        System.out.println(stringBuilder);
        // cắt chuỗi
        stringBuilder.delete(0,10);
        System.out.println(stringBuilder);

        int N =8888888;
        StringBuilder stringBuilder2 = new StringBuilder("sb");
        long t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            stringBuilder.append(i);
        }
        System.out.println("Thời gian chạy : "+(System.currentTimeMillis()-t));


        StringBuffer stringBuffer = new StringBuffer("sb");
        t=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            stringBuffer.append(i);
        }
        System.out.println("Thời gian chạy : "+(System.currentTimeMillis()-t));


        // Biểu thức chính qui
        // chuỗi số 0-9 có dung 9  kí tu
        // \d{9}

//        So khớp dữ liệu
        // cách 1 :
        Pattern pattern = Pattern.compile("\\d{9}");
        Matcher matcher =  pattern.matcher("09878d343");
        System.out.println(matcher.matches());
        // cách 2 :
        System.out.println(Pattern.compile("\\d{9}").matcher("9023784635").matches());
        // cach 3 :
        System.out.println("032974846".matches("\\d{9}"));
        // cách 4 :
        boolean checkk = Pattern.matches("\\d{9}","09089485435");

        // yêu cập nhập email đênns khi nào hợp lệ
        while (true){
            String email = new Scanner(System.in).nextLine();
            if (new Validate().isValidEmail(email)){
                System.out.println(email);
                break;
            }
            System.err.println("Nhập sai rồi, nhập lại đi");
        }
    }

}