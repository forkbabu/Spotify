package defpackage;

import android.net.Uri;
import io.reactivex.functions.g;

/* renamed from: t95  reason: default package */
public final /* synthetic */ class t95 implements g {
    public final /* synthetic */ aa5 a;
    public final /* synthetic */ ma5 b;
    public final /* synthetic */ mf3 c;
    public final /* synthetic */ String f;
    public final /* synthetic */ Uri n;

    public /* synthetic */ t95(aa5 aa5, ma5 ma5, mf3 mf3, String str, Uri uri) {
        this.a = aa5;
        this.b = ma5;
        this.c = mf3;
        this.f = str;
        this.n = uri;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.n(this.b, this.c, this.f, this.n, (u3) obj);
    }
}
