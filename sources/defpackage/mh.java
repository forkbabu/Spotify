package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: mh  reason: default package */
public final class mh extends sh {
    private final long a;
    private final tg b;
    private final pg c;

    mh(long j, tg tgVar, pg pgVar) {
        this.a = j;
        if (tgVar != null) {
            this.b = tgVar;
            if (pgVar != null) {
                this.c = pgVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // defpackage.sh
    public pg a() {
        return this.c;
    }

    @Override // defpackage.sh
    public long b() {
        return this.a;
    }

    @Override // defpackage.sh
    public tg c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sh)) {
            return false;
        }
        sh shVar = (sh) obj;
        if (this.a != shVar.b() || !this.b.equals(shVar.c()) || !this.c.equals(shVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PersistedEvent{id=");
        V0.append(this.a);
        V0.append(", transportContext=");
        V0.append(this.b);
        V0.append(", event=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
