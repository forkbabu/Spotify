package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import defpackage.hq0;

/* access modifiers changed from: package-private */
/* renamed from: dq0  reason: default package */
public final class dq0 extends hq0 {
    private final boolean b;
    private final eq0 c;
    private final ImmutableMap<TriggerType, String> d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: dq0$b */
    public static final class b implements hq0.a {
        private Boolean a;
        private eq0 b;
        private ImmutableMap<TriggerType, String> c;
        private String d;

        b() {
        }

        public hq0 a() {
            String str = this.a == null ? " devEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " displayMode");
            }
            if (this.c == null) {
                str = je.x0(str, " events");
            }
            if (str.isEmpty()) {
                return new dq0(this.a.booleanValue(), this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public hq0.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public hq0.a c(eq0 eq0) {
            if (eq0 != null) {
                this.b = eq0;
                return this;
            }
            throw new NullPointerException("Null displayMode");
        }

        public hq0.a d(String str) {
            this.d = str;
            return this;
        }

        public hq0.a e(ImmutableMap<TriggerType, String> immutableMap) {
            if (immutableMap != null) {
                this.c = immutableMap;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        b(hq0 hq0, a aVar) {
            this.a = Boolean.valueOf(hq0.a());
            this.b = hq0.b();
            this.c = hq0.d();
            this.d = hq0.c();
        }
    }

    dq0(boolean z, eq0 eq0, ImmutableMap immutableMap, String str, a aVar) {
        this.b = z;
        this.c = eq0;
        this.d = immutableMap;
        this.e = str;
    }

    @Override // defpackage.hq0
    public boolean a() {
        return this.b;
    }

    @Override // defpackage.hq0
    public eq0 b() {
        return this.c;
    }

    @Override // defpackage.hq0
    public String c() {
        return this.e;
    }

    @Override // defpackage.hq0
    public ImmutableMap<TriggerType, String> d() {
        return this.d;
    }

    @Override // defpackage.hq0
    public hq0.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hq0)) {
            return false;
        }
        hq0 hq0 = (hq0) obj;
        if (this.b == hq0.a() && this.c.equals(hq0.b()) && this.d.equals(hq0.d())) {
            String str = this.e;
            if (str == null) {
                if (hq0.c() == null) {
                    return true;
                }
            } else if (str.equals(hq0.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreviewToolModel{devEnabled=");
        V0.append(this.b);
        V0.append(", displayMode=");
        V0.append(this.c);
        V0.append(", events=");
        V0.append(this.d);
        V0.append(", errorMessage=");
        return je.I0(V0, this.e, "}");
    }
}
