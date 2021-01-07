package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;

public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {
        void a(Cache cache, j jVar);

        void d(Cache cache, j jVar);

        void e(Cache cache, j jVar, j jVar2);
    }

    File a(String str, long j, long j2);

    o b(String str);

    void c(String str, p pVar);

    long d(String str, long j, long j2);

    long e();

    void f(j jVar);

    j g(String str, long j);

    void h(j jVar);

    void i(File file, long j);

    boolean j(String str, long j, long j2);

    j k(String str, long j);

    NavigableSet<j> l(String str);
}
