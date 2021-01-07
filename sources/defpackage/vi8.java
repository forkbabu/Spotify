package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: vi8  reason: default package */
public final class vi8 extends yi8 {
    private final long b;
    private final long c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    vi8(long j, long j2, boolean z, boolean z2, boolean z3) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.yi8
    public boolean b() {
        return this.f;
    }

    @Override // defpackage.yi8
    public boolean c() {
        return this.d;
    }

    @Override // defpackage.yi8
    public boolean d() {
        return this.e;
    }

    @Override // defpackage.yi8
    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yi8)) {
            return false;
        }
        yi8 yi8 = (yi8) obj;
        if (this.b == yi8.f() && this.c == yi8.e() && this.d == yi8.c() && this.e == yi8.d() && this.f == yi8.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yi8
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i2 = 1231;
        int i3 = (((i ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ReminderModel{savedAdTimestamp=");
        V0.append(this.b);
        V0.append(", reminderShownTimeStamp=");
        V0.append(this.c);
        V0.append(", hasSavedAnAd=");
        V0.append(this.d);
        V0.append(", hasTimeElapsed=");
        V0.append(this.e);
        V0.append(", hasSavedAdInBackground=");
        return je.P0(V0, this.f, "}");
    }
}
