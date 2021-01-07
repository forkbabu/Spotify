package com.spotify.music.features.queue.service;

import com.spotify.music.features.queue.service.s;
import defpackage.zwd;
import io.reactivex.functions.a;
import io.reactivex.functions.l;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ a b;

    public /* synthetic */ g(s sVar, a aVar) {
        this.a = sVar;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s sVar = this.a;
        a aVar = this.b;
        zwd zwd = (zwd) obj;
        sVar.getClass();
        zwd.getClass();
        if (zwd instanceof zwd.a) {
            return io.reactivex.a.u(new s.b(zwd, null));
        }
        return io.reactivex.a.u(aVar);
    }
}
