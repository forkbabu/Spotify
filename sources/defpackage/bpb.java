package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: bpb  reason: default package */
public class bpb {
    private final g<Ad> a;
    private final g<PlayerState> b;

    public bpb(g<Ad> gVar, g<PlayerState> gVar2) {
        this.a = gVar;
        this.b = gVar2;
    }

    public g<Boolean> a() {
        return g.i(this.a, this.b, yob.a);
    }
}
