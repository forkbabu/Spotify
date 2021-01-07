package com.spotify.core.http;

public class HttpConnection {
    public static final String kDefaultContentType = "text/plain";
    public static final int kErrorClassHttp = 300;
    public static final int kErrorHttpAborted = 311;
    public static final int kErrorHttpBadRange = 305;
    public static final int kErrorHttpBadReply = 304;
    public static final int kErrorHttpBadTransferEncoding = 307;
    public static final int kErrorHttpConnectFail = 302;
    public static final int kErrorHttpConnectTimeout = 301;
    public static final int kErrorHttpFail = 309;
    public static final int kErrorHttpGzipDecode = 310;
    public static final int kErrorHttpInvalidUrl = 303;
    public static final int kErrorHttpTimeout = 308;
    public static final int kErrorHttpTooManyRedirects = 306;
    public static final int kErrorSuccess = 0;
    private static HttpConnectionFactory sFactory;
    private final HttpConnectionDelegate mDelegate;
    private volatile long nThis;

    public HttpConnection() {
        HttpConnectionFactory httpConnectionFactory = sFactory;
        if (httpConnectionFactory != null) {
            this.mDelegate = httpConnectionFactory.createDelegate();
            return;
        }
        throw new IllegalStateException("HttpConnection is not initialized");
    }

    public static void initialize(HttpConnectionFactory httpConnectionFactory) {
        sFactory = httpConnectionFactory;
    }

    public void abort() {
        this.mDelegate.abort();
    }

    public boolean isRequestStarted() {
        return this.mDelegate.isRequestStarted();
    }

    public native void onBytesAvailable(byte[] bArr, int i);

    public native void onComplete();

    public native void onError(int i);

    public native void onHeaders(HttpResponse httpResponse);

    public void send(HttpRequest httpRequest, HttpOptions httpOptions) {
        this.mDelegate.send(this, httpRequest, httpOptions);
    }
}
