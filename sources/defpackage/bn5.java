package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.a;
import kotlin.jvm.internal.h;

/* renamed from: bn5  reason: default package */
public final class bn5 extends a {
    private final com.spotify.music.features.listeninghistory.presenter.a c;

    public bn5(com.spotify.music.features.listeninghistory.presenter.a aVar) {
        h.e(aVar, "presenter");
        this.c = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public boolean e() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public int f() {
        return 5;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public void g(int i, int i2) {
        this.c.e();
    }
}
