package io.netty.handler.codec.http;

import com.spotify.core.http.HttpConnection;
import com.spotify.music.features.ads.model.Ad;
import io.netty.util.c;

public final class q {
    public static final c a = new c("charset");
    public static final c b = new c("chunked");
    public static final c c = new c("close");
    public static final c d = new c("keep-alive");
    public static final c e = new c("websocket");

    static {
        new c("application/json");
        new c("application/x-www-form-urlencoded");
        new c("application/octet-stream");
        new c("attachment");
        new c("base64");
        new c("binary");
        new c("boundary");
        new c("bytes");
        new c("compress");
        new c("100-continue");
        new c("deflate");
        new c("x-deflate");
        new c("file");
        new c("filename");
        new c("form-data");
        new c("gzip");
        new c("gzip,deflate");
        new c("x-gzip");
        new c("identity");
        new c("max-age");
        new c("max-stale");
        new c("min-fresh");
        new c("multipart/form-data");
        new c("multipart/mixed");
        new c("must-revalidate");
        new c("name");
        new c("no-cache");
        new c("no-store");
        new c("no-transform");
        new c("none");
        new c(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        new c("only-if-cached");
        new c("private");
        new c("proxy-revalidate");
        new c("public");
        new c("quoted-printable");
        new c("s-maxage");
        new c(HttpConnection.kDefaultContentType);
        new c("trailers");
        new c("upgrade");
    }
}
