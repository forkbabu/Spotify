package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.sponsorship.model.Sponsorship;
import com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import defpackage.st3;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: pt3  reason: default package */
public class pt3 {
    private final st3 a;
    private Sponsorships b;
    private final wt3 c;
    private boolean d;
    private final dqe e;
    private final Runnable f = new jt3(this);
    private SponsorshipAdData g;

    public pt3(dqe dqe, wt3 wt3, st3 st3) {
        this.e = dqe;
        this.a = st3;
        this.c = wt3;
        this.d = false;
    }

    static void c(pt3 pt3, long j) {
        pt3.c.f();
        pt3.e.b(pt3.f);
        pt3.e.c(pt3.f, j, TimeUnit.SECONDS);
    }

    public SponsorshipAdData d() {
        SponsorshipAdData sponsorshipAdData = this.g;
        this.g = null;
        return sponsorshipAdData;
    }

    public Sponsorship e(String str) {
        if (!this.d) {
            Logger.b("Sponsorships are not enabled : %s", str);
            return null;
        }
        Sponsorships sponsorships = this.b;
        Sponsorship sponsorship = sponsorships != null ? sponsorships.getSponsorship(str) : null;
        if (!this.c.c(sponsorship)) {
            return null;
        }
        Logger.b("Sponsorship is active : %s", str);
        return sponsorship;
    }

    public boolean f() {
        return this.g != null;
    }

    public void g() {
        this.a.a(new ot3(this));
    }

    public void h(boolean z) {
        this.d = z;
        if (!z) {
            this.b = null;
            this.c.f();
            this.e.b(this.f);
        } else if (this.c.b(this.b)) {
            this.a.a(new ot3(this));
        }
    }

    public void i(Ad ad) {
        try {
            this.g = SponsorshipAdData.fromPreviewAd(ad);
            Logger.g("Sponsorship loaded, go to any playlist to show it", new Object[0]);
        } catch (JSONException unused) {
            Logger.g("Malformed sponsorship ad data", new Object[0]);
        }
    }

    public void j(String str, st3.a<SponsorshipAdData> aVar) {
        this.a.b(str, aVar);
    }
}
