package defpackage;

import com.spotify.http.contentaccesstoken.b;
import com.spotify.http.contentaccesstoken.c;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

/* renamed from: zm0  reason: default package */
public final class zm0 implements fjf<c> {
    private final wlf<SpSharedPreferences<Object>> a;

    public zm0(wlf<SpSharedPreferences<Object>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        SpSharedPreferences<Object> spSharedPreferences = this.a.get();
        SpSharedPreferences.b<Object, String> bVar = b.c;
        h.e(spSharedPreferences, "globalPreferences");
        return new b(spSharedPreferences, null);
    }
}
