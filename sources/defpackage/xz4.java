package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: xz4  reason: default package */
public abstract class xz4 {

    /* renamed from: xz4$a */
    public static final class a extends xz4 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: xz4$b */
    public static final class b extends xz4 {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "searchQuery");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("NoResult(searchQuery="), this.a, ")");
        }
    }

    /* renamed from: xz4$c */
    public static final class c extends xz4 {
        private final List<uy4> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<uy4> list) {
            super(null);
            h.e(list, "resultList");
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
            return je.L0(je.V0("Success(resultList="), this.a, ")");
        }
    }

    private xz4() {
    }

    public xz4(f fVar) {
    }
}
