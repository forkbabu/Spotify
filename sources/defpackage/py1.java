package defpackage;

import defpackage.rx1;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: py1  reason: default package */
public final class py1<T, R> implements l<kx1, rx1> {
    public static final py1 a = new py1();

    py1() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public rx1 apply(kx1 kx1) {
        kx1 kx12 = kx1;
        h.e(kx12, "storyInfo");
        return new rx1.f(kx12);
    }
}
