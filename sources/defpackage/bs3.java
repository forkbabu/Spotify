package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.AdBreakState;
import com.spotify.music.features.ads.model.AdProduct;
import io.reactivex.s;

/* renamed from: bs3  reason: default package */
public class bs3 {
    private final tr3 a;
    private final s<AdBreakState> b;

    public bs3(s<AdBreakState> sVar, tr3 tr3) {
        this.a = tr3;
        this.b = sVar;
    }

    public s<Optional<AdProduct>> a() {
        return this.b.J0(this.a);
    }
}
