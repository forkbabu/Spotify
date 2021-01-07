package defpackage;

import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.spotlets.radio.model.ThumbState;
import defpackage.ff2;

@Deprecated
/* renamed from: es1  reason: default package */
public final class es1 extends yr1 {
    public es1(v1 v1Var, ff2.a aVar) {
        super(v1Var, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ff2
    public void d() {
        c(new AppProtocol.Rating(ThumbState.NONE));
    }

    @Override // defpackage.ff2
    public void f(df2 df2, int i) {
        c(new AppProtocol.Rating(ThumbState.NONE));
    }
}
