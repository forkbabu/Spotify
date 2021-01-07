package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: pha  reason: default package */
public final /* synthetic */ class pha implements g {
    public final /* synthetic */ rha a;

    public /* synthetic */ pha(rha rha) {
        this.a = rha;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((PlayerState) obj);
    }
}
