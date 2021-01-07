package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: es4  reason: default package */
public final /* synthetic */ class es4 implements g {
    public final /* synthetic */ us4 a;

    public /* synthetic */ es4(us4 us4) {
        this.a = us4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.x((PlayerState) obj);
    }
}
