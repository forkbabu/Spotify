package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

/* renamed from: ixc  reason: default package */
public final class ixc {
    private static final SpSharedPreferences.b<Object, Boolean> a;
    private static final SpSharedPreferences.b<Object, Boolean> b;

    static {
        SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("premium_mini_tooltip_in_npv_shown");
        h.d(e, "SpSharedPreferences.Pref…ni_tooltip_in_npv_shown\")");
        a = e;
        SpSharedPreferences.b<Object, Boolean> e2 = SpSharedPreferences.b.e("premium_mini_tooltip_on_track_row_shown");
        h.d(e2, "SpSharedPreferences.Pref…ltip_on_track_row_shown\")");
        b = e2;
    }

    public static final SpSharedPreferences.b<Object, Boolean> a() {
        return a;
    }

    public static final SpSharedPreferences.b<Object, Boolean> b() {
        return b;
    }
}
