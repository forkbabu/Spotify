package defpackage;

import com.spotify.voiceassistant.player.models.SearchRequest;
import io.reactivex.functions.g;

/* renamed from: hx8  reason: default package */
public final /* synthetic */ class hx8 implements g {
    public final /* synthetic */ iy8 a;
    public final /* synthetic */ vx8 b;

    public /* synthetic */ hx8(iy8 iy8, vx8 vx8) {
        this.a = iy8;
        this.b = vx8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m(this.b, (SearchRequest) obj);
    }
}
