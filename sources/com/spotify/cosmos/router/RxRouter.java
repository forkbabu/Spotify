package com.spotify.cosmos.router;

import io.reactivex.s;

public interface RxRouter {
    s<Response> resolve(Request request);
}
