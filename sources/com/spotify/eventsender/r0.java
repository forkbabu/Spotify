package com.spotify.eventsender;

import com.spotify.eventsender.z;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class r0 {

    public static abstract class a {
        public abstract r0 a();

        public abstract a b(String str);

        public abstract a c(a0 a0Var);

        public abstract a d(List<fk0> list);

        public abstract a e(il0 il0);

        public abstract a f(kl0 kl0);

        public abstract a g(long j);

        public abstract a h(boolean z);
    }

    public static a a() {
        z.b bVar = new z.b();
        bVar.d(Collections.emptyList());
        bVar.f(new u());
        bVar.e(new sl0(new u(), new s()));
        bVar.g(TimeUnit.MINUTES.toMillis(5));
        bVar.b("https://spclient.wg.spotify.com/");
        bVar.c(new o0());
        bVar.h(false);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public abstract String b();

    /* access modifiers changed from: package-private */
    public abstract a0 c();

    public abstract List<fk0> d();

    /* access modifiers changed from: package-private */
    public abstract il0 e();

    public abstract kl0 f();

    /* access modifiers changed from: package-private */
    public abstract long g();

    /* access modifiers changed from: package-private */
    public abstract boolean h();
}
