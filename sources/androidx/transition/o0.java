package androidx.transition;

public abstract class o0 extends v {
    private static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int c(x xVar, int i) {
        int[] iArr;
        if (xVar == null || (iArr = (int[]) xVar.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }

    @Override // androidx.transition.v
    public String[] a() {
        return a;
    }

    public int d(x xVar) {
        Integer num;
        if (xVar == null || (num = (Integer) xVar.a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int e(x xVar) {
        return c(xVar, 0);
    }

    public int f(x xVar) {
        return c(xVar, 1);
    }
}
