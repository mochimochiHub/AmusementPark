/**
 * アトラクションの流れをテンプレート化したクラス(観覧車版)
 */
public class FerrisWheel extends Attraction {

    /**
     * 観覧車の名前を表示する。
     */
    @Override
    public void attractionName() {
        System.out.println("---観覧車---");
    }

    /**
     * 観覧車に乗る様子を表示する。
     */

    @Override
    public void ride() {
        System.out.println("観覧車に乗った");
    }

    /**
     * 観覧車の動きを表示する。
     */
    @Override
    public void move() {
        System.out.println("ゆっくり動いている");
    }

    /**
     * 観覧車の演出を表示する。
     */
    @Override
    public void effect(){
        System.out.println("きれいな景色が広がる");
    }

    /**
     * 観覧車の終了する様子を表示する。
     */
    @Override
    public void finish() {
        System.out.println("1周して戻ってきた");
    }
}