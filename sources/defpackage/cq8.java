package defpackage;

import io.reactivex.functions.l;

/* renamed from: cq8  reason: default package */
public final /* synthetic */ class cq8 implements l {
    public static final /* synthetic */ cq8 a = new cq8();

    private /* synthetic */ cq8() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = (String) obj;
        return Boolean.valueOf(str.equals("a") || str.equals("c"));
    }
}
