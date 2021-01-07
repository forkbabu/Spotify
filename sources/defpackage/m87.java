package defpackage;

import com.google.common.base.Optional;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: m87  reason: default package */
public final /* synthetic */ class m87 implements l {
    public final /* synthetic */ cqe a;

    public /* synthetic */ m87(cqe cqe) {
        this.a = cqe;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((PlayerState) obj).position(this.a.d()).or((Optional<Long>) -1L);
    }
}
