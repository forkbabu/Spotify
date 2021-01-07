package defpackage;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: ee0  reason: default package */
public abstract class ee0 {

    /* renamed from: ee0$a */
    public static abstract class a extends ee0 {

        /* renamed from: ee0$a$a  reason: collision with other inner class name */
        public static final class C0591a extends a {
            public static final C0591a a = new C0591a();

            private C0591a() {
                super(null);
            }
        }

        /* renamed from: ee0$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public a(f fVar) {
            super(null);
        }
    }

    /* renamed from: ee0$b */
    public static final class b extends ee0 {
        private final int a;
        private final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i, String str) {
            super(null);
            h.e(str, "imageUrl");
            this.a = i;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && h.a(this.b, bVar.b);
        }

        public int hashCode() {
            int i = this.a * 31;
            String str = this.b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder V0 = je.V0("StartLoadingImage(screenWidth=");
            V0.append(this.a);
            V0.append(", imageUrl=");
            return je.I0(V0, this.b, ")");
        }
    }

    public ee0(f fVar) {
    }
}
