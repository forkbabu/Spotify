package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.features.ads.model.Targetings;
import com.spotify.music.productstate.c;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: qv3  reason: default package */
public class qv3 {
    static final SpSharedPreferences.b<Object, Boolean> f = SpSharedPreferences.b.e("key_voice_ads");
    private final SpSharedPreferences<Object> a;
    private final w52 b;
    private final h c;
    private final ov3 d;
    private final c e;

    public qv3(SpSharedPreferences<Object> spSharedPreferences, w52 w52, h hVar, ov3 ov3, c cVar) {
        this.a = spSharedPreferences;
        this.b = w52;
        this.c = hVar;
        this.d = ov3;
        this.e = cVar;
    }

    public boolean a() {
        return this.a.d(f, true);
    }

    public /* synthetic */ v b(boolean z, Boolean bool) {
        return this.c.a("voice_ads", Boolean.toString(z && bool.booleanValue()));
    }

    public void c(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(f, z);
        b2.i();
    }

    public s<Targetings> d(Context context) {
        boolean z = true;
        if (!this.d.a() || !this.b.f(context, "android.permission.RECORD_AUDIO") || !this.a.d(f, true)) {
            z = false;
        }
        return this.e.a().W(new nv3(this, z), false, Integer.MAX_VALUE);
    }
}
