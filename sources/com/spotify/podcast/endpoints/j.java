package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.podcast.endpoints.exceptions.NotFoundException;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class j implements u {
    private final Optional<Exception> c(Response response) {
        if (response.getStatus() != 404) {
            Optional<Exception> absent = Optional.absent();
            h.d(absent, "Optional.absent()");
            return absent;
        }
        Optional<Exception> of = Optional.of(new NotFoundException(response.getUri(), response));
        h.d(of, "Optional.of(\n           …e\n            )\n        )");
        return of;
    }

    @Override // com.spotify.podcast.endpoints.u
    public s<Response> a(Response response) {
        h.e(response, "response");
        Optional<Exception> c = c(response);
        if (c.isPresent()) {
            s<Response> P = s.P(c.get());
            h.d(P, "Observable.error(exception.get())");
            return P;
        }
        s<Response> i0 = s.i0(response);
        h.d(i0, "Observable.just(response)");
        return i0;
    }

    @Override // com.spotify.podcast.endpoints.u
    public z<Response> b(Response response) {
        h.e(response, "response");
        Optional<Exception> c = c(response);
        if (c.isPresent()) {
            z<Response> q = z.q(c.get());
            h.d(q, "Single.error(exception.get())");
            return q;
        }
        z<Response> z = z.z(response);
        h.d(z, "Single.just(response)");
        return z;
    }
}
