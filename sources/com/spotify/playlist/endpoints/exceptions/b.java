package com.spotify.playlist.endpoints.exceptions;

import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.a;
import io.reactivex.e;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<Response, e> {
    final /* synthetic */ a.b a;
    final /* synthetic */ Response b;
    final /* synthetic */ Exception c;

    b(a.b bVar, Response response, Exception exc) {
        this.a = bVar;
        this.b = response;
        this.c = exc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public e apply(Response response) {
        Response response2 = response;
        h.e(response2, "sessionResponse");
        a.C0372a aVar = a.b;
        Response response3 = this.b;
        StackTraceElement[] stackTraceElementArr = this.a.b;
        h.d(stackTraceElementArr, "callerStackTrace");
        Exception b2 = a.C0372a.b(aVar, response2, response3, stackTraceElementArr);
        if (b2 == null) {
            b2 = this.c;
        }
        return io.reactivex.a.t(b2);
    }
}
