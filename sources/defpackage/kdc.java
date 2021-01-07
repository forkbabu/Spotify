package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import defpackage.adc;
import io.reactivex.functions.g;

/* renamed from: kdc  reason: default package */
public final /* synthetic */ class kdc implements g {
    public final /* synthetic */ SpSharedPreferences a;
    public final /* synthetic */ hla b;

    public /* synthetic */ kdc(SpSharedPreferences spSharedPreferences, hla hla) {
        this.a = spSharedPreferences;
        this.b = hla;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences spSharedPreferences = this.a;
        hla hla = this.b;
        SpSharedPreferences.a b2 = spSharedPreferences.b();
        b2.f(tdc.d, "");
        b2.i();
        int ordinal = ((adc.d) obj).a().ordinal();
        if (ordinal == 0) {
            hla.d();
        } else if (ordinal == 1) {
            hla.e();
        }
    }
}
