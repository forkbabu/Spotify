package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: m3f  reason: default package */
public final /* synthetic */ class m3f implements w {
    public final /* synthetic */ q7f a;
    public final /* synthetic */ f b;
    public final /* synthetic */ d c;
    public final /* synthetic */ a8f d;

    public /* synthetic */ m3f(q7f q7f, f fVar, d dVar, a8f a8f) {
        this.a = q7f;
        this.b = fVar;
        this.c = dVar;
        this.d = a8f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new h5f(this.a, this.b, this.c, this.d));
    }
}
