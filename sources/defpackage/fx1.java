package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: fx1  reason: default package */
public abstract class fx1 {

    /* renamed from: fx1$a */
    public static final class a extends fx1 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: fx1$b */
    public static final class b extends fx1 {
        private final List<cmf<lx1>> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends cmf<lx1>> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<? extends cmf<lx1>> list) {
            super(null);
            h.e(list, "stories");
            this.a = list;
        }

        public final List<cmf<lx1>> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<cmf<lx1>> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Success(stories="), this.a, ")");
        }
    }

    private fx1() {
    }

    public fx1(f fVar) {
    }
}
