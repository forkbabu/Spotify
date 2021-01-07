package defpackage;

/* renamed from: m91  reason: default package */
public class m91 {
    private final String a;

    m91(Object... objArr) {
        this.a = n91.c(objArr);
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m91) && this.a.equals(((m91) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
