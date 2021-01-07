package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class p implements l {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ e b;

    public /* synthetic */ p(z0 z0Var, e eVar) {
        this.a = z0Var;
        this.b = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        z0 z0Var = this.a;
        z0Var.b(this.b, (List) obj);
        return z0Var;
    }
}
