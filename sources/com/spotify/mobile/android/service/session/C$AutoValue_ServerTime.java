package com.spotify.mobile.android.service.session;

/* renamed from: com.spotify.mobile.android.service.session.$AutoValue_ServerTime  reason: invalid class name */
abstract class C$AutoValue_ServerTime extends ServerTime {
    private final long currentServerTime;
    private final long currentTimeMillis;

    C$AutoValue_ServerTime(long j, long j2) {
        this.currentTimeMillis = j;
        this.currentServerTime = j2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.mobile.android.service.session.ServerTime
    public long currentServerTime() {
        return this.currentServerTime;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.mobile.android.service.session.ServerTime
    public long currentTimeMillis() {
        return this.currentTimeMillis;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerTime)) {
            return false;
        }
        ServerTime serverTime = (ServerTime) obj;
        if (this.currentTimeMillis == serverTime.currentTimeMillis() && this.currentServerTime == serverTime.currentServerTime()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.currentTimeMillis;
        long j2 = this.currentServerTime;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ServerTime{currentTimeMillis=");
        V0.append(this.currentTimeMillis);
        V0.append(", currentServerTime=");
        return je.E0(V0, this.currentServerTime, "}");
    }
}
