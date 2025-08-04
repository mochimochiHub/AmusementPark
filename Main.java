/**
 * Reviewer : 藤井大輝
 */

import java.util.ArrayList;

public class Main extends Object{
    public static void main(String[] args) {

        // リストオブジェクトの生成
        ArrayList<Attraction> attractions = new ArrayList<>();

        //3種類のAttractionの生成と格納
        attractions.add(new FerrisWheel());
        attractions.add(new MerryGoRound());
        attractions.add(new RollerCoaster());

        // 3種類のAttractionの実行
        for (Attraction attraction : attractions) {
            attraction.perform();
            System.out.println();
        }
    }
}