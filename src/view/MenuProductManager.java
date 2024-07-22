
package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import manager.ProductManger;
import model.Product;

public class MenuProductManager {
    ProductManger ProductManger = new ProductManger();
    Scanner inputInt;
    Scanner inputString;

    public MenuProductManager() {
        this.inputInt = new Scanner(System.in);
        this.inputString = new Scanner(System.in);
    }

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("---------------------Menu Product---------------------");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Sửa sản phẩm ");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm sản phẩm theo id sản phẩm");
            System.out.println("5. Tìm sản phẩm theo loại mặt hàng");
            System.out.println("6. hiển thị tất cả ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = this.inputInt.nextInt();
            switch (choice) {
                case 1:
                    this.showMenuAdd();
                    break;
                case 6:
                    this.showAll();
            }
        } while(choice != 0);

    }

    public void showMenuAdd() {
        System.out.println("---------------------Menu thêm mới---------------------");
        System.out.println("Nhập sản phẩm muốn thêm :");
        String Name = this.inputString.nextLine();
        System.out.println("loại mặt hàng :");
        String Loai = this.inputString.nextLine();
        System.out.println("Giá :");
        int Gia = this.inputInt.nextInt();
        Product product = new Product(Name, Loai, Gia);
        this.ProductManger.add(product);
        System.out.println("---------------------Thêm thành công---------------------");
    }

    public void showAll() {
        System.out.println("Danh sách sản phẩm là : ");
        ArrayList<Product> list = this.ProductManger.findAll();
        Iterator var2 = list.iterator();

        while(var2.hasNext()) {
            Product Product = (Product)var2.next();
            System.out.println(Product);
        }

    }
}
