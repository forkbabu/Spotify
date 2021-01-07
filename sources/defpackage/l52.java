package defpackage;

import android.view.Choreographer;

/* renamed from: l52  reason: default package */
public class l52 {
    private static l52 a = new l52();

    /* renamed from: l52$b */
    public static abstract class b {
        b(a aVar) {
        }
    }

    /* renamed from: l52$c */
    private static class c extends b implements Choreographer.FrameCallback {
        private final Runnable a;

        public c(Runnable runnable) {
            super(null);
            this.a = runnable;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.a.run();
        }
    }

    public static l52 a() {
        return a;
    }

    public b b(Runnable runnable) {
        return new c(runnable);
    }
}
