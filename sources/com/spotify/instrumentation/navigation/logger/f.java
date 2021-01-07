package com.spotify.instrumentation.navigation.logger;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public abstract class f {

    public static final class a extends f {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends f {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends f {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends f {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends f {
        public static final e a = new e();

        private e() {
            super(null);
        }
    }

    /* renamed from: com.spotify.instrumentation.navigation.logger.f$f  reason: collision with other inner class name */
    public static final class C0160f extends f {
        public static final C0160f a = new C0160f();

        private C0160f() {
            super(null);
        }
    }

    public static final class g extends f {
        private final c a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(c cVar) {
            super(null);
            h.e(cVar, "interactionId");
            this.a = cVar;
        }

        public final c b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && h.a(this.a, ((g) obj).a);
            }
            return true;
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar != null) {
                return cVar.hashCode();
            }
            return 0;
        }

        @Override // com.spotify.instrumentation.navigation.logger.f
        public String toString() {
            StringBuilder V0 = je.V0("UserInteraction(interactionId=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public f(kotlin.jvm.internal.f fVar) {
    }

    public final boolean a() {
        if (h.a(this, a.a)) {
            return true;
        }
        if ((this instanceof g) || h.a(this, e.a) || h.a(this, d.a) || h.a(this, c.a) || h.a(this, b.a) || h.a(this, C0160f.a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
