package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ef0  reason: default package */
final class ef0 {
    private final long a;
    private final long b;
    private final long c;

    private ef0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    static ef0 a(long j) {
        long j2 = j + 29000;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j2);
        long hours = timeUnit.toHours(j2);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        long hours2 = hours - timeUnit2.toHours(days);
        return new ef0(days, hours2, (timeUnit.toMinutes(j2) - timeUnit2.toMinutes(days)) - TimeUnit.HOURS.toMinutes(hours2));
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}
