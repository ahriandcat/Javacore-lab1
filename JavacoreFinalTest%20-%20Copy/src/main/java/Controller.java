
import java.util.*;


public class Controller {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static ArrayList<Product> allProducts = service.getAllProducts();
    static ArrayList<CartItem> cartItems = new ArrayList<>();
    static ArrayList<User> allUsers = new ArrayList<>();
    static ArrayList<Order> orderList = new ArrayList<>();
    static User currentUser = new User();
    static int itemID = 1;
    static boolean logSuccess = true;

    public static void menu(){
        System.out.println("--------------------------------");
        System.out.println("   1 - Đăng nhập ");
        System.out.println("   2 - Đăng ký");
        System.out.println("   3 - Quên mật khẩu");
        System.out.println("   0 - Thoát");
        System.out.print("Lựa chọn : ");
    }
    public static void purchaseSubMenu(){
        System.out.println("--------------------------------");
        System.out.println("   1 - Tìm theo thể loại");
        System.out.println("   2 - Tìm theo tên");
        System.out.println("   3 - Tìm theo giá tiền");
        System.out.println("   4 - Tìm theo hãng");
        System.out.println("   5 - Xem giỏ hàng");
        System.out.println("   6 - Xem lịch sử giao dịch");
        System.out.println("   0 - Đăng xuất");
        System.out.print("Lựa chọn : ");
    }
    public static void searchByCategoryMenu(){
        System.out.println("--------------------------------");
        System.out.println("Danh mục sản phẩm : ");
        System.out.println("   1 - CPU");
        System.out.println("   2 - GPU");
        System.out.println("   3 - MainBoard");
        System.out.println("   4 - PSU");
        System.out.println("   5 - Ram");
        System.out.println("   6 - SSD");
        System.out.println("   0 - Quay lại");
        System.out.print("Lựa chọn : ");
    }

// menu chính
    public static void mainMenu(){
        while (true){
            boolean menu = true;
            while (menu){
                menu();
                int choose = 0;
                boolean isContinue = true;
                while (isContinue) {
                    try {
                        choose = Integer.parseInt(sc.nextLine());
                        if (choose < 0 || choose > 3) {
                            throw new MyException("Lựa chọn không hợp lệ");
                        }
                        isContinue=false;
                    } catch (NumberFormatException e) {
                        System.out.println("Vui lòng nhập lại");
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại : ");
                    }
                }
                switch (choose){
                    case 1 -> {
                        getUserFromlogin();
                    }
                    case 2 -> allUsers.add(service.createUser());
                    case 3 -> service.forgetPassword(allUsers);
                    case 0 -> {
                        System.exit(0);
                    }
                }
            }
        }
    }

//Đăng nhập
    public static void getUserFromlogin() {
        User user = new User();
        boolean log = true;
        while (log) {
//            sc.nextLine();
            System.out.print("Nhập số điện thoại : ");
            String phoneNum = sc.nextLine();
            System.out.print("Nhập mật khẩu : ");
            String pass = sc.nextLine();

            for (User u : allUsers) {
                if (u.getPhoneNum().equals(phoneNum) && u.getPassWord().equals(pass)) {
                    currentUser = u;
                    System.out.println("Đăng nhập thành công");
                    logSuccess = true;
                    while (logSuccess) {
                        loginSuccess();
                    }
                    log = false;
                }

            }
            if (allUsers.isEmpty()){
                System.out.println("Tài khoản không tồn tại");
                break;
            }
            else System.out.println("Tài khoản hoặc mật khẩu không đúng, vui lòng thử lại");
        }
    }


// menu mua hàng
    public static void loginSuccess(){
        boolean login = true;
        while (login){
            purchaseSubMenu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = sc.nextInt();
                    if (choose < 0 || choose > 6) {
                        throw new MyException("Lựa chọn không hợp lệ");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại : ");
                }
            }
            switch (choose){
                case 1 -> searchByCategory();                    //Tìm theo thể loại
                case 2 -> searchByProductname();                  // tìm theo tên
                case 3 -> searchByPrice();                     //tìm theo khoảng giá
                case 4 -> searchByManufacturer();                //Tìm theo hãng
                case 5 -> {                                    //xem giỏ hàng
                    ArrayList<CartItem> cartArrayList = service.userCartlist(cartItems, currentUser);
                    long totalPrice = 0;
                    if(cartArrayList.isEmpty()){
                        System.out.println("Bạn chưa có giao dịch nào");
                        return;
                    }
                    else{
                        for (CartItem c : cartArrayList) {
                            System.out.println(c);
                            totalPrice += c.getPrice() * c.getQuantity();
                        }
                        System.out.println("Tổng : " + totalPrice);
                    }
                    System.out.println("   1 - Đặt hàng");
                    System.out.println("   2 - Quay lại");
                    System.out.println("Lựa chọn : ");
                    int pay = 0;
                    boolean isContinue2 = true;
                    while (isContinue2) {
                        try {
                            pay = sc.nextInt();
                            if (pay < 0 || pay > 2) {
                                throw new MyException("Lựa chọn không hợp lệ");
                            }
                            isContinue2=false;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập lại");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Vui lòng nhập lại : ");
                        }
                    }
                    switch (pay){
                        case 1 -> {
                            System.out.println("Thông tin đơn hàng : ");
                            Date date = new Date();
                            System.out.println();
                            ArrayList<CartItem> orderItems = new ArrayList<>();
                            for (CartItem c : cartItems){
                                orderItems.add(c);
                            }
                            Order order = new Order(currentUser.getUserID(),currentUser.getPhoneNum(),currentUser.getEmail(),
                                    currentUser.getAddress(),currentUser.getEmail(), date,orderItems,totalPrice);
                            System.out.println(order);
                            System.out.println("   1 - Xác nhận mua hàng");
                            System.out.println("   2 - Quay lại");
                            int paid = sc.nextInt();
                            switch (paid){
                                case 1 -> {
                                    for (CartItem item : cartItems){
                                        Product p = findProductById(item.getProductId().getId());
                                        p.setStock(p.getStock()-item.getQuantity());
                                        allProducts.set(p.getId()-1, p); //update quantity
                                    }
                                    orderList.add(order);
                                    cartItems.removeAll(cartItems);   //Xóa giỏ hàng
                                    System.out.println("Mua hàng thành công, đơn hàng đang được xử lý");
                                }
                            }
                        }
                        case 2 -> {return;}
                    }
                }
                case  6 ->{                    //Xem lịch sử giao dịch
                    ArrayList<Order> orderArrayList = service.userOrderList(orderList, currentUser);
                    if(orderArrayList.isEmpty()){
                        System.out.println("Bạn chưa có giao dịch nào");
                    }
                    else{
                        for (Order o : orderArrayList){
                            System.out.println(o);
                        }
                    }
                }
                case 0 -> {                 //Đăng xuất
                    logSuccess=false;
                    currentUser = null;
                    mainMenu();
                }
            }
        }
    }
    public static Product findProductById(int id){
        for (Product p : allProducts){
            if(p.getId() == id) return p;
        }
        return null;
    }


