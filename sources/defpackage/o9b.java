package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

/* renamed from: o9b  reason: default package */
public final /* synthetic */ class o9b implements g {
    public final /* synthetic */ r9b a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ o9b(r9b r9b, Context context, Optional optional) {
        this.a = r9b;
        this.b = context;
        this.c = optional;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f(this.b, this.c, (Response) obj);
    }
}
