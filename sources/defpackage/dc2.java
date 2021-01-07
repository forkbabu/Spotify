package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import com.spotify.voice.api.model.m;
import defpackage.jd2;
import io.reactivex.functions.l;

/* renamed from: dc2  reason: default package */
public final /* synthetic */ class dc2 implements l {
    public final /* synthetic */ m a;
    public final /* synthetic */ cqe b;

    public /* synthetic */ dc2(m mVar, cqe cqe) {
        this.a = mVar;
        this.b = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new jd2.a(this.a, ((PlayerState) obj).position(this.b.d()).or((Optional<Long>) 0L).longValue());
    }
}
