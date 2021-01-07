package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: pub  reason: default package */
public final /* synthetic */ class pub implements g {
    public final /* synthetic */ avb a;

    public /* synthetic */ pub(avb avb) {
        this.a = avb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        avb.a(this.a, (PlayerState) obj);
    }
}
