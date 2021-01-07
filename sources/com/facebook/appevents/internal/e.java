package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.i;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.h0;
import com.facebook.internal.n;
import com.facebook.k;
import java.math.BigDecimal;
import java.util.Currency;

public class e {
    private static final String a = "com.facebook.appevents.internal.e";
    private static final i b = new i(k.d());
    public static final /* synthetic */ int c = 0;

    private static class a {
        BigDecimal a;
        Currency b;
        Bundle c;

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }
    }

    public static boolean a() {
        n j = FetchedAppSettingsManager.j(k.e());
        return j != null && k.g() && j.f();
    }

    public static void b(String str, long j) {
        Context d = k.d();
        String e = k.e();
        h0.f(d, "context");
        n n = FetchedAppSettingsManager.n(e, false);
        if (n != null && n.a() && j > 0) {
            i iVar = new i(d);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            iVar.c("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012c, code lost:
        if (r10.isEmpty() == false) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void c(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.e.c(java.lang.String, java.lang.String, boolean):void");
    }
}
