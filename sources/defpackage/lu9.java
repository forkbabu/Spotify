package defpackage;

import android.net.Uri;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: lu9  reason: default package */
final class lu9<T> implements g<Uri> {
    final /* synthetic */ nu9 a;

    lu9(nu9 nu9) {
        this.a = nu9;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Uri uri) {
        Uri uri2 = uri;
        h.e(uri2, "previewUrl");
        this.a.c = uri2;
        this.a.i.k(uri2);
    }
}
