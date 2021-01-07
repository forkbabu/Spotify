package com.spotify.music.ondemandsharing.shufflebutton;

import com.google.common.collect.FluentIterable;
import defpackage.b91;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.List;

public class o implements w<b91, b91> {
    private final y9c a;
    private final zec b;

    o(y9c y9c, zec zec) {
        this.a = y9c;
        this.b = zec;
    }

    public b91 a(b91 b91) {
        s81 s81;
        if (!this.a.a()) {
            return b91;
        }
        boolean d = this.b.d();
        b91.a builder = b91.toBuilder();
        s81 header = b91.header();
        if (header == null) {
            s81 = null;
        } else {
            s81 = header.toBuilder().m(FluentIterable.from(header.children()).transform(new d(d, header)).toList()).l();
        }
        b91.a j = builder.j(s81);
        List<? extends s81> body = b91.body();
        if (!body.isEmpty()) {
            body = FluentIterable.from(body).transform(new c(d)).toList();
        }
        return j.e(body).g();
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return sVar.j0(new e(this));
    }
}
