public class MerryGoRoundMount extends Object{
    
    /**
     * メリーゴーランドにある乗り物の名前を格納した配列。
     */
    private static final String[] MOUNTS = {
        "馬",
        "ゴンドラ"
    };

    /**
     * メリーゴーランドの乗り物の名前をランダムに取得する。
     */
    public static String getMount() {
        int randomIndex = (int)(Math.random() * MerryGoRoundMount.MOUNTS.length);
        return MerryGoRoundMount.MOUNTS[randomIndex];
    }
}
