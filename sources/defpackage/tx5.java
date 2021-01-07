package defpackage;

import android.app.PendingIntent;

/* access modifiers changed from: package-private */
/* renamed from: tx5  reason: default package */
public final class tx5 extends cy5 {
    private final dy5 a;
    private final PendingIntent b;
    private final boolean c;

    tx5(dy5 dy5, PendingIntent pendingIntent, boolean z) {
        if (dy5 != null) {
            this.a = dy5;
            this.b = pendingIntent;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null notificationButton");
    }

    @Override // defpackage.cy5
    public PendingIntent b() {
        return this.b;
    }

    @Override // defpackage.cy5
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.cy5
    public dy5 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cy5)) {
            return false;
        }
        cy5 cy5 = (cy5) obj;
        if (!this.a.equals(cy5.d()) || ((pendingIntent = this.b) != null ? !pendingIntent.equals(cy5.b()) : cy5.b() != null) || this.c != cy5.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        PendingIntent pendingIntent = this.b;
        return ((hashCode ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationAction{notificationButton=");
        V0.append(this.a);
        V0.append(", intent=");
        V0.append(this.b);
        V0.append(", isShownInCompact=");
        return je.P0(V0, this.c, "}");
    }
}
