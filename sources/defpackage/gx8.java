package defpackage;

import com.spotify.voiceassistant.player.models.SearchRequest;
import io.reactivex.functions.g;

/* renamed from: gx8  reason: default package */
public final /* synthetic */ class gx8 implements g {
    public final /* synthetic */ iy8 a;
    public final /* synthetic */ vx8 b;

    public /* synthetic */ gx8(iy8 iy8, vx8 vx8) {
        this.a = iy8;
        this.b = vx8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.o(this.b, (SearchRequest) obj);
    }
}
