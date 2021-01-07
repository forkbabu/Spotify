package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.libs.partnerapps.api.c;
import io.reactivex.s;

/* renamed from: tdc  reason: default package */
public final class tdc {
    public static final SpSharedPreferences.b<Object, String> d = SpSharedPreferences.b.e("key_auth_started_for_partner");
    private final c a;
    private final SpSharedPreferences<Object> b;
    private final mla c;

    tdc(c cVar, mla mla, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = cVar;
        this.c = mla;
        spSharedPreferences.getClass();
        this.b = spSharedPreferences;
    }

    public /* synthetic */ String a() {
        return this.b.m(d, "");
    }

    public q<bdc> b() {
        return i.a(this.a.b().D(qdc.a).A(odc.a).P(), this.c.a().j0(sdc.a), s.c0(new rdc(this)).j0(pdc.a));
    }
}
