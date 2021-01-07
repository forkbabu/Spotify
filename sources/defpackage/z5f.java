package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.play.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: z5f  reason: default package */
public final /* synthetic */ class z5f implements w {
    public final /* synthetic */ f a;
    public final /* synthetic */ d b;
    public final /* synthetic */ a8f c;

    public /* synthetic */ z5f(f fVar, d dVar, a8f a8f) {
        this.a = fVar;
        this.b = dVar;
        this.c = a8f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new r6f(this.a, this.b, this.c));
    }
}
