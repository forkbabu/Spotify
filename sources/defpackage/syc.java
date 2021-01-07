package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.w;
import defpackage.pzc;

/* renamed from: syc  reason: default package */
abstract class syc extends pzc {
    private final Uri a;
    private final String b;
    private final String c;
    private final r f;
    private final Optional<o> n;
    private final Optional<q> o;
    private final Optional<w> p;
    private final Optional<s> q;

    /* access modifiers changed from: package-private */
    /* renamed from: syc$a */
    public static final class a implements pzc.a {
        private Uri a;
        private String b;
        private String c;
        private r d;
        private Optional<o> e = Optional.absent();
        private Optional<q> f = Optional.absent();
        private Optional<w> g = Optional.absent();
        private Optional<s> h = Optional.absent();

        a() {
        }

        @Override // defpackage.pzc.a
        public pzc.a a(q qVar) {
            this.f = Optional.fromNullable(qVar);
            return this;
        }

        @Override // defpackage.pzc.a
        public pzc.a b(o oVar) {
            this.e = Optional.fromNullable(oVar);
            return this;
        }

        @Override // defpackage.pzc.a
        public pzc build() {
            String str = this.a == null ? " dialogImageUri" : "";
            if (this.b == null) {
                str = je.x0(str, " dialogTitle");
            }
            if (this.c == null) {
                str = je.x0(str, " dialogSubtitle");
            }
            if (this.d == null) {
                str = je.x0(str, " linkShareData");
            }
            if (str.isEmpty()) {
                return new azc(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.pzc.a
        public pzc.a c(s sVar) {
            this.h = Optional.fromNullable(sVar);
            return this;
        }

        @Override // defpackage.pzc.a
        public pzc.a d(w wVar) {
            this.g = Optional.fromNullable(wVar);
            return this;
        }

        public pzc.a e(Uri uri) {
            if (uri != null) {
                this.a = uri;
                return this;
            }
            throw new NullPointerException("Null dialogImageUri");
        }

        public pzc.a f(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null dialogSubtitle");
        }

        public pzc.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null dialogTitle");
        }

        public pzc.a h(r rVar) {
            if (rVar != null) {
                this.d = rVar;
                return this;
            }
            throw new NullPointerException("Null linkShareData");
        }
    }

    syc(Uri uri, String str, String str2, r rVar, Optional<o> optional, Optional<q> optional2, Optional<w> optional3, Optional<s> optional4) {
        if (uri != null) {
            this.a = uri;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (rVar != null) {
                        this.f = rVar;
                        if (optional != null) {
                            this.n = optional;
                            if (optional2 != null) {
                                this.o = optional2;
                                if (optional3 != null) {
                                    this.p = optional3;
                                    if (optional4 != null) {
                                        this.q = optional4;
                                        return;
                                    }
                                    throw new NullPointerException("Null messageShareData");
                                }
                                throw new NullPointerException("Null videoStoryShareData");
                            }
                            throw new NullPointerException("Null imageStoryShareData");
                        }
                        throw new NullPointerException("Null gradientStoryShareData");
                    }
                    throw new NullPointerException("Null linkShareData");
                }
                throw new NullPointerException("Null dialogSubtitle");
            }
            throw new NullPointerException("Null dialogTitle");
        }
        throw new NullPointerException("Null dialogImageUri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pzc)) {
            return false;
        }
        pzc pzc = (pzc) obj;
        if (!this.a.equals(pzc.f()) || !this.b.equals(pzc.h()) || !this.c.equals(pzc.g()) || !this.f.equals(pzc.k()) || !this.n.equals(pzc.i()) || !this.o.equals(pzc.j()) || !this.p.equals(pzc.m()) || !this.q.equals(pzc.l())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.pzc
    public Uri f() {
        return this.a;
    }

    @Override // defpackage.pzc
    public String g() {
        return this.c;
    }

    @Override // defpackage.pzc
    public String h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // defpackage.pzc
    public Optional<o> i() {
        return this.n;
    }

    @Override // defpackage.pzc
    public Optional<q> j() {
        return this.o;
    }

    @Override // defpackage.pzc
    public r k() {
        return this.f;
    }

    @Override // defpackage.pzc
    public Optional<s> l() {
        return this.q;
    }

    @Override // defpackage.pzc
    public Optional<w> m() {
        return this.p;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ShareMenuData{dialogImageUri=");
        V0.append(this.a);
        V0.append(", dialogTitle=");
        V0.append(this.b);
        V0.append(", dialogSubtitle=");
        V0.append(this.c);
        V0.append(", linkShareData=");
        V0.append(this.f);
        V0.append(", gradientStoryShareData=");
        V0.append(this.n);
        V0.append(", imageStoryShareData=");
        V0.append(this.o);
        V0.append(", videoStoryShareData=");
        V0.append(this.p);
        V0.append(", messageShareData=");
        return je.F0(V0, this.q, "}");
    }
}
