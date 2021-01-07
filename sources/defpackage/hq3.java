package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;

/* renamed from: hq3  reason: default package */
public final /* synthetic */ class hq3 implements l {
    public final /* synthetic */ zr3 a;

    public /* synthetic */ hq3(zr3 zr3) {
        this.a = zr3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        return this.a.d().M(fq3.a, Functions.c);
    }
}
