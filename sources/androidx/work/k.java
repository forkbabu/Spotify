package androidx.work;

import android.os.Build;
import androidx.work.q;

public final class k extends q {

    public static final class a extends q.a<a, k> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        /* Return type fixed from 'androidx.work.q' to match base method */
        /* access modifiers changed from: package-private */
        @Override // androidx.work.q.a
        public k c() {
            if (!this.a || Build.VERSION.SDK_INT < 23 || !this.c.j.h()) {
                ga gaVar = this.c;
                if (!gaVar.q || Build.VERSION.SDK_INT < 23 || !gaVar.j.h()) {
                    return new k(this);
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

    k(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }
}
