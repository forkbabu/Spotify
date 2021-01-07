package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: wy4  reason: default package */
public abstract class wy4 {

    /* renamed from: wy4$a */
    public static final class a extends wy4 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: wy4$b */
    public static final class b extends wy4 {
        private final List<ty4> a;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends ty4> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<? extends ty4> list) {
            super(null);
            h.e(list, "userSelectionList");
            this.a = list;
        }

        public final List<ty4> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<ty4> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("UserSelectionListChanged(userSelectionList="), this.a, ")");
        }
    }

    private wy4() {
    }

    public wy4(f fVar) {
    }
}
