package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import defpackage.adc;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: mdc  reason: default package */
public final class mdc {
    private final hla a;
    private final mcc b;
    private final e92 c;
    private final SpSharedPreferences<Object> d;
    private final mla e;
    private final y f;

    mdc(hla hla, mcc mcc, e92 e92, mla mla, y yVar, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = hla;
        this.b = mcc;
        this.c = e92;
        this.e = mla;
        this.f = yVar;
        spSharedPreferences.getClass();
        this.d = spSharedPreferences;
    }

    public w<adc, bdc> a() {
        m f2 = i.f();
        f2.e(adc.c.class, new ldc(this.a), this.f);
        f2.e(adc.a.class, new gdc(this.d, this.a), this.f);
        f2.h(adc.e.class, new hdc(this.e));
        f2.e(adc.f.class, new edc(this.c), this.f);
        f2.h(adc.b.class, new fdc(this.b));
        f2.d(adc.d.class, new kdc(this.d, this.a));
        return f2.i();
    }
}
