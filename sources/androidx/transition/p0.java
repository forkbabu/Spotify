package androidx.transition;

import android.os.IBinder;

/* access modifiers changed from: package-private */
public class p0 implements r0 {
    private final IBinder a;

    p0(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p0) && ((p0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
