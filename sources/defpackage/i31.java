package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: i31  reason: default package */
public class i31 {
    public static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("marketing-opt-in-prefs-key");
    public static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("marketing-opt-in-updated-prefs-key");
    private final SpSharedPreferences<Object> a;

    public i31(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public void a(boolean z, boolean z2) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, z);
        b2.i();
        SpSharedPreferences.a<Object> b3 = this.a.b();
        b3.a(c, z2);
        b3.i();
    }
}
