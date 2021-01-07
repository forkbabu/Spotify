package com.spotify.mobile.android.service.media.search;

import android.os.Bundle;
import com.spotify.mobile.android.rx.w;
import com.spotify.music.connection.l;
import io.reactivex.d0;
import io.reactivex.z;

public class f implements e {
    private final j a;
    private final w b;
    private final l c;
    private final lz0 d;

    public f(j jVar, w wVar, l lVar, lz0 lz0) {
        this.a = jVar;
        this.b = wVar;
        this.c = lVar;
        this.d = lz0;
    }

    @Override // com.spotify.mobile.android.service.media.search.e
    public z<ml1> a(String str, int i, int i2, Bundle bundle) {
        return this.c.b().N0(1).L0(new b(this, str, i, i2, bundle)).B0();
    }

    public d0 b(String str, int i, int i2, Bundle bundle, String str2) {
        ql1 ql1 = new ql1();
        j jVar = this.a;
        jVar.getClass();
        return z.g(new c(jVar, str, str2, i, i2, bundle)).A(ql1);
    }

    public d0 c(String str, int i, int i2, Bundle bundle, Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a("country_code").N0(1).B0().s(new a(this, str, i, i2, bundle));
        }
        return this.d.a(str).A(new pl1());
    }
}
