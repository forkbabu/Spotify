package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.n;

/* renamed from: il9  reason: default package */
public final /* synthetic */ class il9 implements n {
    public final /* synthetic */ tl9 a;

    public /* synthetic */ il9(tl9 tl9) {
        this.a = tl9;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((PlayerState) obj);
    }
}
