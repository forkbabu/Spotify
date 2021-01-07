package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: ak8  reason: default package */
public final /* synthetic */ class ak8 implements g {
    public final /* synthetic */ kk8 a;

    public /* synthetic */ ak8(kk8 kk8) {
        this.a = kk8;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        kk8.c(this.a, (Response) obj);
    }
}
