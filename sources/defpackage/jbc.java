package defpackage;

import io.reactivex.functions.c;

/* renamed from: jbc  reason: default package */
public final /* synthetic */ class jbc implements c {
    public static final /* synthetic */ jbc a = new jbc();

    private /* synthetic */ jbc() {
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (((Boolean) obj).booleanValue() || !bool.booleanValue()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
