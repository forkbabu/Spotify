package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: tl2  reason: default package */
public class tl2 {
    static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("key_canvas_enabled");
    private final SpSharedPreferences<Object> a;

    tl2(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.a.d(b, true);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, z);
        b2.i();
    }
}
