package defpackage;

import com.squareup.picasso.g;
import kotlin.jvm.internal.h;

/* renamed from: mo5  reason: default package */
public final class mo5 implements g {
    private final oe0 a;

    public mo5(oe0 oe0) {
        h.e(oe0, "tracker");
        this.a = oe0;
    }

    @Override // com.squareup.picasso.g
    public void onError(Exception exc) {
        h.e(exc, "e");
        this.a.a(-1);
    }

    @Override // com.squareup.picasso.g
    public void onSuccess() {
        this.a.a(null);
    }
}
