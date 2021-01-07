package defpackage;

import com.spotify.mobile.android.util.Assertion;
import kotlin.jvm.internal.h;

/* renamed from: kx0  reason: default package */
public final class kx0 {
    private String a = "";

    public final String a() {
        if (h.a(this.a, "")) {
            Assertion.g("RequestID field should not be access before being set");
        }
        return this.a;
    }

    public final void b(String str) {
        h.e(str, "<set-?>");
        this.a = str;
    }
}
