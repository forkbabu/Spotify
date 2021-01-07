package com.spotify.playlist.endpoints.exceptions;

import com.google.protobuf.u;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.a;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import kotlin.jvm.internal.h;

final class d<T, R> implements l<Response, v<? extends u>> {
    final /* synthetic */ a.c.C0373a a;
    final /* synthetic */ Response b;
    final /* synthetic */ Exception c;

    d(a.c.C0373a aVar, Response response, Exception exc) {
        this.a = aVar;
        this.b = response;
        this.c = exc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public v<? extends u> apply(Response response) {
        Response response2 = response;
        h.e(response2, "sessionResponse");
        a.C0372a aVar = a.b;
        Response response3 = this.b;
        StackTraceElement[] stackTraceElementArr = this.a.a.b;
        h.d(stackTraceElementArr, "callerStackTrace");
        Exception b2 = a.C0372a.b(aVar, response2, response3, stackTraceElementArr);
        if (b2 == null) {
            b2 = this.c;
        }
        return s.P(b2);
    }
}
