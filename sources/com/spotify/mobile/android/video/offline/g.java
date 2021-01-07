package com.spotify.mobile.android.video.offline;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ f0 c;

    public /* synthetic */ g(c0 c0Var, d0 d0Var, f0 f0Var) {
        this.a = c0Var;
        this.b = d0Var;
        this.c = f0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (List) obj);
    }
}
