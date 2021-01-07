package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

/* renamed from: m9c  reason: default package */
public final class m9c {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("freetiereducation.PREFS_SKIP_EDUCATION_SHOWN");
    private final SpSharedPreferences<Object> a;

    public m9c(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "prefs");
        this.a = spSharedPreferences;
    }

    public final void a() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, true);
        b2.i();
    }

    public final boolean b() {
        return this.a.d(b, false);
    }
}
