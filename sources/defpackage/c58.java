package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: c58  reason: default package */
public class c58 implements a71 {
    public static final /* synthetic */ int b = 0;
    private final r58 a;

    public c58(r58 r58) {
        this.a = r58;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (MoreObjects.isNullOrEmpty(string)) {
            Assertion.g("empty uri");
        } else {
            this.a.b(string, n61);
        }
    }
}
