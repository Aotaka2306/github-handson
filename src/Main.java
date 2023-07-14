import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        System.out.println("希望の犬のサイズを入力してね！ 小型犬 or 中型犬 or 大型犬");
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();

        HotDog retriever = new HotDog("ゴールデンレトリーバー","イギリス", "12年");
        HotDog dachshund = new HotDog("ダックスフンド", "ドイツ", "13年");
        HotDog shibaInu = new HotDog("柴犬","日本", "15年");
        HotDog chihuahua = new HotDog("チワワ","メキシコ","20年");
        HotDog pug = new HotDog("パグ","中国", "14年");

        List<HotDog> dogList = new ArrayList<>(Arrays.asList(retriever,shibaInu,dachshund,chihuahua,pug));

        for(int i=0; i < dogList.size(); i++) {
            //String details = dogList.get(i).detail(i);
            //System.out.println(details);
            if (input.equals("大型犬")  && i == 0) {
                System.out.println(dogList.get(i).detail(i));
                break;
            }else if (input.equals("中型犬") && i == 1) {
                System.out.println(dogList.get(i).detail(i));
                break;
            }else if (input.equals("小型犬") && (i == 2 || i ==3 || i==4)){
                System.out.println(dogList.get(i).detail(i));
            }
        }
    }
}