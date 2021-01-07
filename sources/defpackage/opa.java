package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.a;

/* renamed from: opa  reason: default package */
public class opa extends a {
    private final int c;
    private final ajf<npa> f;

    public opa(int i, ajf<npa> ajf) {
        this.c = i;
        this.f = ajf;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public boolean e() {
        return this.f.get().j();
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public int f() {
        return 10;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public void g(int i, int i2) {
        this.f.get().h(i + this.c);
    }
}
