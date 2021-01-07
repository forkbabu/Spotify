package defpackage;

import android.os.Handler;

/* renamed from: va3  reason: default package */
public final class va3 implements fjf<Handler> {

    /* access modifiers changed from: private */
    /* renamed from: va3$a */
    public static final class a {
        private static final va3 a = new va3();
    }

    public static va3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new Handler();
    }
}
