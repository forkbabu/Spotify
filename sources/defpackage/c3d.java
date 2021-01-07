package defpackage;

import com.spotify.music.slate.model.BackgroundColor;
import com.spotify.music.slate.model.q;
import com.spotify.music.slate.model.u;
import defpackage.k3d;

/* access modifiers changed from: package-private */
/* renamed from: c3d  reason: default package */
public abstract class c3d extends k3d {
    private final u a;
    private final u b;
    private final q c;
    private final u f;
    private final BackgroundColor n;
    private final k3d.b o;

    /* access modifiers changed from: package-private */
    /* renamed from: c3d$a */
    public static class a extends k3d.a {
        private u a;
        private u b;
        private q c;
        private u d;
        private BackgroundColor e;
        private k3d.b f;

        a() {
        }

        @Override // defpackage.k3d.a
        public k3d.a a(BackgroundColor backgroundColor) {
            this.e = backgroundColor;
            return this;
        }

        @Override // defpackage.k3d.a
        public k3d b() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.c == null) {
                str = je.x0(str, " image");
            }
            if (this.d == null) {
                str = je.x0(str, " positiveAction");
            }
            if (this.e == null) {
                str = je.x0(str, " backgroundColor");
            }
            if (this.f == null) {
                str = je.x0(str, " layout");
            }
            if (str.isEmpty()) {
                return new f3d(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.k3d.a
        public k3d.a c(q qVar) {
            this.c = qVar;
            return this;
        }

        @Override // defpackage.k3d.a
        public k3d.a d(k3d.b bVar) {
            this.f = bVar;
            return this;
        }

        @Override // defpackage.k3d.a
        public k3d.a e(u uVar) {
            this.d = uVar;
            return this;
        }

        @Override // defpackage.k3d.a
        public k3d.a f(u uVar) {
            this.b = uVar;
            return this;
        }

        @Override // defpackage.k3d.a
        public k3d.a g(u uVar) {
            this.a = uVar;
            return this;
        }
    }

    c3d(u uVar, u uVar2, q qVar, u uVar3, BackgroundColor backgroundColor, k3d.b bVar) {
        if (uVar != null) {
            this.a = uVar;
            if (uVar2 != null) {
                this.b = uVar2;
                if (qVar != null) {
                    this.c = qVar;
                    if (uVar3 != null) {
                        this.f = uVar3;
                        if (backgroundColor != null) {
                            this.n = backgroundColor;
                            if (bVar != null) {
                                this.o = bVar;
                                return;
                            }
                            throw new NullPointerException("Null layout");
                        }
                        throw new NullPointerException("Null backgroundColor");
                    }
                    throw new NullPointerException("Null positiveAction");
                }
                throw new NullPointerException("Null image");
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.k3d
    public BackgroundColor a() {
        return this.n;
    }

    @Override // defpackage.k3d
    public q c() {
        return this.c;
    }

    @Override // defpackage.k3d
    public k3d.b e() {
        return this.o;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3d)) {
            return false;
        }
        k3d k3d = (k3d) obj;
        if (!this.a.equals(k3d.h()) || !this.b.equals(k3d.g()) || !this.c.equals(k3d.c()) || !this.f.equals(k3d.f()) || !this.n.equals(k3d.a()) || !this.o.equals(k3d.e())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k3d
    public u f() {
        return this.f;
    }

    @Override // defpackage.k3d
    public u g() {
        return this.b;
    }

    @Override // defpackage.k3d
    public u h() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TwoLineAndImageViewModel{title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", image=");
        V0.append(this.c);
        V0.append(", positiveAction=");
        V0.append(this.f);
        V0.append(", backgroundColor=");
        V0.append(this.n);
        V0.append(", layout=");
        V0.append(this.o);
        V0.append("}");
        return V0.toString();
    }
}
