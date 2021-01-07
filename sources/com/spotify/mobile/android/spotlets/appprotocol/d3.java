package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.i4;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.g;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class d3 implements g {
    public final /* synthetic */ i4.e a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ d3(i4.e eVar, oq1 oq1) {
        this.a = eVar;
        this.b = oq1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Object obj2;
        i4.e eVar = this.a;
        oq1 oq1 = this.b;
        Throwable th = (Throwable) obj;
        eVar.getClass();
        if (th instanceof TimeoutException) {
            Locale locale = Locale.ENGLISH;
            Assertion.w(String.format(locale, "WAMP request timed out for id: %d, proc: %s", Integer.valueOf(oq1.i()), oq1.h()), th);
            i4.this.b(48, oq1.i(), String.format(locale, "Timeout running %s", oq1.h()), null);
            return;
        }
        Logger.n("WAMP failed request with id: %d, proc: %s, error: %s", Integer.valueOf(oq1.i()), oq1.h(), th);
        if (th instanceof IapException) {
            obj2 = ((IapException) th).reason;
        } else {
            obj2 = th.getClass();
        }
        i4.this.b(48, oq1.i(), obj2, th.getMessage());
    }
}
