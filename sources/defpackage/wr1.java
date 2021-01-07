package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: wr1  reason: default package */
public final /* synthetic */ class wr1 implements g {
    public final /* synthetic */ ps1 a;

    public /* synthetic */ wr1(ps1 ps1) {
        this.a = ps1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((PlayerState) obj);
    }
}
