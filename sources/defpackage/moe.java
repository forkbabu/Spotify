package defpackage;

import defpackage.poe;

/* access modifiers changed from: package-private */
/* renamed from: moe  reason: default package */
public final class moe extends poe {
    private final qoe a;

    /* access modifiers changed from: package-private */
    /* renamed from: moe$b */
    public static final class b implements poe.a {
        private qoe a;

        b() {
        }

        public poe a() {
            String str = this.a == null ? " otaState" : "";
            if (str.isEmpty()) {
                return new moe(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public poe.a b(qoe qoe) {
            if (qoe != null) {
                this.a = qoe;
                return this;
            }
            throw new NullPointerException("Null otaState");
        }
    }

    moe(qoe qoe, a aVar) {
        this.a = qoe;
    }

    @Override // defpackage.poe
    public qoe b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof poe) {
            return this.a.equals(((poe) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SuperbirdOtaModel{otaState=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
