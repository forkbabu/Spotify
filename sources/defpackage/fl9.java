package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: fl9  reason: default package */
public final /* synthetic */ class fl9 implements g {
    public final /* synthetic */ pl9 a;

    public /* synthetic */ fl9(pl9 pl9) {
        this.a = pl9;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.G2((PlayerState) obj);
    }
}
