package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.f;

public abstract class k {

    public static abstract class a {
        public abstract a a(long j);

        public abstract a b(zzt zzt);

        public abstract a c(Integer num);

        public abstract k d();

        public abstract a e(long j);

        public abstract a f(long j);
    }

    public static a a(String str) {
        f.a aVar = new f.a();
        aVar.g(str);
        return aVar;
    }

    public static a b(byte[] bArr) {
        f.a aVar = new f.a();
        aVar.h(bArr);
        return aVar;
    }

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract zzt f();

    public abstract byte[] g();

    public abstract String h();

    public abstract long i();
}
