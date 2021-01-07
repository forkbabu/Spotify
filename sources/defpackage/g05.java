package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: g05  reason: default package */
public abstract class g05 {

    /* renamed from: g05$a */
    public static final class a extends g05 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: g05$b */
    public static final class b extends g05 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: g05$c */
    public static final class c extends g05 {
        private final List<uy4> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<uy4> list) {
            super(null);
            h.e(list, "tracksList");
            this.a = list;
        }

        public final List<uy4> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<uy4> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Loaded(tracksList="), this.a, ")");
        }
    }

    /* renamed from: g05$d */
    public static final class d extends g05 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private g05() {
    }

    public g05(f fVar) {
    }
}
