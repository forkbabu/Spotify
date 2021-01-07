package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: mx5  reason: default package */
public final /* synthetic */ class mx5 implements g {
    public final /* synthetic */ iy5 a;

    public /* synthetic */ mx5(iy5 iy5) {
        this.a = iy5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        iy5.l(this.a, (PlayerState) obj);
    }
}
