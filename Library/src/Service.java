import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    static Scanner sc = new Scanner(System.in);
    static Model<SGK> sgkModel = new Model<>();
    static Model<Paper> paperModel = new Model<>();
    static Model<Ebook> ebookModel = new Model<>();
    public static ArrayList<SGK> getAllSgkModel (){
        ArrayList<SGK> sgk = new ArrayList<>();
        sgk.add(new SGK(1,"Tiếng Việt 1",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(2,"Tiếng Việt 2",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(3,"Tiếng Việt 3",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(4,"Tiếng Việt 4",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(5,"Tiếng Việt 5",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));

        return sgk;
    }
    public static ArrayList<Paper> getAllPaperModel(){
        ArrayList<Paper>paper = new ArrayList<>();
        paper.add(new Paper(1,"Hà Nội mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Hà Nội",2022,2021/02/14,1000,20));
        paper.add(new Paper(2,"Hải Phòng mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Hải Phòng",2022,2021/02/14,1000,20));
        paper.add(new Paper(3,"Huế mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Huế",2021,2021/02/14,1000,20));
        paper.add(new Paper(4,"Sài Gòn mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Sài Gòn",2022,2021/02/14,1000,20));
        paper.add(new Paper(5,"Đà Nẵng mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Đà Nẵng",2020,2021/02/14,1000,20));
        return paper;
    }
    public static ArrayList<Ebook> getAllEbookModel(){
        ArrayList<Ebook>ebook = new ArrayList<>();
        ebook.add(new Ebook(1,"Cách làm giàu",new String[]{"Kiếm tiền","Tài chính","ebook","Tin sáng"},"Huấn Hoa Hồng",2021,80,"Huan.jpg",12503));
        ebook.add(new Ebook(2,"Truyện ma",new String[]{"Kinh dị","ebook"},"Nguyễn Ngọc Ngạn",2008,23,"ma.jpg",1009));
        ebook.add(new Ebook(3,"1001 câu hỏi vì sao",new String[]{"Kiến thức","ebook","Học tập"},"NXB giáo dục",2015,80,"clgt?.jpg",256));
        ebook.add(new Ebook(4,"Truyện Andersen",new String[]{"Cổ tích","ebook","Tiểu học","Học tập"},"NXB giáo dục",2019,125,"clgt??.jpg",189));
        ebook.add(new Ebook(5,"Sherlock Holmes",new String[]{"Trinh thám","ebook"}," Arthur Conan Doyle",1998,300,"Sherlock.kpg",16969));

        return ebook;
    }
    public static void menu(){
        System.out.println("----------------------------------------------");
        System.out.println("1 - In ra danh sách theo từng loại");
        System.out.println("2 - Tìm theo tên");
        System.out.println("3 - Tìm theo thể loại");
        System.out.println("4 - Xem ebook có lượt tải nhiều nhất");
        System.out.println("5 - Xem báo phát hành năm nay");
    }

    public static void subMenu(){
        System.out.println("----------------------------------------------");
        System.out.println("1 - Sách giáo khoa");
        System.out.println("2 - Báo");
        System.out.println("3 - Ebook");
        System.out.println("0 - Thoát chương trình");
    }
    public static void showList(ArrayList<Model> list){
        boolean choose = true;
        while (choose){
            subMenu();
            int a = sc.nextInt();
            switch (a){
                case 1-> sgkModel.show(sgk);
//                case 2-> model.show(paperModel);
//                case 3-> model.show(ebookModel);
                case 0-> choose=false;
                default -> System.out.println("Khô" +
                        "" +
                        "ng có lựa chọn này");
            }
        }
    }
}
