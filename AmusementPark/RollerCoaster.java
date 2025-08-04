/**
 * アトラクションの流れをテンプレート化したクラス(ジェットコースター版)
 */
public class RollerCoaster extends Attraction {

    /**
     * ジェットコースターの名前を表示する。
     */
    @Override
    public void attractionName() {
        System.out.println("---ジェットコースター---");
    }

    /**
     * ジェットコースターに乗る様子を表示する。
     */

    @Override
    public void ride() {
        System.out.println("ジェットコースターに乗った");
        System.out.println("安全バーを下げた");
    }

    /**
     * ジェットコースターの動きを表示する。
     */
    @Override
    public void move() {
        System.out.println("ブザーが鳴った");
        System.out.println("一気に発進！");
    }

    /**
     * ジェットコースターの演出を表示する。
     */
    @Override
    public void effect(){
        System.out.println("急降下、そして1回転！");
    }

    /**
     * ジェットコースターの終了する様子を表示する。
     */
    @Override
    public void finish() {
        System.out.println("止まった");
    }
}