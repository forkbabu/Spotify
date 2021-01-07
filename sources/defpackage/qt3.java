package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.ads.h0;
import com.spotify.music.features.ads.i0;
import com.spotify.music.features.ads.sponsorship.model.Sponsorship;
import com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData;
import defpackage.cu3;
import defpackage.st3;
import retrofit2.v;

/* renamed from: qt3  reason: default package */
public class qt3 implements cu3.a {
    private final h0 a;
    private final jz1 b;
    private final i0 c;
    private final pt3 d;
    private SponsorshipAdData e;
    private Sponsorship f;
    private boolean g;
    private String h;

    /* access modifiers changed from: package-private */
    /* renamed from: qt3$a */
    public class a implements st3.a<SponsorshipAdData> {
        final /* synthetic */ String a;
        final /* synthetic */ cu3 b;

        a(String str, cu3 cu3) {
            this.a = str;
            this.b = cu3;
        }

        @Override // defpackage.st3.a
        public void a(v<SponsorshipAdData> vVar) {
            Logger.b("Sponsorship request for %s loaded successfully", this.a);
            qt3.this.i(vVar.a());
            if (qt3.this.e != null) {
                this.b.setLogo(qt3.this.e.logoUrl());
                this.b.setTitle(qt3.this.e.advertiserName());
            }
        }

        @Override // defpackage.st3.a
        public void onError(Throwable th) {
            Logger.b("Failed to retrieve sponsorship data for %s", this.a);
            du3 du3 = (du3) this.b;
            ((Activity) du3.getContext()).runOnUiThread(new yt3(du3));
        }
    }

    public qt3(h0 h0Var, jz1 jz1, i0 i0Var, pt3 pt3) {
        this.a = h0Var;
        this.b = jz1;
        this.c = i0Var;
        this.d = pt3;
    }

    public boolean b() {
        return this.g;
    }

    public void c(String str) {
        SponsorshipAdData sponsorshipAdData;
        if (!this.g && (sponsorshipAdData = this.e) != null) {
            this.b.a(this.a.b("", "sponsored-context", sponsorshipAdData.lineItemId(), this.e.creativeId(), str));
            this.g = true;
        }
    }

    public void d() {
        SponsorshipAdData sponsorshipAdData;
        if (!this.g && (sponsorshipAdData = this.e) != null) {
            this.b.a(this.a.c("", "sponsored-context", sponsorshipAdData.lineItemId(), this.e.creativeId()));
            this.c.a(this.e.impression());
            this.c.a(this.e.thirdPartyImpression());
            this.g = true;
            this.f.displayedDuringSession();
        }
    }

    public void e(Context context) {
        SponsorshipAdData sponsorshipAdData = this.e;
        if (sponsorshipAdData != null && !MoreObjects.isNullOrEmpty(sponsorshipAdData.clickThroughUrl())) {
            this.b.a(this.a.a("", "sponsored-context", this.e.lineItemId(), this.e.creativeId()));
            this.c.a(this.e.clickTrackingUrl());
            i0 i0Var = this.c;
            Uri parse = Uri.parse(this.e.clickThroughUrl());
            i0Var.getClass();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (ActivityNotFoundException unused) {
                Assertion.g("Could not open ad URI: " + parse);
            }
        }
    }

    public void f(cu3 cu3) {
        String str = this.h;
        if (str != null) {
            Sponsorship e2 = this.d.e(str);
            if (e2 != null) {
                this.f = e2;
                this.d.j(str, new a(str, cu3));
                return;
            }
            this.e = this.d.d();
            this.f = Sponsorship.create(Long.MIN_VALUE, Long.MAX_VALUE, "spotify:ad:preview");
            if (this.e != null) {
                Logger.b("Ad sponsorship - preview", new Object[0]);
                SponsorshipAdData sponsorshipAdData = this.e;
                this.e = sponsorshipAdData;
                cu3.setLogo(sponsorshipAdData.logoUrl());
                cu3.setTitle(this.e.advertiserName());
            }
        }
    }

    public void g(String str) {
        this.h = str;
    }

    public void h(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public void i(SponsorshipAdData sponsorshipAdData) {
        this.e = sponsorshipAdData;
    }
}
