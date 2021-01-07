package com.spotify.music.libs.assistedcuration.presenter;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.d;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.k;

public class t implements n {
    private final String a;
    private final d b;
    private final Optional<Integer> c;

    public t(String str, d dVar, Optional<Integer> optional) {
        this.a = str;
        this.b = dVar;
        this.c = optional;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.n
    public a a() {
        if (!this.c.isPresent()) {
            return k.a;
        }
        d dVar = this.b;
        String str = this.a;
        d.b.a b2 = d.b.b();
        b2.f(Boolean.FALSE);
        b2.i(new qxd(0, 0));
        return a.w(dVar.a(str, b2.b()).j0(e.a).Q(new f(this)).S());
    }

    public /* synthetic */ boolean b(Integer num) {
        return num.intValue() >= this.c.get().intValue();
    }
}
