package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ce4  reason: default package */
public final class ce4 extends we4 {
    private final String a;
    private final boolean b;

    ce4(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null productType");
    }

    @Override // defpackage.we4
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.we4
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we4)) {
            return false;
        }
        we4 we4 = (we4) obj;
        if (!this.a.equals(we4.c()) || this.b != we4.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseSessionInfo{productType=");
        V0.append(this.a);
        V0.append(", isPodcastsEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
