package service;

import model.Ebook;
import model.Library;
import model.Paper;
import model.SGK;

import java.time.LocalDate;
import java.util.*;

public class Service <T>{
    static Scanner sc = new Scanner(System.in);
    public ArrayList<SGK> getAllSgkModel (){
        ArrayList<SGK> sgk = new ArrayList<>();
        sgk.add(new SGK(1,"Tiếng Việt 1",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(2,"Tiếng Việt 2",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(3,"Tiếng Việt 3",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(4,"Tiếng Việt 4",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));
        sgk.add(new SGK(5,"Tiếng Việt 5",new String[]{"Học tập","Tiểu học"},"NXB Giáo dục",2010,100,500,"Nhiều tác giả"));

        return sgk;
    }
    public ArrayList<Paper> getAllPaperModel(){
        ArrayList<Paper>paper = new ArrayList<>();
        paper.add(new Paper(6,"Hà Nội mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Hà Nội",2021, LocalDate.of(2021,2,14),1000,25));
        paper.add(new Paper(7,"Hải Phòng mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Hải Phòng",2022,LocalDate.of(2022,1,19),1000,20));
        paper.add(new Paper(8,"Huế mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Huế",2021,LocalDate.of(2021,9,25),1000,20));
        paper.add(new Paper(9,"Sài Gòn mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Sài Gòn",2022,LocalDate.of(2022,1,1),1000,20));
        paper.add(new Paper(10,"Đà Nẵng mới",new String[]{"Báo","Tin sáng"},"Tòa soạn Đà Nẵng",2020,LocalDate.of(2022,1,5),1000,20));
        return paper;
    }
    public ArrayList<Ebook> getAllEbookModel(){
        ArrayList<Ebook>ebook = new ArrayList<>();
        ebook.add(new Ebook(11,"Cách làm giàu",new String[]{"Kiếm tiền","Tài chính","ebook","Tin sáng"},"Huấn Hoa Hồng",2021,80,"Huan.jpg",12503));
        ebook.add(new Ebook(12,"Truyện ma",new String[]{"Kinh dị","ebook"},"Nguyễn Ngọc Ngạn",2008,23,"ma.jpg",1009));
        ebook.add(new Ebook(13,"1001 câu hỏi vì sao",new String[]{"Kiến thức","ebook","Học tập"},"NXB giáo dục",2015,80,"clgt?.jpg",256));
        ebook.add(new Ebook(14,"Truyện Andersen",new String[]{"Cổ tích","ebook","Tiểu học","Học tập"},"NXB giáo dục",2019,125,"clgt??.jpg",189));
        ebook.add(new Ebook(15,"Sherlock Holmes",new String[]{"Trinh thám","ebook"}," Arthur Conan Doyle",1998,300,"Sherlock.kpg",16969));

        return ebook;
    }
    public void menu(){
        System.out.println("----------------------------------------------");
        System.out.println("   1 - In ra danh sách theo từng loại");
        System.out.println("   2 - Tìm theo tên");
        System.out.println("   3 - Tìm theo danh mục");
        System.out.println("   4 - Xem ebook có lượt tải nhiều nhất");
        System.out.println("   5 - Xem báo phát hành năm nay");
        System.out.println("   0 - Thoát chương trình");
        System.out.print("Lựa chọn : ");
    }

    public void subMenu(){
        System.out.println("----------------------------------------------");
        System.out.println("   1 - Sách giáo khoa");
        System.out.println("   2 - Báo");
        System.out.println("   3 - model.Ebook");
        System.out.println("   0 - Quay lại");
    }

    public <T> void show(ArrayList<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
    public void searchByName(ArrayList<Library> list){

        System.out.print("Nhập tên cần tìm : ");
        String name = sc.nextLine();
        int count = 0;
        for (Library l : list){
            if (l.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(l);
                count ++;
            }
        }
        if (count ==0){
            System.out.println("Không tìm thấy");
        }
    }
    public void searchByCategory(ArrayList<Library> list){
        System.out.print("Nhập thể loại cần tìm : ");
        String category = sc.nextLine();
        int count =0;
        for (Library l : list) {
            for (String bookCategory : l.getCategory()) {
                if (bookCategory.toLowerCase().contains(category.toLowerCase())) {
                    System.out.println(l);
                    count++;
                    break;
                }
            }
        }
        if (count ==0){
            System.out.println("Không tìm thấy");
        }
    }
    public void printHighestEbookDownload(ArrayList<Ebook> ebooks){
        Collections.sort(ebooks, new Comparator<Ebook>() {
            @Override
            public int compare(Ebook o1, Ebook o2) {
                return o2.getDownload() - o1.getDownload();
            }
        });
        for (int i =0;i<1;i++){
            System.out.println(ebooks.get(i));
        }
    }
    public void showPaperByYear(ArrayList<Paper> papers){
        for (Paper p : papers){
            if (p.getYear() == 2022){
                System.out.println(p);
            }
        }
    }
}

