/**
 * アトラクションの流れをテンプレート化したクラス(メリーゴーランド版)
 */
public class MerryGoRound extends Attraction {

    /**
    * 乗り物の名前を表すフィールド。
    *
    * 初期値はnull(文字列)で、まだ名前が設定されていない状態を示す。
    */
    private String mount ="null";

    /**
     * メリーゴーランドの名前を表示する。
     */
    @Override
    public void AttractionName() {
        System.out.println("---メリーゴーランド---");
    }

    /**
     * メリーゴーランドに乗る様子を表示する。
     * 
     * montフィールドに乗り物の名前をセットし表示する。
     */
    @Override
    public void ride() {
        mount = MerryGoRoundMount.getMount();
        System.out.println(mount + "に乗った");
    }


    /**
     * メリーゴーランドの動きを表示する。
     */
    @Override
    public void move() {
        System.out.println("動き出した");
        System.out.println("くるくる回っている");
        if ("馬".equals(mount)) {
            System.out.println("馬が走っているように揺れている");
        }
    }

    /**
     * メリーゴーランドの演出を表示する。
     */
    @Override
    public void effect(){
        System.out.println("音楽が流れている");
    }

    /**
     * メリーゴーランドの終了する様子を表示する。
     */
    @Override
    public void finish() {
        System.out.println("止まった");
    }
}
