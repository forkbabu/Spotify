package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;

public final class k<L> {
    private volatile L a;
    private volatile a<L> b;

    public static final class a<L> {
        private final L a;
        private final String b;

        a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    public interface b<L> {
        void a(@RecentlyNonNull L l);

        void b();
    }

    private final class c extends qt {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            g.c(z);
            k.this.c((b) message.obj);
        }
    }

    k(Looper looper, L l, String str) {
        new c(looper);
        g.k(l, "Listener must not be null");
        this.a = l;
        g.i(str);
        this.b = new a<>(l, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    @RecentlyNullable
    public final a<L> b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void c(b<? super L> bVar) {
        L l = this.a;
        if (l == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }
}
