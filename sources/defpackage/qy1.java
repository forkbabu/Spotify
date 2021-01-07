package defpackage;

import defpackage.rx1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: qy1  reason: default package */
public final class qy1<T, R> implements l<ox1, rx1> {
    public static final qy1 a = new qy1();

    qy1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rx1 apply(ox1 ox1) {
        ox1 ox12 = ox1;
        h.e(ox12, "userRequest");
        return new rx1.g(ox12);
    }
}
