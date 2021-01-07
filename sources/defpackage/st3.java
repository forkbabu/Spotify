package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: st3  reason: default package */
public class st3 {
    private final vt3 a;
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();

    /* renamed from: st3$a */
    public interface a<T> {
        void a(v<T> vVar);

        void onError(Throwable th);
    }

    public st3(vt3 vt3) {
        this.a = vt3;
    }

    public void a(a<Sponsorships> aVar) {
        Logger.b("Ads Sponsorship data requested", new Object[0]);
        this.b.b(this.a.b().subscribe(new mt3(aVar), new nt3(aVar)));
    }

    public void b(String str, a<SponsorshipAdData> aVar) {
        if (!str.isEmpty()) {
            io.reactivex.disposables.a aVar2 = this.b;
            z<v<SponsorshipAdData>> a2 = this.a.a(str);
            aVar.getClass();
            aVar2.b(a2.subscribe(new mt3(aVar), new nt3(aVar)));
        }
    }
}
