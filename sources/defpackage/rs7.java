package defpackage;

import defpackage.gs7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: rs7  reason: default package */
public final /* synthetic */ class rs7 implements l {
    public static final /* synthetic */ rs7 a = new rs7();

    private /* synthetic */ rs7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        np7 np7 = (np7) obj;
        h.e(np7, "data");
        return new gs7.c(np7);
    }
}
