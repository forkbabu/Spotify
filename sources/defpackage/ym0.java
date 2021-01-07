package defpackage;

import com.spotify.http.clienttoken.b;
import com.spotify.http.clienttoken.c;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

/* renamed from: ym0  reason: default package */
public final class ym0 implements fjf<c> {
    private final wlf<SpSharedPreferences<Object>> a;

    public ym0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> spSharedPreferences = this.a.get();
        SpSharedPreferences.b<Object, String> bVar = b.b;
        h.e(spSharedPreferences, "globalPreferences");
        return new b(spSharedPreferences, null);
    }
}
