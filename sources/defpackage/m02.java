package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.t;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: m02  reason: default package */
public class m02 {
    private final c a;
    private final ViewUris.SubView b;
    private t c;
    private p d;
    private t02 e;
    private Offer f;
    private final Reason g;
    private final String h;
    private final String i;
    private boolean j;

    /* access modifiers changed from: protected */
    /* renamed from: m02$a */
    public class a implements p.a {
        protected a() {
        }

        @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p.a
        public void a(Offer offer) {
            String str;
            String str2;
            m02.this.f = offer;
            Offer offer2 = m02.this.f;
            t02 t02 = m02.this.e;
            if (offer2 == null) {
                str = t02.k();
            } else if (Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equals(offer2.adTargetingKey())) {
                str = t02.i();
            } else {
                str = t02.k();
            }
            m02.this.c.w2(str);
            m02.this.c.h2(0);
            Offer offer3 = m02.this.f;
            t02 t022 = m02.this.e;
            CharSequence charSequence = "";
            if (offer3 != null) {
                str2 = Offer.AD_TARGETING_KEY_7_DAY_TRIAL.equals(offer3.adTargetingKey()) ? t022.j() : Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(offer3.adTargetingKey()) ? t022.b() : null;
            } else {
                str2 = charSequence;
            }
            if (!MoreObjects.isNullOrEmpty(str2)) {
                m02.this.c.x1(str2);
                m02.this.c.y1(0);
            } else {
                m02.this.c.y1(8);
            }
            Offer offer4 = m02.this.f;
            t02 t023 = m02.this.e;
            if (offer4 != null) {
                String adTargetingKey = offer4.adTargetingKey();
                if ("premium".equals(adTargetingKey) || Offer.AD_TARGETING_KEY_30_DAY_TRIAL.equals(adTargetingKey)) {
                    charSequence = t023.e(adTargetingKey);
                }
            }
            m02.this.c.K(charSequence);
            if (m02.this.j) {
                m02.this.j = false;
                p pVar = m02.this.d;
                m02.this.getClass();
                pVar.i(offer, null, m02.this.g, m02.this.h, m02.this.i, m02.this.a);
            }
        }

        @Override // com.spotify.mobile.android.ui.activity.upsell.premiumdestination.p.a
        public void b(String str) {
            m02.this.c.h2(8);
            m02.this.c.y1(8);
            m02.this.c.K("");
        }
    }

    public m02(Reason reason, String str, boolean z, t tVar, p pVar, t02 t02, c cVar, ViewUris.SubView subView, String str2) {
        t02.getClass();
        this.e = t02;
        pVar.getClass();
        this.d = pVar;
        reason.getClass();
        this.g = reason;
        this.j = z;
        this.i = str2;
        subView.getClass();
        this.b = subView;
        this.h = str;
        tVar.getClass();
        this.c = tVar;
        cVar.getClass();
        this.a = cVar;
    }

    public void l() {
        String f2 = this.d.f();
        if ("TH".equals(f2)) {
            this.d.k("https://www.spotify.com/th-th/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("PH".equals(f2)) {
            this.d.k("https://www.spotify.com/ph/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("ID".equals(f2)) {
            this.d.k("https://www.spotify.com/id/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else if ("MY".equals(f2)) {
            this.d.k("https://www.spotify.com/my-en/premium/?utm_source=spotify&utm_medium=android_client&utm_campaign=premiumpage");
        } else {
            this.d.a(this.g, null, this.h, this.a, this.b, this.f, this.i);
        }
    }

    public void m() {
        this.d.b(this.f, this.g, null, this.h, this.i, this.a);
    }
}
