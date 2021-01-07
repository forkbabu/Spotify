package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.functions.g;

/* renamed from: r41  reason: default package */
public final /* synthetic */ class r41 implements g {
    public final /* synthetic */ z41 a;

    public /* synthetic */ r41(z41 z41) {
        this.a = z41;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        z41.a(this.a, (PlayerContext) obj);
    }
}
