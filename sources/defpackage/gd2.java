package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.ads.voice.domain.r;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: gd2  reason: default package */
public final /* synthetic */ class gd2 implements g {
    public final /* synthetic */ r.i a;
    public final /* synthetic */ cqe b;
    public final /* synthetic */ kv3 c;
    public final /* synthetic */ gl0 f;

    public /* synthetic */ gd2(r.i iVar, cqe cqe, kv3 kv3, gl0 gl0) {
        this.a = iVar;
        this.b = cqe;
        this.c = kv3;
        this.f = gl0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        r.i iVar;
        cqe cqe;
        jd2.h(iVar.a(), cqe, "", this.c, iVar.c(), ((PlayerState) obj).position(this.b.d()).or((Optional<Long>) 0L).longValue(), this.f, this.a.b());
    }
}
