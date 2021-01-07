package defpackage;

import android.os.Build;

/* renamed from: czd  reason: default package */
public final class czd implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: czd$a */
    public static final class a {
        private static final czd a = new czd();
    }

    public static czd a() {
        return a.a;
    }

    public static String b() {
        String str = Build.MODEL;
        yif.g(str, "Cannot return null from a non-@Nullable @Provides method");
        return str;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
