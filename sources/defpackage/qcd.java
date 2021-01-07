package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: qcd  reason: default package */
public class qcd {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("social_listening_host_education_shown");
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("social_listening_participant_education_shown");
    private final SpSharedPreferences<Object> a;

    public qcd(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public boolean a(boolean z) {
        return this.a.d(b, z);
    }

    public boolean b(boolean z) {
        return this.a.d(c, z);
    }

    public void c(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, z);
        b2.i();
    }

    public void d(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
    }
}
