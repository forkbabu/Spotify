package defpackage;

/* renamed from: x58  reason: default package */
final class x58 extends y58 {
    private final h8b a;
    private final wsa b;

    x58(h8b h8b, wsa wsa) {
        if (h8b != null) {
            this.a = h8b;
            if (wsa != null) {
                this.b = wsa;
                return;
            }
            throw new NullPointerException("Null loggingData");
        }
        throw new NullPointerException("Null commandHandler");
    }

    @Override // defpackage.y58
    public h8b a() {
        return this.a;
    }

    @Override // defpackage.y58
    public wsa b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y58)) {
            return false;
        }
        y58 y58 = (y58) obj;
        if (!this.a.equals(y58.a()) || !this.b.equals(y58.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("RetryCommandData{commandHandler=");
        V0.append(this.a);
        V0.append(", loggingData=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
