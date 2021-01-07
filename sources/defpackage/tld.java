package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: tld  reason: default package */
public final /* synthetic */ class tld implements l {
    public final /* synthetic */ xld a;
    public final /* synthetic */ String b;

    public /* synthetic */ tld(xld xld, String str) {
        this.a = xld;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d(this.b, (PlayerState) obj);
    }
}
