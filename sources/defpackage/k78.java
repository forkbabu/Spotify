package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: k78  reason: default package */
public final class k78 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: k78$a */
    public static final class a {
        private static final k78 a = new k78();
    }

    public static k78 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String c = SpotifyLocale.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
