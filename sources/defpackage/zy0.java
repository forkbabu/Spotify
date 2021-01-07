package defpackage;

import com.spotify.libs.pse.model.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.Header;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: zy0  reason: default package */
public final class zy0 {
    private final bz0 a;

    public zy0(bz0 bz0) {
        h.e(bz0, "exposer");
        this.a = bz0;
    }

    public final <T> void a(T t) {
        String n;
        String str = null;
        if (t != null) {
            if (t instanceof a) {
                n = t.c();
            } else if (t instanceof Header) {
                n = t.l();
            } else if (t instanceof AuthMethod) {
                n = t.m();
            } else if (t instanceof Authentication) {
                n = t.n();
            } else {
                Assertion.g("Unsupported component");
            }
            str = n;
        }
        if (str != null && (!e.n(str))) {
            this.a.a(str);
        }
    }
}
