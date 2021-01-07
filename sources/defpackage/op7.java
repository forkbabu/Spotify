package defpackage;

import defpackage.mp7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: op7  reason: default package */
public final /* synthetic */ class op7 implements l {
    public static final /* synthetic */ op7 a = new op7();

    private /* synthetic */ op7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = (String) obj;
        h.e(str, "url");
        return new mp7.h(str);
    }
}
