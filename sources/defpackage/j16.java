package defpackage;

import com.spotify.playlist.models.j;
import com.spotify.playlist.models.l;
import defpackage.k16;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: j16  reason: default package */
public final class j16 extends k16 {
    private final j a;
    private final List<l> b;
    private final List<l> c;

    /* access modifiers changed from: package-private */
    /* renamed from: j16$b */
    public static final class b implements k16.a {
        private j a;
        private List<l> b;
        private List<l> c;

        b() {
        }

        public k16 a() {
            String str = this.a == null ? " playlist" : "";
            if (this.b == null) {
                str = je.x0(str, " items");
            }
            if (this.c == null) {
                str = je.x0(str, " recommendations");
            }
            if (str.isEmpty()) {
                return new j16(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public k16.a b(List<l> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        public k16.a c(j jVar) {
            if (jVar != null) {
                this.a = jVar;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        public k16.a d(List<l> list) {
            this.c = list;
            return this;
        }
    }

    j16(j jVar, List list, List list2, a aVar) {
        this.a = jVar;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.k16
    public List<l> a() {
        return this.b;
    }

    @Override // defpackage.k16
    public j b() {
        return this.a;
    }

    @Override // defpackage.k16
    public List<l> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k16)) {
            return false;
        }
        k16 k16 = (k16) obj;
        if (!this.a.equals(k16.b()) || !this.b.equals(k16.a()) || !this.c.equals(k16.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{playlist=");
        V0.append(this.a);
        V0.append(", items=");
        V0.append(this.b);
        V0.append(", recommendations=");
        return je.L0(V0, this.c, "}");
    }
}
