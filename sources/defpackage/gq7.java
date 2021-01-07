package defpackage;

import defpackage.mp7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: gq7  reason: default package */
public final /* synthetic */ class gq7 implements l {
    public static final /* synthetic */ gq7 a = new gq7();

    private /* synthetic */ gq7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = (String) obj;
        h.e(str, "url");
        return new mp7.g(str);
    }
}
