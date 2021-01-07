package com.spotify.playlist.endpoints.exceptions;

import com.google.protobuf.u;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.a;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

final class e<T, R> implements l<Response, d0<? extends u>> {
    final /* synthetic */ a.d.C0374a a;
    final /* synthetic */ Response b;
    final /* synthetic */ Exception c;

    e(a.d.C0374a aVar, Response response, Exception exc) {
        this.a = aVar;
        this.b = response;
        this.c = exc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends u> apply(Response response) {
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
        return z.q(b2);
    }
}
