package defpackage;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.g;

/* renamed from: ppb  reason: default package */
public final /* synthetic */ class ppb implements g {
    public final /* synthetic */ gqb a;
    public final /* synthetic */ Ad b;

    public /* synthetic */ ppb(gqb gqb, Ad ad) {
        this.a = gqb;
        this.b = ad;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (String) obj);
    }
}
