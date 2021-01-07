package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: g9f  reason: default package */
public final class g9f extends k9f {
    private final String a;
    private final String b;
    private final l9f c;

    g9f(String str, String str2, l9f l9f) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (l9f != null) {
                    this.c = l9f;
                    return;
                }
                throw new NullPointerException("Null state");
            }
            throw new NullPointerException("Null utteranceId");
        }
        throw new NullPointerException("Null sessionId");
    }

    @Override // defpackage.k9f
    public String b() {
        return this.a;
    }

    @Override // defpackage.k9f
    public l9f c() {
        return this.c;
    }

    @Override // defpackage.k9f
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k9f)) {
            return false;
        }
        k9f k9f = (k9f) obj;
        if (!this.a.equals(k9f.b()) || !this.b.equals(k9f.d()) || !this.c.equals(k9f.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalVoiceSessionEvent{sessionId=");
        V0.append(this.a);
        V0.append(", utteranceId=");
        V0.append(this.b);
        V0.append(", state=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
