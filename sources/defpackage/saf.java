package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: saf  reason: default package */
public final /* synthetic */ class saf implements w {
    public final /* synthetic */ PlayerState a;
    public final /* synthetic */ d b;

    public /* synthetic */ saf(PlayerState playerState, d dVar) {
        this.a = playerState;
        this.b = dVar;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new acf(this.a, this.b));
    }
}
