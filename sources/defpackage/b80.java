package defpackage;

import android.net.Uri;
import io.reactivex.functions.g;

/* renamed from: b80  reason: default package */
public final /* synthetic */ class b80 implements g {
    public final /* synthetic */ i80 a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ b80(i80 i80, Uri uri) {
        this.a = i80;
        this.b = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (k1) obj);
    }
}
