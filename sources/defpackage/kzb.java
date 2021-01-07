package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: kzb  reason: default package */
public final /* synthetic */ class kzb implements g {
    public final /* synthetic */ lzb a;

    public /* synthetic */ kzb(lzb lzb) {
        this.a = lzb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        lzb.c(this.a, (PlayerState) obj);
    }
}
