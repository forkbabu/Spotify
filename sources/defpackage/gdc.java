package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import defpackage.adc;
import io.reactivex.functions.g;

/* renamed from: gdc  reason: default package */
public final /* synthetic */ class gdc implements g {
    public final /* synthetic */ SpSharedPreferences a;
    public final /* synthetic */ hla b;

    public /* synthetic */ gdc(SpSharedPreferences spSharedPreferences, hla hla) {
        this.a = spSharedPreferences;
        this.b = hla;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences spSharedPreferences = this.a;
        hla hla = this.b;
        adc.a aVar = (adc.a) obj;
        String g = aVar.b().g();
        SpSharedPreferences.a b2 = spSharedPreferences.b();
        b2.f(tdc.d, g);
        b2.i();
        hla.c(aVar.a());
    }
}
