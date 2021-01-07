package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: qs1  reason: default package */
public final /* synthetic */ class qs1 implements g {
    public final /* synthetic */ ts1 a;

    public /* synthetic */ qs1(ts1 ts1) {
        this.a = ts1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((PlayerState) obj);
    }
}
