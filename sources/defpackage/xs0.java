package defpackage;

import com.google.android.gms.common.d;
import kotlin.jvm.internal.h;

/* renamed from: xs0  reason: default package */
public final class xs0 implements fjf<d> {

    /* access modifiers changed from: private */
    /* renamed from: xs0$a */
    public static final class a {
        private static final xs0 a = new xs0();
    }

    public static xs0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        d f = d.f();
        h.d(f, "GoogleApiAvailability.getInstance()");
        return f;
    }
}
