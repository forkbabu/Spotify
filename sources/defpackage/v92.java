package defpackage;

/* renamed from: v92  reason: default package */
public class v92 implements w92 {
    private final w92[] a;

    private v92(w92[] w92Arr) {
        w92[] w92Arr2 = new w92[w92Arr.length];
        this.a = w92Arr2;
        System.arraycopy(w92Arr, 0, w92Arr2, 0, w92Arr.length);
    }

    public static w92 b(w92... w92Arr) {
        return new v92(w92Arr);
    }

    @Override // defpackage.w92
    public synchronized void dispose() {
        for (w92 w92 : this.a) {
            w92.dispose();
        }
    }
}
