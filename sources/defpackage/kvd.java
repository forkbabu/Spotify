package defpackage;

import android.graphics.Bitmap;
import defpackage.e7;

/* renamed from: kvd  reason: default package */
public abstract class kvd {

    /* renamed from: kvd$b */
    public static final class b {
        private final Bitmap a;

        /* access modifiers changed from: package-private */
        /* renamed from: kvd$b$a */
        public class a implements e7.d {
            final /* synthetic */ d a;

            a(b bVar, d dVar) {
                this.a = dVar;
            }

            @Override // defpackage.e7.d
            public void a(e7 e7Var) {
                kvd kvd;
                if (e7Var == null) {
                    kvd = new c(null);
                } else {
                    kvd = new e(e7Var, null);
                }
                this.a.onGenerated(kvd);
            }
        }

        b(Bitmap bitmap, a aVar) {
            this.a = bitmap;
        }

        public kvd a() {
            try {
                return new e(new e7.b(this.a).b(), null);
            } catch (Exception unused) {
                return new c(null);
            }
        }

        public void b(d dVar) {
            new e7.b(this.a).a(new a(this, dVar));
        }
    }

    /* renamed from: kvd$c */
    private static class c extends kvd {
        c(a aVar) {
        }

        @Override // defpackage.kvd
        public int b(int i) {
            return i;
        }

        @Override // defpackage.kvd
        public int c(int i) {
            return i;
        }
    }

    /* renamed from: kvd$d */
    public interface d {
        void onGenerated(kvd kvd);
    }

    /* renamed from: kvd$e */
    private static class e extends kvd {
        private final e7 a;

        e(e7 e7Var, a aVar) {
            this.a = e7Var;
        }

        @Override // defpackage.kvd
        public int b(int i) {
            return this.a.h(i);
        }

        @Override // defpackage.kvd
        public int c(int i) {
            return this.a.j(i);
        }
    }

    public static b a(Bitmap bitmap) {
        return new b(bitmap, null);
    }

    public abstract int b(int i);

    public abstract int c(int i);
}
