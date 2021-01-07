package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: fu5  reason: default package */
public final class fu5 extends nu5 {
    private final long a;
    private final long b;
    private final float c;

    fu5(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    @Override // defpackage.nu5
    public long b() {
        return this.a;
    }

    @Override // defpackage.nu5
    public long c() {
        return this.b;
    }

    @Override // defpackage.nu5
    public float d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nu5)) {
            return false;
        }
        nu5 nu5 = (nu5) obj;
        if (this.a == nu5.b() && this.b == nu5.c() && Float.floatToIntBits(this.c) == Float.floatToIntBits(nu5.d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return Float.floatToIntBits(this.c) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ProgressBarViewData{currentPlaybackPosition=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", playbackSpeed=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
