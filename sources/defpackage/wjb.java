package defpackage;

import com.spotify.music.libs.viewuri.c;
import defpackage.yjb;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: wjb  reason: default package */
public abstract class wjb extends yjb {
    private final c a;
    private final List<String> b;

    /* access modifiers changed from: package-private */
    /* renamed from: wjb$a */
    public static class a extends yjb.a {
        private c a;
        private List<String> b;

        a() {
        }

        @Override // defpackage.yjb.a
        public yjb a() {
            String str = this.a == null ? " viewUri" : "";
            if (this.b == null) {
                str = je.x0(str, " uris");
            }
            if (str.isEmpty()) {
                return new xjb(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.yjb.a
        public yjb.a b(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null uris");
        }

        @Override // defpackage.yjb.a
        public yjb.a c(c cVar) {
            if (cVar != null) {
                this.a = cVar;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }
    }

    wjb(c cVar, List<String> list) {
        if (cVar != null) {
            this.a = cVar;
            if (list != null) {
                this.b = list;
                return;
            }
            throw new NullPointerException("Null uris");
        }
        throw new NullPointerException("Null viewUri");
    }

    @Override // defpackage.yjb
    public List<String> b() {
        return this.b;
    }

    @Override // defpackage.yjb
    public c c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yjb)) {
            return false;
        }
        yjb yjb = (yjb) obj;
        if (!this.a.equals(yjb.c()) || !this.b.equals(yjb.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ModerationViewConfig{viewUri=");
        V0.append(this.a);
        V0.append(", uris=");
        return je.L0(V0, this.b, "}");
    }
}
