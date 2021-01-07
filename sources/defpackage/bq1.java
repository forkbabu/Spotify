package defpackage;

import defpackage.dq1;

/* renamed from: bq1  reason: default package */
public class bq1<T extends dq1> implements dq1 {
    private final T a;
    private final long b;
    private final long c;
    private final boolean f;

    public bq1(T t, long j, long j2, boolean z) {
        this.a = t;
        this.b = j;
        this.c = j2;
        this.f = z;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public T c() {
        return this.a;
    }

    public boolean d() {
        return this.f;
    }

    @Override // defpackage.dq1
    public int getTimestampMillis() {
        return this.a.getTimestampMillis();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AnnotationPlayerState{mTimedItem=");
        V0.append(this.a);
        V0.append(", mCurrentPosition=");
        V0.append(this.b);
        V0.append(", mDuration=");
        V0.append(this.c);
        V0.append(", mPlaying=");
        return je.O0(V0, this.f, '}');
    }
}
