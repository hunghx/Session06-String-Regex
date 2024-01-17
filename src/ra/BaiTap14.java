package ra;

import java.util.Arrays;

public class BaiTap14 {
    public static void main(String[] args) {
        // đếm số từ trong đoan văn > độ dài cho trc
        String paragraph = "   Mục tiêu: Luyện tập thao tác và sử dụng với các phương thức của String.\n" +
                "Đề bài: Viết một phương thức Java để đếm số lượng từ trong chuỗi có độ dài lớn hơn hoặc bằng một giá trị cho trước.\n" +
                "Hướng dẫn: Dùng phương thức length() để lấy được độ dài của chuỗi.";
        // B1
        String[] array = paragraph.trim().split("\\s+");
        System.out.println(Arrays.toString(array));

        // duyệt mạng để loc
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()>5){
                count++;
                System.out.println(array[i]);
            }
        }
        System.out.println(count);

        // duyệt ngược
//        for (int i = 100; i-->0;) {
//            System.out.println(i);
//        }

    }
}
