package com.spotify.mobile.android.core.internal;

import com.spotify.base.java.logging.Logger;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpOptions;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.jni.NativeHelpers;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.w;
import okhttp3.y;

public class HttpConnectionImpl implements HttpConnectionDelegate {
    private static final int BUFFER_SIZE = 1024;
    private e mCall;
    private final y mHttpClient;
    private boolean mIsAborted;
    private a0 mRequest;

    public HttpConnectionImpl(y yVar) {
        this.mHttpClient = yVar;
    }

    private String getMediaType(Map<String, String> map) {
        String str = map.get("Content-Type");
        return str != null ? str : HttpConnection.kDefaultContentType;
    }

    private y mutateHttpClient(HttpOptions httpOptions) {
        y yVar = this.mHttpClient;
        if (!(((long) yVar.w()) == httpOptions.getTimeout() || ((long) yVar.A()) == httpOptions.getTimeout())) {
            y.b q = yVar.q();
            long timeout = httpOptions.getTimeout();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            q.k(timeout, timeUnit);
            q.m(httpOptions.getTimeout(), timeUnit);
            yVar = q.c();
        }
        if (((long) yVar.f()) != httpOptions.getConnectTimeout()) {
            y.b q2 = yVar.q();
            q2.f(httpOptions.getConnectTimeout(), TimeUnit.MILLISECONDS);
            yVar = q2.c();
        }
        if (yVar.n() == httpOptions.isFollowRedirects()) {
            return yVar;
        }
        y.b q3 = yVar.q();
        q3.i(httpOptions.isFollowRedirects());
        return q3.c();
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public void abort() {
        e eVar = this.mCall;
        if (eVar != null) {
            eVar.cancel();
        }
        this.mIsAborted = true;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public boolean isRequestStarted() {
        return this.mRequest != null;
    }

    @Override // com.spotify.core.http.HttpConnectionDelegate
    public void send(final HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions) {
        try {
            a0.a aVar = new a0.a();
            aVar.j(httpRequest.getUrl());
            Map<String, String> byteArrayToMap = NativeHelpers.byteArrayToMap(httpRequest.getHeaders());
            for (Map.Entry<String, String> entry : byteArrayToMap.entrySet()) {
                aVar.e(entry.getKey(), entry.getValue());
            }
            c0 c0Var = null;
            if (yif.K(httpRequest.getMethod())) {
                if (httpRequest.getBody() == null) {
                    Logger.n("%s %s must have a request body", httpRequest.getMethod(), httpRequest.getUrl());
                    httpConnection.onError(HttpConnection.kErrorHttpFail);
                    return;
                }
                c0Var = c0.e(w.d(getMediaType(byteArrayToMap)), httpRequest.getBody());
            }
            aVar.g(httpRequest.getMethod(), c0Var);
            a0 b = aVar.b();
            this.mRequest = b;
            Logger.g("Starting request: %s", b);
            e b2 = mutateHttpClient(httpOptions).b(this.mRequest);
            this.mCall = b2;
            b2.h1(new f() {
                /* class com.spotify.mobile.android.core.internal.HttpConnectionImpl.AnonymousClass1 */

                private void reportException(IOException iOException) {
                    Logger.e(iOException, "Exception on getting result data", new Object[0]);
                    if (iOException instanceof SocketTimeoutException) {
                        httpConnection.onError(HttpConnection.kErrorHttpTimeout);
                    } else if (HttpConnectionImpl.this.mIsAborted) {
                        httpConnection.onError(HttpConnection.kErrorHttpAborted);
                    } else {
                        httpConnection.onError(HttpConnection.kErrorHttpFail);
                    }
                }

                @Override // okhttp3.f
                public void onFailure(e eVar, IOException iOException) {
                    reportException(iOException);
                }

                /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC, Splitter:B:30:0x007c] */
                /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
                @Override // okhttp3.f
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onResponse(okhttp3.e r6, okhttp3.d0 r7) {
                    /*
                        r5 = this;
                        r6 = 0
                        int r0 = r7.f()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        okhttp3.a0 r1 = r7.C()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        okhttp3.u r1 = r1.k()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        okhttp3.t r2 = r7.l()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        com.spotify.core.http.HttpConnection r3 = r9     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        com.spotify.core.http.HttpResponse r4 = new com.spotify.core.http.HttpResponse     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        r4.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        r3.onHeaders(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        okhttp3.e0 r0 = r7.a()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        if (r0 == 0) goto L_0x004a
                        java.io.InputStream r1 = r0.a()     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        r2.<init>(r1)     // Catch:{ IOException -> 0x0068, all -> 0x0064 }
                        r6 = 1024(0x400, float:1.435E-42)
                        byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x0048 }
                    L_0x0036:
                        int r1 = r2.read(r6)     // Catch:{ IOException -> 0x0048 }
                        r3 = -1
                        if (r1 == r3) goto L_0x0043
                        com.spotify.core.http.HttpConnection r3 = r9     // Catch:{ IOException -> 0x0048 }
                        r3.onBytesAvailable(r6, r1)     // Catch:{ IOException -> 0x0048 }
                        goto L_0x0036
                    L_0x0043:
                        r0.close()     // Catch:{ IOException -> 0x0048 }
                        r6 = r2
                        goto L_0x004a
                    L_0x0048:
                        r6 = move-exception
                        goto L_0x006b
                    L_0x004a:
                        java.lang.String r0 = "onResponse( ... ): { response=%s }"
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        r2 = 0
                        java.lang.String r7 = r7.toString()
                        r1[r2] = r7
                        com.spotify.base.java.logging.Logger.g(r0, r1)
                        com.spotify.core.http.HttpConnection r7 = r9
                        r7.onComplete()
                        if (r6 == 0) goto L_0x0078
                        r6.close()     // Catch:{ IOException -> 0x0074 }
                        goto L_0x0078
                    L_0x0064:
                        r7 = move-exception
                        r2 = r6
                        r6 = r7
                        goto L_0x007a
                    L_0x0068:
                        r7 = move-exception
                        r2 = r6
                        r6 = r7
                    L_0x006b:
                        r5.reportException(r6)     // Catch:{ all -> 0x0079 }
                        if (r2 == 0) goto L_0x0078
                        r2.close()
                        goto L_0x0078
                    L_0x0074:
                        r6 = move-exception
                        r5.reportException(r6)
                    L_0x0078:
                        return
                    L_0x0079:
                        r6 = move-exception
                    L_0x007a:
                        if (r2 == 0) goto L_0x0084
                        r2.close()     // Catch:{ IOException -> 0x0080 }
                        goto L_0x0084
                    L_0x0080:
                        r7 = move-exception
                        r5.reportException(r7)
                    L_0x0084:
                        goto L_0x0086
                    L_0x0085:
                        throw r6
                    L_0x0086:
                        goto L_0x0085
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.core.internal.HttpConnectionImpl.AnonymousClass1.onResponse(okhttp3.e, okhttp3.d0):void");
                }
            });
        } catch (IllegalArgumentException e) {
            Logger.o(e, "Error when trying to create request %s (%s).", httpRequest.getMethod(), httpRequest.getUrl());
            httpConnection.onError(303);
        }
    }
}
