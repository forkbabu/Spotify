package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: yic  reason: default package */
public final /* synthetic */ class yic implements g {
    public final /* synthetic */ fjc a;

    public /* synthetic */ yic(fjc fjc) {
        this.a = fjc;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        fjc.d(this.a, (PlayerState) obj);
    }
}
