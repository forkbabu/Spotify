package com.spotify.mobile.android.spotlets.appprotocol.calls;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;

public class EchoEndpoint implements bf2<EchoRequest, EchoResponse> {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EchoRequest implements JacksonModel {
        public final String request;

        @JsonCreator
        public EchoRequest(@JsonProperty("request") String str) {
            this.request = str;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EchoResponse implements JacksonModel {
        public final String response;

        @JsonCreator
        public EchoResponse(@JsonProperty("response") String str) {
            this.response = str;
        }
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
    @Override // defpackage.bf2
    public s<EchoResponse> a(EchoRequest echoRequest) {
        return s.c0(new a(this, echoRequest));
    }

    @Override // defpackage.bf2
    public int b() {
        return 1;
    }

    @Override // defpackage.bf2
    public Class<EchoRequest> c() {
        return EchoRequest.class;
    }

    @Override // defpackage.bf2
    public String getUri() {
        return "com.spotify.echo";
    }
}
