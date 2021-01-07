package com.spotify.podcast.endpoints;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowResponse;
import com.spotify.podcast.endpoints.exceptions.UnableToParseMessageException;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        String uri = response.getUri();
        try {
            return s.i0(new u3(uri, ShowShowRequest$ProtoShowResponse.u(response.getBody())));
        } catch (InvalidProtocolBufferException unused) {
            return s.P(new UnableToParseMessageException(uri));
        }
    }
}
