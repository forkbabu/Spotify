package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

/* renamed from: ewc  reason: default package */
public final /* synthetic */ class ewc implements l {
    public final /* synthetic */ fwc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Class c;

    public /* synthetic */ ewc(fwc fwc, String str, Class cls) {
        this.a = fwc;
        this.b = str;
        this.c = cls;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, (Response) obj);
    }
}
