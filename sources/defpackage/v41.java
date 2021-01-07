package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: v41  reason: default package */
public final /* synthetic */ class v41 implements g {
    public final /* synthetic */ z41 a;

    public /* synthetic */ v41(z41 z41) {
        this.a = z41;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((PlayerState) obj);
    }
}
