package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.f0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public final class x<T> implements Loader.e {
    public final m a;
    public final int b;
    private final y c;
    private final a<? extends T> d;
    private volatile T e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public x(k kVar, Uri uri, int i, a<? extends T> aVar) {
        m mVar = new m(uri, 0, -1, null, 1);
        this.c = new y(kVar);
        this.a = mVar;
        this.b = i;
        this.d = aVar;
    }

    public static <T> T g(k kVar, a<? extends T> aVar, m mVar, int i) {
        y yVar = new y(kVar);
        yVar.g();
        l lVar = new l(yVar, mVar);
        try {
            lVar.a();
            Uri uri = yVar.getUri();
            uri.getClass();
            T t = (T) aVar.a(uri, lVar);
            t.getClass();
            return t;
        } finally {
            int i2 = f0.a;
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        this.c.g();
        l lVar = new l(this.c, this.a);
        try {
            lVar.a();
            Uri uri = this.c.getUri();
            uri.getClass();
            this.e = (T) this.d.a(uri, lVar);
        } finally {
            int i = f0.a;
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
    }

    public long c() {
        return this.c.d();
    }

    public Map<String, List<String>> d() {
        return this.c.f();
    }

    public final T e() {
        return this.e;
    }

    public Uri f() {
        return this.c.e();
    }
}
