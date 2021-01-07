package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: n1f  reason: default package */
public final class n1f extends q1f {
    private final r1f a;
    private final String b;

    n1f(r1f r1f, String str) {
        if (r1f != null) {
            this.a = r1f;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null utteranceId");
        }
        throw new NullPointerException("Null state");
    }

    @Override // defpackage.q1f
    public r1f b() {
        return this.a;
    }

    @Override // defpackage.q1f
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1f)) {
            return false;
        }
        q1f q1f = (q1f) obj;
        if (!this.a.equals(q1f.b()) || !this.b.equals(q1f.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceViewModel{state=");
        V0.append(this.a);
        V0.append(", utteranceId=");
        return je.I0(V0, this.b, "}");
    }
}
