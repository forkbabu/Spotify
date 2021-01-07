package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.a;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.k;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

public class i {
    private e a;

    public i(Context context) {
        this.a = new e(context, (String) null, (a) null);
    }

    public static AppEventsLogger.FlushBehavior b() {
        return e.c();
    }

    public static void k(Map<String, String> map) {
        l.i(map);
    }

    public void a() {
        e eVar = this.a;
        eVar.getClass();
        if (!uf.c(eVar)) {
            try {
                c.j(FlushReason.EXPLICIT);
            } catch (Throwable th) {
                uf.b(th, eVar);
            }
        }
    }

    public void c(String str, double d, Bundle bundle) {
        if (k.g()) {
            e eVar = this.a;
            eVar.getClass();
            if (!uf.c(eVar)) {
                try {
                    eVar.i(str, Double.valueOf(d), bundle, false, com.facebook.appevents.internal.a.o());
                } catch (Throwable th) {
                    uf.b(th, eVar);
                }
            }
        }
    }

    public void d(String str, Bundle bundle) {
        if (k.g()) {
            this.a.h(str, bundle);
        }
    }

    public void e(String str, String str2) {
        e eVar = this.a;
        eVar.getClass();
        if (!uf.c(eVar)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                eVar.h(str, bundle);
            } catch (Throwable th) {
                uf.b(th, eVar);
            }
        }
    }

    public void f(String str) {
        if (k.g()) {
            this.a.j(str, null, null);
        }
    }

    public void g(String str, Bundle bundle) {
        if (k.g()) {
            this.a.j(str, null, bundle);
        }
    }

    public void h(String str, Double d, Bundle bundle) {
        if (k.g()) {
            this.a.j(str, null, bundle);
        }
    }

    public void i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (k.g()) {
            e eVar = this.a;
            eVar.getClass();
            if (!uf.c(eVar)) {
                if (bigDecimal == null || currency == null) {
                    boolean z = k.n;
                    return;
                }
                if (bundle == null) {
                    try {
                        bundle = new Bundle();
                    } catch (Throwable th) {
                        uf.b(th, eVar);
                        return;
                    }
                }
                bundle.putString("fb_currency", currency.getCurrencyCode());
                eVar.i(str, Double.valueOf(bigDecimal.doubleValue()), bundle, true, com.facebook.appevents.internal.a.o());
            }
        }
    }

    public void j(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (k.g()) {
            e eVar = this.a;
            eVar.getClass();
            if (!uf.c(eVar)) {
                try {
                    eVar.k(bigDecimal, currency, bundle, true);
                } catch (Throwable th) {
                    uf.b(th, eVar);
                }
            }
        }
    }

    public i(Context context, String str) {
        this.a = new e(context, str, (a) null);
    }

    public i(String str, String str2, a aVar) {
        this.a = new e(str, str2, (a) null);
    }
}
