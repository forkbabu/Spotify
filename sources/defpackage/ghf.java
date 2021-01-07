package defpackage;

import android.net.Uri;
import io.reactivex.functions.g;

/* renamed from: ghf  reason: default package */
public final /* synthetic */ class ghf implements g {
    public final /* synthetic */ phf a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ ghf(phf phf, Uri uri) {
        this.a = phf;
        this.b = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, (Throwable) obj);
    }
}
