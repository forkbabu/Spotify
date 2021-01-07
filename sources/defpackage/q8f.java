package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: q8f  reason: default package */
public final class q8f extends t8f {
    private final u8f a;
    private final String b;
    private final String c;

    q8f(u8f u8f, String str, String str2) {
        if (u8f != null) {
            this.a = u8f;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null utteranceId");
            }
            throw new NullPointerException("Null interactionId");
        }
        throw new NullPointerException("Null state");
    }

    @Override // defpackage.t8f
    public String b() {
        return this.b;
    }

    @Override // defpackage.t8f
    public u8f c() {
        return this.a;
    }

    @Override // defpackage.t8f
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t8f)) {
            return false;
        }
        t8f t8f = (t8f) obj;
        if (!this.a.equals(t8f.c()) || !this.b.equals(t8f.b()) || !this.c.equals(t8f.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceViewModel{state=");
        V0.append(this.a);
        V0.append(", interactionId=");
        V0.append(this.b);
        V0.append(", utteranceId=");
        return je.I0(V0, this.c, "}");
    }
}
