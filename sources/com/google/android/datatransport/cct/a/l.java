package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.g;
import java.util.List;

public abstract class l {

    public static abstract class a {
        public a a(int i) {
            e(Integer.valueOf(i));
            return this;
        }

        public abstract a b(long j);

        public abstract a c(zzp zzp);

        public abstract a d(zzu zzu);

        /* access modifiers changed from: package-private */
        public abstract a e(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a f(String str);

        public abstract a g(List<k> list);

        public abstract l h();

        public abstract a i(long j);

        public a j(String str) {
            f(str);
            return this;
        }
    }

    public static a a() {
        return new g.a();
    }

    public abstract zzp b();

    public abstract List<k> c();

    public abstract Integer d();

    public abstract String e();

    public abstract zzu f();

    public abstract long g();

    public abstract long h();
}
