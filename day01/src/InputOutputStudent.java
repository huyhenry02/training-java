import java.util.Scanner;

public class InputOutputStudent {
    public static void main(String[] args) {
        
        student sv1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDiemTH(sc.nextFloat());
        
        
        student sv2 = new student();
        System.out.println("Nhập mã sinh viên 2: ");
        sv2.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv2.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv2.setDiemTH(sc.nextFloat());
        
        
        student sv3 = new student();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv3.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv3.setDiemTH(sc.nextFloat());
        
        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
        System.out.println("--------------------------end-----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}

