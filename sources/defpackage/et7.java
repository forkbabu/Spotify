package defpackage;

import com.spotify.music.features.profile.model.e;
import defpackage.mt7;

/* access modifiers changed from: package-private */
/* renamed from: et7  reason: default package */
public abstract class et7 extends mt7 {
    private final String b;
    private final String c;
    private final e f;

    /* renamed from: et7$b */
    static final class b extends mt7.a {
        private String a;
        private String b;
        private e c;

        b() {
        }

        @Override // defpackage.mt7.a
        public mt7 a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " currentUser");
            }
            if (this.c == null) {
                str = je.x0(str, " profileListData");
            }
            if (str.isEmpty()) {
                return new jt7(this.a, this.b, this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.mt7.a
        public mt7.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null currentUser");
        }

        @Override // defpackage.mt7.a
        public mt7.a c(e eVar) {
            if (eVar != null) {
                this.c = eVar;
                return this;
            }
            throw new NullPointerException("Null profileListData");
        }

        @Override // defpackage.mt7.a
        public mt7.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        b(mt7 mt7, a aVar) {
            this.a = mt7.c();
            this.b = mt7.a();
            this.c = mt7.b();
        }
    }

    et7(String str, String str2, e eVar) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (eVar != null) {
                    this.f = eVar;
                    return;
                }
                throw new NullPointerException("Null profileListData");
            }
            throw new NullPointerException("Null currentUser");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.mt7
    public String a() {
        return this.c;
    }

    @Override // defpackage.mt7
    public e b() {
        return this.f;
    }

    @Override // defpackage.mt7
    public String c() {
        return this.b;
    }

    @Override // defpackage.mt7
    public mt7.a e() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mt7)) {
            return false;
        }
        mt7 mt7 = (mt7) obj;
        if (!this.b.equals(mt7.c()) || !this.c.equals(mt7.a()) || !this.f.equals(mt7.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ProfileListModel{title=");
        V0.append(this.b);
        V0.append(", currentUser=");
        V0.append(this.c);
        V0.append(", profileListData=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}
