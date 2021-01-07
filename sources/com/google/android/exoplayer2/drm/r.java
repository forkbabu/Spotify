package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface r<T extends q> {

    public static final class a {
        private final byte[] a;
        private final String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public interface b<T extends q> {
    }

    public interface c<T extends q> {
        r<T> a(UUID uuid);
    }

    public static final class d {
        private final byte[] a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    Class<T> a();

    Map<String, String> b(byte[] bArr);

    T c(byte[] bArr);

    void d();

    d e();

    byte[] f();

    void g(byte[] bArr, byte[] bArr2);

    void h(b<? super T> bVar);

    void i(byte[] bArr);

    void j(byte[] bArr);

    byte[] k(byte[] bArr, byte[] bArr2);

    a l(byte[] bArr, List<l.b> list, int i, HashMap<String, String> hashMap);
}
