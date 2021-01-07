package defpackage;

import io.reactivex.functions.l;

/* renamed from: sq5  reason: default package */
public final /* synthetic */ class sq5 implements l {
    public static final /* synthetic */ sq5 a = new sq5();

    private /* synthetic */ sq5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z = false;
        for (Object obj2 : (Object[]) obj) {
            z = z || ((Boolean) obj2).booleanValue();
        }
        return Boolean.valueOf(z);
    }
}
