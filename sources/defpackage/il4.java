package defpackage;

import android.net.Uri;

/* renamed from: il4  reason: default package */
public class il4 implements ml4 {
    private final ll4 a;
    private final kl4 b;

    public il4(ll4 ll4, kl4 kl4) {
        this.a = ll4;
        this.b = kl4;
    }

    @Override // defpackage.ml4
    public boolean a(Uri uri) {
        if (!this.a.a(uri)) {
            return false;
        }
        this.b.a(uri);
        return true;
    }
}
