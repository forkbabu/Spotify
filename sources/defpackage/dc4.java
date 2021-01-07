package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.common.recyclerview.a;
import io.reactivex.h;

/* renamed from: dc4  reason: default package */
public class dc4 extends a {
    private final boolean c;
    private pd4 f;

    public dc4(boolean z) {
        this.c = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public boolean e() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public int f() {
        return 8;
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.a
    public void g(int i, int i2) {
        pd4 pd4 = this.f;
        if (pd4 != null) {
            ec4 ec4 = pd4.a;
            h hVar = pd4.b;
            int b = ec4.b();
            String a = ec4.a();
            if (b > 0 && !a.isEmpty()) {
                hVar.onNext(new ff4(b, a));
                Logger.b("Requesting browse next page with offset:  %d", Integer.valueOf(b));
            }
        }
    }

    public void i(pd4 pd4) {
        this.f = pd4;
    }
}
