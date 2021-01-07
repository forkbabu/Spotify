package defpackage;

import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: vbf  reason: default package */
public final /* synthetic */ class vbf implements w {
    public final /* synthetic */ m a;
    public final /* synthetic */ f b;

    public /* synthetic */ vbf(m mVar, f fVar) {
        this.a = mVar;
        this.b = fVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new ncf(this.a, this.b));
    }
}
