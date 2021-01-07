package defpackage;

/* renamed from: i97  reason: default package */
final class i97 extends m97 {
    private final String a;
    private final long b;
    private final int c;
    private final String d;

    i97(String str, long j, int i, String str2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            this.c = i;
            if (str2 != null) {
                this.d = str2;
                return;
            }
            throw new NullPointerException("Null episodeUri");
        }
        throw new NullPointerException("Null contextUri");
    }

    @Override // defpackage.m97
    public String a() {
        return this.a;
    }

    @Override // defpackage.m97
    public String b() {
        return this.d;
    }

    @Override // defpackage.m97
    public long c() {
        return this.b;
    }

    @Override // defpackage.m97
    public int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m97)) {
            return false;
        }
        m97 m97 = (m97) obj;
        if (!this.a.equals(m97.a()) || this.b != m97.c() || this.c != m97.d() || !this.d.equals(m97.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.b;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListPlayerState{contextUri=");
        V0.append(this.a);
        V0.append(", playerPositionMs=");
        V0.append(this.b);
        V0.append(", playingSegmentIndex=");
        V0.append(this.c);
        V0.append(", episodeUri=");
        return je.I0(V0, this.d, "}");
    }
}
