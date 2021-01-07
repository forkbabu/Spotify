package com.google.android.exoplayer2;

import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.v0;

public abstract class s implements m0 {
    protected final v0.c a = new v0.c();

    protected static final class a {
        public final m0.a a;
        private boolean b;

        public a(m0.a aVar) {
            this.a = aVar;
        }

        public void a(b bVar) {
            if (!this.b) {
                bVar.a(this.a);
            }
        }

        public void b() {
            this.b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* access modifiers changed from: protected */
    public interface b {
        void a(m0.a aVar);
    }

    public final boolean c() {
        v0 l = l();
        return !l.n() && l.k(i(), this.a).d;
    }

    public final boolean r() {
        a0 a0Var = (a0) this;
        return a0Var.y() == 3 && a0Var.v() && a0Var.z() == 0;
    }

    @Override // com.google.android.exoplayer2.m0
    public final void seekTo(long j) {
        m(i(), j);
    }

    @Override // com.google.android.exoplayer2.m0
    public final void stop() {
        n(false);
    }
}
