package com.spotify.mobile.android.video.endvideo;

import com.spotify.cosmos.router.Response;
import io.reactivex.s;

public class i {
    private final j a;

    public i(j jVar) {
        this.a = jVar;
    }

    public s<PendingMessageResponse> a() {
        LogParameters logParameters = new LogParameters();
        logParameters.messageName = "EndVideo";
        logParameters.messageVersion = 10L;
        return this.a.a(logParameters).P();
    }

    public s<Response> b(long j) {
        LogParameters logParameters = new LogParameters();
        logParameters.sequenceNumber = Long.valueOf(j);
        logParameters.messageName = "EndVideo";
        return this.a.c(logParameters).P();
    }

    public s<Response> c(long j, v91 v91) {
        LogParameters logParameters = new LogParameters();
        logParameters.message = v91.a();
        logParameters.sequenceNumber = Long.valueOf(j);
        logParameters.messageName = "EndVideo";
        return this.a.b(logParameters).P();
    }
}
