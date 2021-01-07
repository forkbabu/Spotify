package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.rx.x;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;

/* renamed from: ux9  reason: default package */
public class ux9 {
    private static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.e("preferred_locale_reporter_username");
    private static final SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("preferred_locale_reporter_locale");
    private final Context a;
    private final x b;
    private final i c;

    ux9(Context context, x xVar, i iVar) {
        this.a = context;
        this.b = xVar;
        this.c = iVar;
    }

    public void a(String str) {
        String f = SpotifyLocale.f(this.a);
        SpSharedPreferences<Object> d2 = this.c.d(this.a);
        SpSharedPreferences.b<Object, String> bVar = d;
        String m = d2.m(bVar, null);
        SpSharedPreferences.b<Object, String> bVar2 = e;
        String m2 = d2.m(bVar2, null);
        if (!TextUtils.equals(str, m) || !TextUtils.equals(f, m2)) {
            this.b.a("preferred-locale", f);
            SpSharedPreferences.a<Object> b2 = d2.b();
            b2.f(bVar, str);
            b2.f(bVar2, f);
            b2.i();
        }
    }
}
