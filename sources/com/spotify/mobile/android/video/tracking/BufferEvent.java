package com.spotify.mobile.android.video.tracking;

import com.google.common.base.Optional;

public class BufferEvent {
    private final Kind a;
    private final long b;
    private final long c;
    private final long d;

    public enum Kind {
        INITIAL,
        SEEK,
        STALL
    }

    public BufferEvent(Kind kind, long j, long j2) {
        this.a = kind;
        this.b = j;
        this.c = j2;
        this.d = -1;
    }

    public Optional<Long> a() {
        long j = this.d;
        if (j == -1) {
            return Optional.absent();
        }
        return Optional.of(Long.valueOf(j - this.c));
    }

    public Kind b() {
        return this.a;
    }

    public BufferEvent c(long j) {
        return new BufferEvent(this.a, this.b, this.c, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BufferEvent)) {
            return false;
        }
        BufferEvent bufferEvent = (BufferEvent) obj;
        return this.b == bufferEvent.b && this.c == bufferEvent.c && this.d == bufferEvent.d && this.a == bufferEvent.a;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return (((((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("BufferEvent{mKind=");
        V0.append(this.a);
        V0.append(", mMsOccurredAtMediaPosition=");
        V0.append(this.b);
        V0.append(", mMsBufferStartTime=");
        V0.append(this.c);
        V0.append(", mMsBufferEndTime=");
        return je.D0(V0, this.d, '}');
    }

    public BufferEvent(Kind kind, long j, long j2, long j3) {
        this.a = kind;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}