//menu mua hàng theo thể loại
    public static void searchByCategory(){
        while (true){
            searchByCategoryMenu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = sc.nextInt();
                    if (choose < 0 || choose > 6) {
                        throw new MyException("Lựa chọn không hợp lệ");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại : ");
                }
            }
            switch (choose){
                case 1 ->{
                    service.showListByType(allProducts,Type.CPU);
                    addToCart(currentUser);
                }
                case 2 -> {
                    service.showListByType(allProducts,Type.GPU);
                    addToCart(currentUser);
                }
                case 3 -> {
                    service.showListByType(allProducts,Type.Mainboard);
                    addToCart(currentUser);
                }
                case 4 -> {
                    service.showListByType(allProducts,Type.PSU);
                    addToCart(currentUser);
                }
                case 5 -> {
                    service.showListByType(allProducts,Type.Ram);
                    addToCart(currentUser);
                }
                case 6 -> {
                    service.showListByType(allProducts,Type.SSD);
                    addToCart(currentUser);
                }
                case 0 -> {
                    return;
                }
            }
        }
    }

//mua hàng theo tên
    public static void searchByProductname(){
        sc.nextLine();
        int count = 0;
        System.out.print("Nhập tên sản phẩm bạn cần tìm : ");
        String name = sc.nextLine();
        for (Product p : allProducts){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        addToCart(currentUser);
        if (count==0){
            System.out.println("Không tìm thấy sản phẩm");
            return;
        }
    }

//mua hàng theo giá tiền
    public static void searchByPrice(){
        Collections.sort(allProducts, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        });

        while (true){
            System.out.println("Nhập khoảng giá bạn muốn tìm : ");
            System.out.println("   1 - Từ 4 đến 10 triệu");
            System.out.println("   2 - Từ 10 đến 20 triệu");
            System.out.println("   3 - Từ 20 đến 40 triệu");
            System.out.println("   4 - Từ 40 đến 70 triệu");
            System.out.println("   5 - Trên 70 triệu");
            System.out.println("   0 - Quay lại");
            System.out.print("lựa chọn giá tiền : ");
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = sc.nextInt();
                    if (choose < 0 || choose > 5) {
                        throw new MyException("Lựa chọn không hợp lệ");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại : ");
                }
            }
            switch (choose){
                case 1 -> {
                    service.showListByPrice(allProducts,4000000,10000000);
                    addToCart(currentUser);
                }
                case 2 -> {
                    service.showListByPrice(allProducts,10000000,20000000);
                    addToCart(currentUser);
                }
                case 3 -> {
                    service.showListByPrice(allProducts,20000000,40000000);
                    addToCart(currentUser);
                }
                case 4 -> {
                    service.showListByPrice(allProducts,40000000,70000000);
                    addToCart(currentUser);
                }
                case 5 -> {
                    service.showListByPrice(allProducts,70000000,1000000000);
                    addToCart(currentUser);
                }
                case 0 -> {
                    return;
                }
            }
        }
    }


