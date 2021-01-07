package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: uc2  reason: default package */
public final /* synthetic */ class uc2 implements w {
    public final /* synthetic */ f a;
    public final /* synthetic */ lxd b;
    public final /* synthetic */ d c;

    public /* synthetic */ uc2(f fVar, lxd lxd, d dVar) {
        this.a = fVar;
        this.b = lxd;
        this.c = dVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new xc2(this.a, this.b, this.c));
    }
}
