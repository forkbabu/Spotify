package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.e;
import com.spotify.mobile.android.service.session.f;
import com.spotify.music.features.ads.sponsorship.model.Sponsorship;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import com.spotify.rxjava2.p;

/* renamed from: wt3  reason: default package */
public class wt3 {
    private long a;
    private long b;
    private final f c;
    private final cqe d;
    private final p e = new p();

    public wt3(f fVar, cqe cqe) {
        this.c = fVar;
        this.d = cqe;
        this.a = cqe.d() / 1000;
        this.b = a();
    }

    private long a() {
        return this.d.b() / 1000;
    }

    public boolean b(Sponsorships sponsorships) {
        if (sponsorships == null) {
            return true;
        }
        if (sponsorships.getTTLSeconds() + this.b < a()) {
            return true;
        }
        return false;
    }

    public boolean c(Sponsorship sponsorship) {
        if (sponsorship == null) {
            return false;
        }
        long a2 = (this.a + a()) - this.b;
        boolean z = sponsorship.endTime().longValue() == 0;
        if (sponsorship.startTime().longValue() > a2) {
            return false;
        }
        if (z || sponsorship.endTime().longValue() > a2) {
            return true;
        }
        return false;
    }

    public void d(e eVar) {
        Optional<Long> call = eVar.call();
        if (call.isPresent()) {
            Logger.b("Cosmos: Ads ServerTimeProvider serverTime: %s", call);
            this.a = call.get().longValue();
            this.b = a();
        }
    }

    public void e() {
        this.e.b(this.c.b().subscribe(new lt3(this), kt3.a));
    }

    public void f() {
        this.e.a();
    }
}
