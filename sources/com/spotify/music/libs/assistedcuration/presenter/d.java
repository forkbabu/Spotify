package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.base.Optional;
import com.spotify.music.libs.assistedcuration.presenter.o;
import io.reactivex.functions.i;

public final /* synthetic */ class d implements i {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        o.b bVar = (o.b) ((s) obj).f();
        bVar.e(Optional.of((Boolean) obj2));
        bVar.c(((Boolean) obj4).booleanValue());
        bVar.d(((Boolean) obj3).booleanValue());
        return bVar.a();
    }
}
