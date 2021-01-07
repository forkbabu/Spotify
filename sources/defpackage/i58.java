package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: i58  reason: default package */
public class i58 implements a71 {
    private final c8b a;
    private final u58 b;

    public i58(c8b c8b, u58 u58) {
        this.a = c8b;
        this.b = u58;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        this.a.a();
        String string = o81.data().string("uri");
        if (MoreObjects.isNullOrEmpty(string)) {
            Assertion.g("empty trackUri");
        } else {
            this.b.a(string, n61);
        }
    }
}
