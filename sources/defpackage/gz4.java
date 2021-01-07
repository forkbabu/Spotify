package defpackage;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: gz4  reason: default package */
public abstract class gz4 {

    /* renamed from: gz4$a */
    public static final class a extends gz4 {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* renamed from: gz4$b */
    public static final class b extends gz4 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    /* renamed from: gz4$c */
    public static final class c extends gz4 {
        private final List<sy4> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<sy4> list) {
            super(null);
            h.e(list, "podcastEpisodeList");
            this.a = list;
        }

        public final List<sy4> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<sy4> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.L0(je.V0("Loaded(podcastEpisodeList="), this.a, ")");
        }
    }

    /* renamed from: gz4$d */
    public static final class d extends gz4 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    private gz4() {
    }

    public gz4(f fVar) {
    }
}
