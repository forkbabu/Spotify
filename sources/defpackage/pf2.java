package defpackage;

import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.h;
import io.reactivex.y;

/* renamed from: pf2  reason: default package */
public final class pf2 implements fjf<y> {

    /* access modifiers changed from: private */
    /* renamed from: pf2$a */
    public static final class a {
        private static final pf2 a = new pf2();
    }

    public static pf2 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(new RxThreadFactory("RxExternalVoice"));
    }
}
