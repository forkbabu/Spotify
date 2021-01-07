package defpackage;

import com.spotify.player.controls.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: kve  reason: default package */
public final /* synthetic */ class kve implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ t0f b;

    public /* synthetic */ kve(d dVar, t0f t0f) {
        this.a = dVar;
        this.b = t0f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new pye(this.a, this.b));
    }
}
