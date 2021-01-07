package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public class m implements Closeable {
    private final URL a;
    private g<Bitmap> b;
    private volatile InputStream c;

    private m(URL url) {
        this.a = url;
    }

    public static m b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new m(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }

    public Bitmap a() {
        String.valueOf(this.a).length();
        URLConnection openConnection = this.a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.c = inputStream;
                byte[] b2 = ju.b(ju.a(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    String.valueOf(this.a).length();
                }
                if (b2.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b2, 0, b2.length);
                    if (decodeByteArray != null) {
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                            String.valueOf(this.a).length();
                        }
                        return decodeByteArray;
                    }
                    String valueOf = String.valueOf(this.a);
                    throw new IOException(je.i0(valueOf.length() + 24, "Failed to decode image: ", valueOf));
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                mu.a(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ku.a(this.c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    public g<Bitmap> d() {
        g<Bitmap> gVar = this.b;
        com.google.android.exoplayer2.util.g.l(gVar);
        return gVar;
    }

    public void f(Executor executor) {
        this.b = j.c(executor, new l(this));
    }
}
