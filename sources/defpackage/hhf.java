package defpackage;

import android.net.Uri;
import io.reactivex.functions.g;

/* renamed from: hhf  reason: default package */
public final /* synthetic */ class hhf implements g {
    public final /* synthetic */ phf a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hhf(phf phf, Uri uri, Object obj) {
        this.a = phf;
        this.b = uri;
        this.c = obj;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, this.c, obj);
    }
}
