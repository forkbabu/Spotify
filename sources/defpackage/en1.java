package defpackage;

import io.reactivex.functions.i;

/* renamed from: en1  reason: default package */
public final /* synthetic */ class en1 implements i {
    public static final /* synthetic */ en1 a = new en1();

    private /* synthetic */ en1() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return Boolean.valueOf(((Boolean) obj2).booleanValue() && ((Boolean) obj).booleanValue() && !((Boolean) obj3).booleanValue() && !((Boolean) obj4).booleanValue());
    }
}
