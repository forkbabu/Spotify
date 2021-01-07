package defpackage;

import defpackage.tqe;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* renamed from: pqe  reason: default package */
public class pqe implements tqe.b {
    public static final pqe b = new pqe(null);
    private final List<rqe> a = Collections.emptyList();

    private pqe(List<rqe> list) {
    }

    @Override // defpackage.tqe.b
    public List<String> a() {
        return tqe.b(this.a);
    }

    public List<rqe> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pqe.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((pqe) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        if (this.a.isEmpty()) {
            return "";
        }
        return (String) this.a.stream().map(oqe.a).collect(Collectors.joining("/", "{", "}"));
    }
}
