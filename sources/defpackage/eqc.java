package defpackage;

import android.graphics.Bitmap;

/* renamed from: eqc  reason: default package */
public abstract class eqc {

    /* renamed from: eqc$a */
    public static final class a extends eqc {
        private final String a;
        private final String b;
        private final String c;
        private final boolean d;
        private final int e;

        a(String str, String str2, String str3, boolean z, int i) {
            str.getClass();
            this.a = str;
            str2.getClass();
            this.b = str2;
            str3.getClass();
            this.c = str3;
            this.d = z;
            this.e = i;
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((cqc) ti0).apply(this);
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.d != this.d || aVar.e != this.e || !aVar.a.equals(this.a) || !aVar.b.equals(this.b) || !aVar.c.equals(this.c)) {
                return false;
            }
            return true;
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.c, je.Y0(this.b, je.Y0(this.a, 0, 31), 31), 31);
            return je.b(this.e, (Boolean.valueOf(this.d).hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Create{title=");
            V0.append(this.a);
            V0.append(", description=");
            V0.append(this.b);
            V0.append(", metadata=");
            V0.append(this.c);
            V0.append(", downloaded=");
            V0.append(this.d);
            V0.append(", progress=");
            return je.A0(V0, this.e, '}');
        }
    }

    /* renamed from: eqc$b */
    public static final class b extends eqc {
        b() {
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((aqc) ti07).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "EpisodeImageFailed{}";
        }
    }

    /* renamed from: eqc$c */
    public static final class c extends eqc {
        private final Bitmap a;
        private final boolean b;

        c(Bitmap bitmap, boolean z) {
            bitmap.getClass();
            this.a = bitmap;
            this.b = z;
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((wpc) ti06).apply(this);
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
            StringBuilder V0 = je.V0("EpisodeImageLoaded{bitmap=");
            V0.append(this.a);
            V0.append(", fromNetwork=");
            return je.O0(V0, this.b, '}');
        }
    }

    /* renamed from: eqc$d */
    public static final class d extends eqc {
        d() {
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((zpc) ti05).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof d;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "EpisodeImageLoading{}";
        }
    }

    /* renamed from: eqc$e */
    public static final class e extends eqc {
        e() {
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((xpc) ti04).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof e;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PodcastImageFailed{}";
        }
    }

    /* renamed from: eqc$f */
    public static final class f extends eqc {
        private final Bitmap a;
        private final boolean b;
        private final int c;
        private final int d;

        f(Bitmap bitmap, boolean z, int i, int i2) {
            bitmap.getClass();
            this.a = bitmap;
            this.b = z;
            this.c = i;
            this.d = i2;
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((ypc) ti03).apply(this);
        }

        public final int b() {
            return this.c;
        }

        public final Bitmap c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public final int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.b == this.b && fVar.c == this.c && fVar.d == this.d && fVar.a.equals(this.a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = Boolean.valueOf(this.b).hashCode();
            return je.b(this.d, je.K(this.c, (hashCode + ((this.a.hashCode() + 0) * 31)) * 31, 31));
        }

        public String toString() {
            StringBuilder V0 = je.V0("PodcastImageLoaded{bitmap=");
            V0.append(this.a);
            V0.append(", fromNetwork=");
            V0.append(this.b);
            V0.append(", bgColor=");
            V0.append(this.c);
            V0.append(", textColor=");
            return je.A0(V0, this.d, '}');
        }
    }

    /* renamed from: eqc$g */
    public static final class g extends eqc {
        g() {
        }

        @Override // defpackage.eqc
        public final <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07) {
            return (R_) ((bqc) ti02).apply(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof g;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "PodcastImageLoading{}";
        }
    }

    eqc() {
    }

    public abstract <R_> R_ a(ti0<a, R_> ti0, ti0<g, R_> ti02, ti0<f, R_> ti03, ti0<e, R_> ti04, ti0<d, R_> ti05, ti0<c, R_> ti06, ti0<b, R_> ti07);
}
