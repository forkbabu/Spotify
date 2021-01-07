package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.h;

/* renamed from: epd  reason: default package */
public final class epd {
    private final wlf<Boolean> a;

    public epd(wlf<Boolean> wlf) {
        h.e(wlf, "alternativeResultsShowIntent");
        this.a = wlf;
    }

    public s a(Intent intent, l0 l0Var) {
        h.e(intent, "intent");
        h.e(l0Var, "link");
        if (intent.getStringExtra("android.intent.extra.user_query") != null) {
            intent.getStringExtra("query");
            l0Var.F();
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r0 = kotlin.jvm.internal.h.a(r0, r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "android.intent.extra.user_query"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto L_0x0026
            boolean r4 = kotlin.text.e.n(r4)
            if (r4 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r4 = 0
            goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            if (r4 != 0) goto L_0x002b
            r4 = 1
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 == 0) goto L_0x0042
            wlf<java.lang.Boolean> r4 = r3.a
            java.lang.Object r4 = r4.get()
            java.lang.String r0 = "alternativeResultsShowIntent.get()"
            kotlin.jvm.internal.h.d(r4, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0042
            r1 = 1
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epd.b(android.content.Intent):boolean");
    }
}
