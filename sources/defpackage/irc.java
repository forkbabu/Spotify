package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.h;

/* renamed from: irc  reason: default package */
public final class irc extends krc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public irc(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.h.e(r2, r0)
            r0 = 2131951643(0x7f13001b, float:1.9539706E38)
            com.airbnb.lottie.l r2 = com.airbnb.lottie.e.j(r2, r0)
            java.lang.String r0 = "LottieCompositionFactory…inprogress_granular\n    )"
            kotlin.jvm.internal.h.d(r2, r0)
            java.lang.Object r2 = r2.b()
            kotlin.jvm.internal.h.c(r2)
            java.lang.String r0 = "LottieCompositionFactory…ar\n    )\n        .value!!"
            kotlin.jvm.internal.h.d(r2, r0)
            com.airbnb.lottie.d r2 = (com.airbnb.lottie.d) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irc.<init>(android.content.Context):void");
    }

    @Override // defpackage.krc
    public void c(LottieAnimationView lottieAnimationView, uqc uqc, uqc uqc2) {
        h.e(lottieAnimationView, "view");
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        if (uqc2 instanceof brc) {
            Object a = uqc2.a();
            if (!(a instanceof Integer)) {
                a = null;
            }
            Integer num = (Integer) a;
            if (num != null) {
                int intValue = num.intValue();
                a(lottieAnimationView);
                lottieAnimationView.l();
                float f = ((float) intValue) / 100.0f;
                if (f < ((float) 0)) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                lottieAnimationView.setProgress(f);
            }
        }
    }
}
