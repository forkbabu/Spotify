package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.internal.h;

/* renamed from: nrc  reason: default package */
public final class nrc extends krc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nrc(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrc.<init>(android.content.Context):void");
    }

    @Override // defpackage.krc
    public void c(LottieAnimationView lottieAnimationView, uqc uqc, uqc uqc2) {
        h.e(lottieAnimationView, "view");
        h.e(uqc, "fromState");
        h.e(uqc2, "toState");
        Object a = uqc.a();
        Object a2 = uqc2.a();
        if ((a instanceof Integer) && (a2 instanceof Integer)) {
            a(lottieAnimationView);
            float intValue = ((float) ((Number) a).intValue()) / 100.0f;
            float f = (float) 0;
            float f2 = 0.0f;
            if (intValue < f) {
                intValue = 0.0f;
            } else if (intValue > 1.0f) {
                intValue = 1.0f;
            }
            float intValue2 = ((float) ((Number) a2).intValue()) / 100.0f;
            if (intValue2 >= f) {
                f2 = intValue2 > 1.0f ? 1.0f : intValue2;
            }
            if (intValue > f2) {
                lottieAnimationView.l();
                lottieAnimationView.setProgress(f2);
                return;
            }
            lottieAnimationView.setMinProgress(intValue);
            lottieAnimationView.setMaxProgress(f2);
            b(lottieAnimationView);
        }
    }
}
