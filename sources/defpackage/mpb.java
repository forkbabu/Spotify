package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: mpb  reason: default package */
public final /* synthetic */ class mpb implements g {
    public final /* synthetic */ gqb a;
    public final /* synthetic */ Ad b;

    public /* synthetic */ mpb(gqb gqb, Ad ad) {
        this.a = gqb;
        this.b = ad;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, (PlayerState) obj);
    }
}
