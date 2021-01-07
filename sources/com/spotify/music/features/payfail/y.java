package com.spotify.music.features.payfail;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.music.features.payfail.BannerModel;
import com.spotify.rxjava2.q;
import io.reactivex.s;

public class y {
    static final SpSharedPreferences.b<Object, Long> m = SpSharedPreferences.b.e("pay_fail_first_impression_timestamp");
    static final SpSharedPreferences.b<Object, Integer> n = SpSharedPreferences.b.e("pay_fail_impression_check_count");
    static final SpSharedPreferences.b<Object, Boolean> o = SpSharedPreferences.b.e("pay_fail_last_impression_had_interaction");
    static final SpSharedPreferences.b<Object, Integer> p = SpSharedPreferences.b.e("pay_fail_impression_count");
    private final Context a;
    private final SpSharedPreferences<Object> b;
    private final PaymentFailureRepository c;
    private final a0 d;
    private final e0 e;
    private final cqe f;
    private final io.reactivex.y g;
    private final io.reactivex.y h;
    private final q i = new q();
    private r j;
    private Intent k;
    private xa1 l;

    public y(Context context, SpSharedPreferences<Object> spSharedPreferences, PaymentFailureRepository paymentFailureRepository, a0 a0Var, e0 e0Var, cqe cqe, io.reactivex.y yVar, io.reactivex.y yVar2) {
        this.a = context;
        this.b = spSharedPreferences;
        this.c = paymentFailureRepository;
        this.d = a0Var;
        this.e = e0Var;
        this.f = cqe;
        this.g = yVar;
        this.h = yVar2;
    }

    static void f(y yVar) {
        SpSharedPreferences.a<Object> b2 = yVar.b.b();
        b2.a(o, true);
        b2.i();
    }

    static void g(y yVar, xa1 xa1) {
        yVar.e.getClass();
        yVar.i.a(s.c0(new p(xa1)).I0(yVar.h).o0(yVar.g).subscribe(new g(yVar), j.a));
    }

    public static s k(y yVar, BannerModel bannerModel) {
        yVar.getClass();
        if (bannerModel.a() != BannerModel.Content.DOWNLOAD) {
            return s.i0(bannerModel);
        }
        return yVar.c.a().j0(h.a).r0(k.a);
    }

    public void h(Uri uri) {
        Intent intent = this.k;
        intent.getClass();
        intent.setData(uri);
        this.a.startActivity(this.k);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.music.features.payfail.BannerModel i() {
        /*
            r7 = this;
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r0 = r7.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Long> r1 = com.spotify.music.features.payfail.y.m
            r2 = -1
            long r0 = r0.j(r1, r2)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0011
            goto L_0x002d
        L_0x0011:
            cqe r2 = r7.f
            java.util.Calendar r2 = r2.e()
            cqe r3 = r7.f
            java.util.Calendar r3 = r3.e()
            r3.setTimeInMillis(r0)
            r0 = 5
            int r1 = r2.get(r0)
            int r0 = r3.get(r0)
            if (r1 != r0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r0 = r0 ^ r5
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r1 = r7.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Boolean> r2 = com.spotify.music.features.payfail.y.o
            boolean r1 = r1.d(r2, r4)
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r7.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.Integer> r3 = com.spotify.music.features.payfail.y.n
            r4 = -1
            int r2 = r2.f(r3, r4)
            if (r0 == 0) goto L_0x0050
            int r2 = r2 + 1
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r5 = r7.b
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$a r5 = r5.b()
            r5.b(r3, r2)
            r5.i()
        L_0x0050:
            if (r1 == 0) goto L_0x005d
            if (r0 == 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.NONE
            com.spotify.music.features.payfail.q r1 = new com.spotify.music.features.payfail.q
            r1.<init>(r0, r4)
            goto L_0x0079
        L_0x005d:
            if (r2 != 0) goto L_0x0067
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.GENERIC
            com.spotify.music.features.payfail.q r1 = new com.spotify.music.features.payfail.q
            r1.<init>(r0, r4)
            goto L_0x0079
        L_0x0067:
            r0 = 3
            if (r2 > r0) goto L_0x0072
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.DOWNLOAD
            com.spotify.music.features.payfail.q r1 = new com.spotify.music.features.payfail.q
            r1.<init>(r0, r4)
            goto L_0x0079
        L_0x0072:
            com.spotify.music.features.payfail.BannerModel$Content r0 = com.spotify.music.features.payfail.BannerModel.Content.PREMIUM_BENEFITS
            com.spotify.music.features.payfail.q r1 = new com.spotify.music.features.payfail.q
            r1.<init>(r0, r4)
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.payfail.y.i():com.spotify.music.features.payfail.BannerModel");
    }

    public void j(r rVar, BannerModel bannerModel) {
        this.j = rVar;
        rVar.i(new x(this));
        if (bannerModel.a() == BannerModel.Content.NONE) {
            rVar.setVisible(false);
            return;
        }
        rVar.setVisible(true);
        int ordinal = bannerModel.a().ordinal();
        if (ordinal == 1) {
            rVar.j(C0707R.string.payment_failure_banner_title_generic_content);
            rVar.h(C0707R.string.payment_failure_banner_description_generic_content);
            rVar.g(C0707R.string.payment_failure_banner_cta_ab_test);
        } else if (ordinal == 2) {
            int b2 = bannerModel.b();
            if (b2 < 10) {
                rVar.j(C0707R.string.payment_failure_banner_title_downloaded_content);
            } else {
                rVar.k(this.a.getString(C0707R.string.payment_failure_banner_title_downloaded_content_with_x, Integer.valueOf(b2)));
            }
            rVar.h(C0707R.string.payment_failure_banner_description_downloaded_content);
            rVar.g(C0707R.string.payment_failure_banner_cta_ab_test);
        } else if (ordinal == 3) {
            rVar.j(C0707R.string.payment_failure_banner_title_benefit_content);
            rVar.h(C0707R.string.payment_failure_banner_description_benefit_content);
            rVar.g(C0707R.string.payment_failure_banner_cta_ab_test);
        }
        SpSharedPreferences<Object> spSharedPreferences = this.b;
        SpSharedPreferences.b<Object, Integer> bVar = p;
        int f2 = spSharedPreferences.f(bVar, 0) + 1;
        this.d.a("impression", (long) f2);
        SpSharedPreferences.a<Object> b3 = this.b.b();
        b3.e(m, this.f.d());
        b3.b(bVar, f2);
        b3.h(o);
        b3.i();
    }

    public void l(r rVar, Intent intent, xa1 xa1) {
        this.k = intent;
        this.l = xa1;
        boolean z = true;
        if (xa1 == null || !xa1.c()) {
            Logger.b("No payment failure (%s)", this.l);
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.h(m);
            b2.h(n);
            b2.h(o);
            b2.h(p);
            b2.i();
            z = false;
        } else {
            Logger.b("Has payment failure (%s)", this.l);
        }
        if (!z) {
            rVar.setVisible(false);
        } else {
            this.i.a(s.c0(new l(this)).W(new n(this), false, Integer.MAX_VALUE).I0(this.h).o0(this.g).subscribe(new m(this, rVar), i.a));
        }
    }
}
