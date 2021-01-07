package defpackage;

import android.os.Build;

/* renamed from: ggd  reason: default package */
public final class ggd implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: ggd$a */
    public static final class a {
        private static final ggd a = new ggd();
    }

    public static ggd a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 23);
    }
}
