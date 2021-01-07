package com.spotify.music.features.pushnotifications;

import com.spotify.music.notification.NotificationCategoryEnum;

final class h0 extends n0 {
    private final NotificationCategoryEnum a;
    private final String b;
    private final String c;
    private final boolean d;

    h0(NotificationCategoryEnum notificationCategoryEnum, String str, String str2, boolean z) {
        if (notificationCategoryEnum != null) {
            this.a = notificationCategoryEnum;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    this.d = z;
                    return;
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null channel");
    }

    @Override // com.spotify.music.features.pushnotifications.n0
    public NotificationCategoryEnum a() {
        return this.a;
    }

    @Override // com.spotify.music.features.pushnotifications.n0
    public String b() {
        return this.c;
    }

    @Override // com.spotify.music.features.pushnotifications.n0
    public String c() {
        return this.b;
    }

    @Override // com.spotify.music.features.pushnotifications.n0
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (!this.a.equals(n0Var.a()) || !this.b.equals(n0Var.c()) || !this.c.equals(n0Var.b()) || this.d != n0Var.d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationChannelData{channel=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", description=");
        V0.append(this.c);
        V0.append(", subscribed=");
        return je.P0(V0, this.d, "}");
    }
}
