package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.a;

/* renamed from: i5b  reason: default package */
public class i5b extends a {
    private l2b c;

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

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public void g(int i, int i2) {
        l2b l2b = this.c;
        if (l2b != null) {
            l2b.a.a(l2b.b, l2b.c);
        }
    }

    public void i(l2b l2b) {
        this.c = l2b;
    }
}
