package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.t;
import io.reactivex.functions.l;

/* renamed from: p2e  reason: default package */
public final /* synthetic */ class p2e implements l {
    public final /* synthetic */ v2e a;
    public final /* synthetic */ t b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;
    public final /* synthetic */ String n;
    public final /* synthetic */ Activity o;
    public final /* synthetic */ o8e p;

    public /* synthetic */ p2e(v2e v2e, t tVar, String str, String str2, String str3, Activity activity, o8e o8e) {
        this.a = v2e;
        this.b = tVar;
        this.c = str;
        this.f = str2;
        this.n = str3;
        this.o = activity;
        this.p = o8e;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, this.f, this.n, this.o, this.p, (Optional) obj);
    }
}
