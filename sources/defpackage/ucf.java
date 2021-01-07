package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

/* renamed from: ucf  reason: default package */
public final /* synthetic */ class ucf implements g {
    public final /* synthetic */ zdf a;
    public final /* synthetic */ String b;

    public /* synthetic */ ucf(zdf zdf, String str) {
        this.a = zdf;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.g(this.b, (PlayerState) obj);
    }
}
