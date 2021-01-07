package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.functions.g;

/* renamed from: tic  reason: default package */
public final /* synthetic */ class tic implements g {
    public final /* synthetic */ djc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ tic(djc djc, String str, long j) {
        this.a = djc;
        this.b = str;
        this.c = j;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, this.c, (PlayerContext) obj);
    }
}
