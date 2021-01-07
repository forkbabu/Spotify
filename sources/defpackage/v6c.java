package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: v6c  reason: default package */
public final /* synthetic */ class v6c implements g {
    public final /* synthetic */ h7c a;

    public /* synthetic */ v6c(h7c h7c) {
        this.a = h7c;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        h7c.a(this.a, (PlayerState) obj);
    }
}
