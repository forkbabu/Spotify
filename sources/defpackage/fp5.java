package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: fp5  reason: default package */
public final class fp5 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: fp5$a */
    public static final class a {
        private static final fp5 a = new fp5();
    }

    public static fp5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String c = SpotifyLocale.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
