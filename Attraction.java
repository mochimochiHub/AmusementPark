/**
 * Reviewer : 藤井大輝
 */

/**
 * アトラクションの流れをテンプレート化した抽象クラス
 * 
 * @author H.Yamamoto
 */
public abstract class Attraction extends Object{

    /**
     * アトラクションで遊ぶ時の流れを再現する。
     */
    public void perform() {
        AttractionName();
        ride();
        move();
        effect();
        finish();
        getOff();
    }

    /**
     * アトラクションの名前を表示する。
     * 
     * 具体的なアトラクションがさだまらないため実装できない。
     * 具体的なアトラクションが定まる子クラスにおいて、実装すること。
     */
    public abstract void AttractionName();

    /**
     * アトラクションに乗る様子を表示する。
     * 
     * 具体的なアトラクションがさだまらないため実装できない。
     * 具体的なアトラクションが定まる子クラスにおいて、実装すること。
     */
    public abstract void ride();

    /**
     * アトラクションの動きを表示する。
     * 
     * 具体的な動きがさだまらないため実装できない。
     * 具体的な動きが定まる子クラスにおいて、実装すること。
     */
    public abstract void move();

    /**
     * 演出を表示する。
     * 
     * 具体的な演出がさだまらないため実装できない。
     * 具体的な演出が定まる子クラスにおいて、実装すること。
     */
    public abstract void effect();

    /**
     * アトラクションの終了する様子を表示する。
     * 
     * 具体的な終了動作が定まらないため実装できない。
     * 具体的な終了動作が定まる子クラスにおいて、実装すること。
     */
    public abstract void finish();

    /**
     * アトラクションから降りる処理を行う。
     */
    public void getOff() {
        System.out.println("降りた");
    }
}
