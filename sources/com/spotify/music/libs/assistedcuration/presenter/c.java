package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.base.Optional;
import com.spotify.music.libs.assistedcuration.presenter.o;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ x a;

    public /* synthetic */ c(x xVar) {
        this.a = xVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        x xVar = this.a;
        o.b bVar = new o.b();
        bVar.e(Optional.absent());
        bVar.d(false);
        bVar.c(false);
        bVar.f(xVar);
        bVar.b((List) obj);
        return bVar.a();
    }
}
