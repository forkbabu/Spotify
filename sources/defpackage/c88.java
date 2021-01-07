package defpackage;

import com.spotify.localization.SpotifyLocale;

/* renamed from: c88  reason: default package */
public final class c88 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: c88$a */
    public static final class a {
        private static final c88 a = new c88();
    }

    public static c88 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        String c = SpotifyLocale.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
