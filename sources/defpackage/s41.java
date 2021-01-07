package defpackage;

import io.reactivex.functions.l;

/* renamed from: s41  reason: default package */
public final /* synthetic */ class s41 implements l {
    public static final /* synthetic */ s41 a = new s41();

    private /* synthetic */ s41() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n4a n4a = (n4a) obj;
        if (!n4a.b().equals("car") || !n4a.c().equals("AndroidAuto") || !n4a.e()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
