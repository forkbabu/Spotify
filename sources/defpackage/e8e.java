package defpackage;

import java.util.List;

/* renamed from: e8e  reason: default package */
abstract class e8e extends k8e {
    private final List<String> a;

    e8e(List<String> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null gradientColors");
    }

    @Override // defpackage.k8e
    public List<String> b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k8e) {
            return this.a.equals(((k8e) obj).b());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("GradientShareMedia{gradientColors="), this.a, "}");
    }
}
