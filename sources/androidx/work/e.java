package androidx.work;

import android.app.Notification;

public final class e {
    private final int a;
    private final int b;
    private final Notification c;

    public e(int i, Notification notification) {
        this.a = i;
        this.c = notification;
        this.b = 0;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a == eVar.a && this.b == eVar.b) {
            return this.c.equals(eVar.c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }

    public e(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }
}
