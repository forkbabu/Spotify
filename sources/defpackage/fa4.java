package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: fa4  reason: default package */
public final class fa4 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: fa4$a */
    public static final class a {
        private static final fa4 a = new fa4();
    }

    public static fa4 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String c = SpotifyLocale.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
