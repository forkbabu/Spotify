package defpackage;

import android.net.Uri;
import io.reactivex.functions.l;

/* renamed from: n12  reason: default package */
public final /* synthetic */ class n12 implements l {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ n12(i22 i22, Uri uri) {
        this.a = i22;
        this.b = uri;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.k(this.b, (Boolean) obj);
    }
}
