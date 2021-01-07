package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.mobius.e0;
import defpackage.lp7;
import defpackage.mp7;
import kotlin.jvm.internal.h;

/* renamed from: ip7  reason: default package */
public final /* synthetic */ class ip7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ ip7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        np7 np7 = this.a;
        String a2 = ((mp7.g) obj).a();
        String B = l0.J(np7.o()).B();
        B.getClass();
        String replace = a2.replace("{uri}", B);
        h.e(replace, "reportAbuseUrl");
        return e0.a(z42.l(new lp7.e(replace)));
    }
}
