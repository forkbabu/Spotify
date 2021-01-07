package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: ht3  reason: default package */
public class ht3 {
    private final g<Ad> a;
    private final g<PlayerState> b;
    private final g<Long> c;
    private final y d;

    public ht3(g<Ad> gVar, g<PlayerState> gVar2, g<Long> gVar3, y yVar) {
        this.a = gVar;
        this.b = gVar2;
        this.c = gVar3;
        this.d = yVar;
    }

    public g<Optional<Long>> a() {
        return g.j(this.a.C(zs3.a), this.b, this.c, bt3.a).O(dt3.a).s().Q(this.d);
    }
}
