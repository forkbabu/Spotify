package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import defpackage.ft2;
import kotlin.jvm.internal.h;

/* renamed from: gt2  reason: default package */
public final class gt2 implements fjf<Lifecycle> {

    /* access modifiers changed from: private */
    /* renamed from: gt2$a */
    public static final class a {
        private static final gt2 a = new gt2();
    }

    public static gt2 a() {
        return a.a;
    }

    public static Lifecycle b() {
        ft2.a aVar = ft2.a;
        n g = x.g();
        h.d(g, "ProcessLifecycleOwner.get()");
        Lifecycle A = ((x) g).A();
        h.d(A, "ProcessLifecycleOwner.get().lifecycle");
        return A;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
