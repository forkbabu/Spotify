package defpackage;

import android.graphics.Bitmap;

/* renamed from: gqc  reason: default package */
public abstract class gqc {

    /* renamed from: gqc$a */
    public static final class a extends gqc {
        a() {
        }

        @Override // defpackage.gqc
        public final void a(si0<d> si0, si0<c> si02, si0<b> si03, si0<a> si04) {
            ((fpc) si04).a.f(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Absent{}";
        }
    }

    /* renamed from: gqc$b */
    public static final class b extends gqc {
        b() {
        }

        @Override // defpackage.gqc
        public final void a(si0<d> si0, si0<c> si02, si0<b> si03, si0<a> si04) {
            ((cpc) si03).a.e(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Failed{}";
        }
    }

    /* renamed from: gqc$c */
    public static final class c extends gqc {
        private final Bitmap a;
        private final boolean b;

        c(Bitmap bitmap, boolean z) {
            bitmap.getClass();
            this.a = bitmap;
            this.b = z;
        }

        @Override // defpackage.gqc
        public final void a(si0<d> si0, si0<c> si02, si0<b> si03, si0<a> si04) {
            epc epc = (epc) si02;
            epc.a.d(epc.b, this);
        }

        public final Bitmap b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b != this.b || !cVar.a.equals(this.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return je.n(this.b, (this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Loaded{bitmap=");
            V0.append(this.a);
            V0.append(", fromNetwork=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: gqc$d */
    public static final class d extends gqc {
        d() {
        }

        @Override // defpackage.gqc
        public final void a(si0<d> si0, si0<c> si02, si0<b> si03, si0<a> si04) {
            ((dpc) si0).a.c(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "Loading{}";
        }
    }

    gqc() {
    }

    public abstract void a(si0<d> si0, si0<c> si02, si0<b> si03, si0<a> si04);
}
