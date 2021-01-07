package com.spotify.music.features.premiumreactivation;

public final class q {
    private final NotificationDay a;
    private final String b;

    public q(NotificationDay notificationDay, String str) {
        this.a = notificationDay;
        this.b = str;
    }

    public NotificationDay a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.a.equals(qVar.a) || this.b != qVar.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
