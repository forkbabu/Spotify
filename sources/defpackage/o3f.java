package defpackage;

import com.spotify.player.options.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: o3f  reason: default package */
public final /* synthetic */ class o3f implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ q7f b;

    public /* synthetic */ o3f(d dVar, q7f q7f) {
        this.a = dVar;
        this.b = q7f;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.Y(new n6f(this.a, this.b)).N();
    }
}
