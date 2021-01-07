package defpackage;

import com.spotify.player.controls.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: l6f  reason: default package */
public final /* synthetic */ class l6f implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ a8f b;
    public final /* synthetic */ q7f c;

    public /* synthetic */ l6f(d dVar, a8f a8f, q7f q7f) {
        this.a = dVar;
        this.b = a8f;
        this.c = q7f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new h6f(this.a, this.b, this.c));
    }
}
