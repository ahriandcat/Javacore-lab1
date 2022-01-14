import java.util.ArrayList;
import java.util.Random;

public class Team {

    public ArrayList<Player> getAllTeam(){
        ArrayList<Player> list=new ArrayList<>();
        list.add(new Player(1,"Bùi Tấn Trường",Position.GK));
        list.add(new Player(3,"Quế Ngọc Hải",Position.FW));
        list.add(new Player(4,"Bùi Tiến Dũng",Position.DF));
        list.add(new Player(5,"Phạm Xuân Mạnh",Position.FW));
        list.add(new Player(6,"Lương Xuân Trường",Position.FW));
        list.add(new Player(7,"Nguyễn Phong Hồng Duy",Position.FW));
        list.add(new Player(8,"Minh Vương",Position.FW));
        list.add(new Player(23,"Nguyễn Văn Toản",Position.GK));
        list.add(new Player(9,"Văn Toàn",Position.MF));
        list.add(new Player(10,"Nguyễn Công Phượng",Position.MF));
        list.add(new Player(11,"Tuấn Anh",Position.MF));
        list.add(new Player(13,"Hồ Tấn Tài",Position.MF));
        list.add(new Player(14,"Hoàng Đức",Position.MF));
        list.add(new Player(15,"Phạm Đức Huy",Position.MF));
        list.add(new Player(16,"Thành Chung",Position.MF));
        list.add(new Player(17,"Vũ Văn Thanh",Position.MF));
        list.add(new Player(18,"Hà Đức Chinh",Position.DF));
        list.add(new Player(19,"Quang Hải",Position.DF));
        list.add(new Player(20,"Phan Văn Đức",Position.DF));
        list.add(new Player(22,"Tiến Linh",Position.DF));
        list.add(new Player(23,"Thanh Bình",Position.DF));
        return list;
    }

    public void show(ArrayList<Player> players){
        for(Player player : players){
            System.out.println(player);
        }
    }

    public ArrayList<Player> buildTeam(int df, int mf, int fw, ArrayList<Player> allPlayer){
        ArrayList<Player> choiceTeam = new ArrayList<>();

        int teamNumber = allPlayer.size();

        //Chọn thủ môn
        Random random = new Random();

        int gkNumber = 0;
        int dfNumber = 0;
        int mfNumber = 0;
        int fwNumber = 0;

        while (gkNumber < 1){
            int gkRandom = random.nextInt(teamNumber);
            if(allPlayer.get(gkRandom).getPosition() == Position.GK)
            {
                Player choicePlayer = allPlayer.get(gkRandom);
                choiceTeam.add(choicePlayer);
                gkNumber++;
            }
        }

        //Chọn hậu vệ
        while (dfNumber < df){
            int dfRandom = random.nextInt(teamNumber);
            if(allPlayer.get(dfRandom).getPosition() == Position.DF){ //Kiểm tra vị trí có chính xác không
                if(!choiceTeam.contains(allPlayer.get(dfRandom))){ //Kiểm tra cầu thủ đó đã có trong đội hay chưa
                    choiceTeam.add(allPlayer.get(dfRandom)); //Thêm vào đội
                    dfNumber++;
                }


            }
        }
        while (mfNumber < df){
            int mfRandom = random.nextInt(teamNumber);
            if(allPlayer.get(mfRandom).getPosition() == Position.MF){
                if(!choiceTeam.contains(allPlayer.get(mfRandom))){
                    choiceTeam.add(allPlayer.get(mfRandom));
                    mfNumber++;
                }


            }
        }
        while (fwNumber < fw){
            int fwRandom = random.nextInt(teamNumber);
            if(allPlayer.get(fwRandom).getPosition() == Position.FW){
                if(!choiceTeam.contains(allPlayer.get(fwRandom))){
                    choiceTeam.add(allPlayer.get(fwRandom));
                    fwNumber++;
                }
            }
        }


        return choiceTeam;
    }
}