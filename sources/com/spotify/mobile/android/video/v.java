package com.spotify.mobile.android.video;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class v {
    private final c a;
    private final AtomicInteger b = new AtomicInteger();
    private final AtomicBoolean c = new AtomicBoolean(false);

    static class a implements c {
        a() {
        }

        @Override // com.spotify.mobile.android.video.v.c
        public void a() {
        }
    }

    public class b {
        private final AtomicBoolean a = new AtomicBoolean(false);

        public b() {
            v.this.b.incrementAndGet();
        }

        public void a() {
            if (this.a.compareAndSet(false, true) && v.this.b.decrementAndGet() == 0 && v.this.c.compareAndSet(false, true)) {
                v.this.a.a();
            }
        }
    }

    public interface c {
        void a();
    }

    public v(c cVar) {
        this.a = cVar;
    }

    public static v e() {
        return new v(new a());
    }

    public b d() {
        if (!this.c.get()) {
            return new b();
        }
        throw new IllegalStateException("Cannot acquire handle after delayed execution has fired");
    }
}
