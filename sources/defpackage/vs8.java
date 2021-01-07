package defpackage;

import com.spotify.localization.SpotifyLocale;
import defpackage.us8;
import kotlin.jvm.internal.h;

/* renamed from: vs8  reason: default package */
public final class vs8 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: vs8$a */
    public static final class a {
        private static final vs8 a = new vs8();
    }

    public static vs8 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        us8.a aVar = us8.a;
        String c = SpotifyLocale.c();
        h.d(c, "SpotifyLocale.getDefault()");
        return c;
    }
}
