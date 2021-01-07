package androidx.work;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class q {
    private UUID a;
    private ga b;
    private Set<String> c;

    public static abstract class a<B extends a<?, ?>, W extends q> {
        boolean a = false;
        UUID b = UUID.randomUUID();
        ga c;
        Set<String> d = new HashSet();

        a(Class<? extends ListenableWorker> cls) {
            this.c = new ga(this.b.toString(), cls.getName());
            this.d.add(cls.getName());
            d();
        }

        public final B a(String str) {
            this.d.add(str);
            return d();
        }

        public final W b() {
            W c2 = c();
            this.b = UUID.randomUUID();
            ga gaVar = new ga(this.c);
            this.c = gaVar;
            gaVar.a = this.b.toString();
            return c2;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
            this.a = true;
            ga gaVar = this.c;
            gaVar.l = backoffPolicy;
            gaVar.d(timeUnit.toMillis(j));
            return d();
        }

        public final B f(b bVar) {
            this.c.j = bVar;
            return d();
        }

        public B g(long j, TimeUnit timeUnit) {
            this.c.g = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.c.g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B h(d dVar) {
            this.c.e = dVar;
            return d();
        }
    }

    protected q(UUID uuid, ga gaVar, Set<String> set) {
        this.a = uuid;
        this.b = gaVar;
        this.c = set;
    }

    public String a() {
        return this.a.toString();
    }

    public Set<String> b() {
        return this.c;
    }

    public ga c() {
        return this.b;
    }
}
