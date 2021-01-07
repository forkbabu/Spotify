package defpackage;

import defpackage.p2f;
import io.reactivex.functions.l;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

/* renamed from: j6f  reason: default package */
public final /* synthetic */ class j6f implements l {
    public static final /* synthetic */ j6f a = new j6f();

    private /* synthetic */ j6f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return s.W0((long) ((p2f.z) obj).a(), TimeUnit.SECONDS).j0(b7f.a);
    }
}
