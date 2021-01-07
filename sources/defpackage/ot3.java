package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import defpackage.st3;
import retrofit2.v;

/* access modifiers changed from: package-private */
/* renamed from: ot3  reason: default package */
public class ot3 implements st3.a<Sponsorships> {
    final /* synthetic */ pt3 a;

    ot3(pt3 pt3) {
        this.a = pt3;
    }

    @Override // defpackage.st3.a
    public void a(v<Sponsorships> vVar) {
        Sponsorships a2 = vVar.a();
        Logger.b("Ads Sponsorships data received : %s", a2);
        if (a2 != null) {
            a2.preserveDisplayState(this.a.b);
            this.a.b = a2;
            try {
                this.a.b.setTTLSeconds(Long.parseLong(vVar.e().c("MC-TTL")));
            } catch (NumberFormatException e) {
                Logger.b("Ads Caught a NumberFormatException when parsing sponsorships data ttl : %s", e.getMessage());
            }
            pt3 pt3 = this.a;
            pt3.c(pt3, pt3.b.getTTLSeconds());
        }
    }

    @Override // defpackage.st3.a
    public void onError(Throwable th) {
        Logger.c(th, "Ads Exception when fetching Hermes Sponsorship content: %s", th.getMessage());
        pt3.c(this.a, 1800);
    }
}
