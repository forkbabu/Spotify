package defpackage;

import com.spotify.libs.connect.instrumentation.d;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: mr0  reason: default package */
class mr0 implements lr0 {
    static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("connect_in_background");
    private final SpSharedPreferences<Object> a;
    private final d b;

    public mr0(SpSharedPreferences<Object> spSharedPreferences, d dVar) {
        this.a = spSharedPreferences;
        this.b = dVar;
    }

    @Override // defpackage.lr0
    public void a(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.j();
        ((rt0) this.b.a()).a(Boolean.valueOf(z));
    }

    @Override // defpackage.lr0
    public boolean b() {
        return this.a.d(c, true);
    }
}
