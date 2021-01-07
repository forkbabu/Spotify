package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import io.reactivex.functions.g;

/* renamed from: lec  reason: default package */
public final /* synthetic */ class lec implements g {
    public final /* synthetic */ oec a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ lec(oec oec, u3 u3Var) {
        this.a = oec;
        this.b = u3Var;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a(this.b, (LegacyPlayerState) obj);
    }
}
