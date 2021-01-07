package defpackage;

/* renamed from: u9  reason: default package */
public class u9 {
    public String a;
    public Long b;

    public u9(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        if (!this.a.equals(u9Var.a)) {
            return false;
        }
        Long l = this.b;
        Long l2 = u9Var.b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public u9(String str, boolean z) {
        long j = z ? 1 : 0;
        this.a = str;
        this.b = Long.valueOf(j);
    }
}
