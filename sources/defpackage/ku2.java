package defpackage;

import android.os.Looper;

/* renamed from: ku2  reason: default package */
public final class ku2 implements fjf<Looper> {

    /* access modifiers changed from: private */
    /* renamed from: ku2$a */
    public static final class a {
        private static final ku2 a = new ku2();
    }

    @Override // defpackage.wlf
    public Object get() {
        Looper mainLooper = Looper.getMainLooper();
        yif.g(mainLooper, "Cannot return null from a non-@Nullable @Provides method");
        return mainLooper;
    }
}
