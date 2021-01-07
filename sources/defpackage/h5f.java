package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import defpackage.p2f;
import io.reactivex.functions.l;

/* renamed from: h5f  reason: default package */
public final /* synthetic */ class h5f implements l {
    public final /* synthetic */ q7f a;
    public final /* synthetic */ f b;
    public final /* synthetic */ d c;
    public final /* synthetic */ a8f f;

    public /* synthetic */ h5f(q7f q7f, f fVar, d dVar, a8f a8f) {
        this.a = q7f;
        this.b = fVar;
        this.c = dVar;
        this.f = a8f;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return k7f.g(this.a, this.b, this.c, this.f, (p2f.k) obj);
    }
}
