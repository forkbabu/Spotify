package com.spotify.mobile.android.cosmos.parser;

import com.spotify.cosmos.router.Response;

public interface ResponseParser<T> {
    T parseResponse(Response response);
}
