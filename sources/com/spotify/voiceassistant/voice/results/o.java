package com.spotify.voiceassistant.voice.results;

import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.maybe.p;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.concurrent.atomic.AtomicReference;

public class o {
    private final pg0<SearchRequest, SearchResponse, l<e>> a;
    private final AtomicReference<e> b = new AtomicReference<>();
    private final a<Boolean> c = a.i1(Boolean.FALSE);

    o(pg0<SearchRequest, SearchResponse, l<e>> pg0) {
        this.a = pg0;
    }

    public e a() {
        if (this.b.get() != null) {
            this.c.onNext(Boolean.FALSE);
            return this.b.get();
        }
        throw new IllegalStateException("There are not alternative results written yet.");
    }

    public s<Boolean> b() {
        return this.c.E();
    }

    public /* synthetic */ void c(e eVar) {
        this.b.set(eVar);
        this.c.onNext(Boolean.TRUE);
    }

    public /* synthetic */ void d() {
        this.b.set(null);
        this.c.onNext(Boolean.FALSE);
    }

    public io.reactivex.a e(SearchRequest searchRequest, SearchResponse searchResponse) {
        l<e> f = this.a.a(searchRequest, searchResponse).f(new c(this));
        d dVar = new d(this);
        g f2 = Functions.f();
        g f3 = Functions.f();
        g f4 = Functions.f();
        io.reactivex.functions.a aVar = Functions.c;
        return io.reactivex.a.w(new p(f, f2, f3, f4, dVar, aVar, aVar));
    }
}