//tìm theo hãng sản xuất
    public static void searchByManufacturer(){
        sc.nextLine();
        int count = 0;
        System.out.print("Nhập tên hãng bạn cần tìm : ");
        String manufacturer = sc.nextLine();
        for (Product p : allProducts){
            if (p.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase())){
                System.out.println(p);
                count++;
            }
        }
        addToCart(currentUser);
        if (count==0){
            System.out.println("Không tìm thấy hãng");
            return;
        }
    }

//thêm vào giỏ
    public static void addToCart(User user){
        System.out.println("   1 - Nhập ID sản phẩm để thêm vào giỏ hàng");
        System.out.println("   2 - Quay lại");
        System.out.print("Lựa chọn : ");
        int buy = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                buy = sc.nextInt();
                if (buy < 0 || buy > 2) {
                    throw new MyException("Lựa chọn không hợp lệ");
                }
                isContinue=false;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại : ");
            }
        }
        switch (buy){
            case 1 -> {
                System.out.println("Nhập ID : ");
                int id = sc.nextInt();
                for (Product p : allProducts){
                    if (p.getId()==id){
                        while (p.getStock()==0){
                            System.out.println("Sản phẩm hiện đã hết hàng");
                            return;
                        }
                        System.out.println("Nhập số lượng cần mua");
                        int quantity = sc.nextInt();
                        while (quantity > p.getStock()){
                            System.out.println("Số lượng mua không hợp lệ, vui lòng thử lại");
                            quantity = sc.nextInt();
                        }
                        CartItem cartItem = new CartItem(itemID, user, p ,p.getName(),p.getPrice(),quantity);
                        int count = 0;
                        for (CartItem i : cartItems){
                            if(id == i.getId()){
                                i.setQuantity(i.getQuantity()+ quantity);
                                count++;
                                System.out.println("Cập nhật giỏ hàng thành công");
                            }
                        }
                        if (count == 0){
                            cartItems.add(cartItem);
                            itemID++;
                            System.out.println("Thêm vào giỏ thành công");
                        }
                    }
                }
            }
            case 2 -> {
                return;
            }
        }
    }
}
