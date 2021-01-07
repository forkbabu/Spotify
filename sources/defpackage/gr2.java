package defpackage;

import com.spotify.music.carmodehome.model.HomeShelf;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: gr2  reason: default package */
public abstract class gr2 {
    private final String a;

    /* renamed from: gr2$a */
    public static final class a extends gr2 {
        private final HomeShelf b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HomeShelf homeShelf) {
            super(homeShelf.a(), null);
            h.e(homeShelf, "homeShelf");
            this.b = homeShelf;
        }

        public final HomeShelf b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && h.a(this.b, ((a) obj).b);
            }
            return true;
        }

        public int hashCode() {
            HomeShelf homeShelf = this.b;
            if (homeShelf != null) {
                return homeShelf.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HomeShelfGridPage(homeShelf=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: gr2$b */
    public static final class b extends gr2 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "HomeShelfShortcutsGridPage(homeShelf=null)";
        }
    }

    /* renamed from: gr2$c */
    public static final class c extends gr2 {
        private final HomeShelf b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(HomeShelf homeShelf) {
            super(homeShelf.a(), null);
            h.e(homeShelf, "homeShelf");
            this.b = homeShelf;
        }

        public final HomeShelf b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && h.a(this.b, ((c) obj).b);
            }
            return true;
        }

        public int hashCode() {
            HomeShelf homeShelf = this.b;
            if (homeShelf != null) {
                return homeShelf.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("HomeShelfShortcutsPage(homeShelf=");
            V0.append(this.b);
            V0.append(")");
            return V0.toString();
        }
    }

    public gr2(String str, f fVar) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
