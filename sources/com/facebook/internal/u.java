package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.o;
import com.facebook.k;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

class u {
    static final String a = "u";
    private static o b;

    private static class a extends BufferedInputStream {
        HttpURLConnection a;

        a(InputStream inputStream, HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            this.a = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
            super.close();
            f0.j(this.a);
        }
    }

    u() {
    }

    static synchronized o a() {
        o oVar;
        synchronized (u.class) {
            if (b == null) {
                b = new o(a, new o.f());
            }
            oVar = b;
        }
        return oVar;
    }

    static InputStream b(Uri uri, Context context) {
        if (uri == null || !d(uri)) {
            return null;
        }
        try {
            return a().f(uri.toString(), null);
        } catch (IOException e) {
            LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
            e.toString();
            int i = y.e;
            k.v(loggingBehavior);
            return null;
        }
    }

    static InputStream c(Context context, HttpURLConnection httpURLConnection) {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri parse = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (d(parse)) {
                return new o.e(new a(inputStream, httpURLConnection), a().g(parse.toString(), null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    private static boolean d(Uri uri) {
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        if (host.endsWith("fbcdn.net")) {
            return true;
        }
        if (!host.startsWith("fbcdn") || !host.endsWith("akamaihd.net")) {
            return false;
        }
        return true;
    }
}
