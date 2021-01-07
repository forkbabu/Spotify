package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.AdBreakState;
import com.spotify.music.features.ads.model.AdProduct;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: tr3  reason: default package */
class tr3 implements l<AdBreakState, s<Optional<AdProduct>>> {
    private final vr3 a;
    private final zr3 b;

    public tr3(vr3 vr3, zr3 zr3) {
        this.a = vr3;
        this.b = zr3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public s<Optional<AdProduct>> apply(AdBreakState adBreakState) {
        if (adBreakState == AdBreakState.IDLE) {
            return s.i0(Optional.absent());
        }
        return this.b.a().Q(jr3.a).j0(this.a).E().j0(kr3.a);
    }
}
