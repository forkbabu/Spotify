package defpackage;

/* renamed from: jnf */
public final class jnf extends hnf {
    private static final jnf f = new jnf(1, 0);
    public static final jnf n = null;

    public jnf(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.hnf, java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof jnf) {
            if (!isEmpty() || !((jnf) obj).isEmpty()) {
                jnf jnf = (jnf) obj;
                if (!(d() == jnf.d() && e() == jnf.e())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.hnf, java.lang.Object
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + e();
    }

    public boolean i(int i) {
        return d() <= i && i <= e();
    }

    @Override // defpackage.hnf
    public boolean isEmpty() {
        return d() > e();
    }

    public Integer j() {
        return Integer.valueOf(d());
    }

    @Override // defpackage.hnf, java.lang.Object
    public String toString() {
        return d() + ".." + e();
    }
}
