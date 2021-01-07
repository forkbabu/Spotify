package com.spotify.cosmos.android;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;

public interface RxResolver {
    s<Response> resolve(Request request);
}
