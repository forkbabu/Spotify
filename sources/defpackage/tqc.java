package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: tqc  reason: default package */
public final class tqc implements vqc {
    private uqc a = new zqc();
    private String b;
    private final wqc c;

    public tqc(wqc wqc) {
        h.e(wqc, "lottieStateGraph");
        this.c = wqc;
    }

    @Override // defpackage.vqc
    public void a(String str, uqc uqc, LottieAnimationView lottieAnimationView) {
        h.e(str, "id");
        h.e(uqc, "newState");
        h.e(lottieAnimationView, "view");
        krc a2 = this.c.a(this.a, uqc);
        if ((!h.a(str, this.b)) || (a2 == null && (!h.a(j.b(this.a.getClass()), j.b(uqc.getClass()))))) {
            zqc zqc = new zqc();
            this.a = zqc;
            a2 = this.c.a(zqc, uqc);
        }
        if (a2 != null) {
            a2.c(lottieAnimationView, this.a, uqc);
        }
        this.a = uqc;
        this.b = str;
    }
}
