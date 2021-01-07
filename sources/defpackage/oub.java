package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: oub  reason: default package */
public final /* synthetic */ class oub implements g {
    public final /* synthetic */ zub a;

    public /* synthetic */ oub(zub zub) {
        this.a = zub;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        zub.a(this.a, (PlayerState) obj);
    }
}
