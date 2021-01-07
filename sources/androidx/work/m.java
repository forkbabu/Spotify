package androidx.work;

import android.os.Build;
import androidx.work.q;
import java.util.concurrent.TimeUnit;

public final class m extends q {

    public static final class a extends q.a<a, m> {
        public a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
            super(cls);
            this.c.e(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
        }

        /* Return type fixed from 'androidx.work.q' to match base method */
        /* access modifiers changed from: package-private */
        @Override // androidx.work.q.a
        public m c() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.j.h()) {
                ga gaVar = this.c;
                if (!gaVar.q || Build.VERSION.SDK_INT < 23 || !gaVar.j.h()) {
                    return new m(this);
                }
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* Return type fixed from 'androidx.work.q$a' to match base method */
        /* access modifiers changed from: package-private */
        @Override // androidx.work.q.a
        public a d() {
            return this;
        }
    }

    m(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
