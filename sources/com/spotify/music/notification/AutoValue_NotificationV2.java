package com.spotify.music.notification;

final class AutoValue_NotificationV2 extends NotificationV2 {
    private final String description;
    private final boolean emailEnabled;
    private final String key;
    private final String name;
    private final boolean pushEnabled;

    AutoValue_NotificationV2(String str, String str2, String str3, boolean z, boolean z2) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.description = str2;
                if (str3 != null) {
                    this.key = str3;
                    this.emailEnabled = z;
                    this.pushEnabled = z2;
                    return;
                }
                throw new NullPointerException("Null key");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationV2)) {
            return false;
        }
        NotificationV2 notificationV2 = (NotificationV2) obj;
        if (!this.name.equals(notificationV2.getName()) || !this.description.equals(notificationV2.getDescription()) || !this.key.equals(notificationV2.getKey()) || this.emailEnabled != notificationV2.isEmailEnabled() || this.pushEnabled != notificationV2.isPushEnabled()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.notification.NotificationV2
    public String getDescription() {
        return this.description;
    }

    @Override // com.spotify.music.notification.NotificationV2
    public String getKey() {
        return this.key;
    }

    @Override // com.spotify.music.notification.NotificationV2
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.description.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003) ^ (this.emailEnabled ? 1231 : 1237)) * 1000003;
        if (!this.pushEnabled) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.notification.NotificationV2
    public boolean isEmailEnabled() {
        return this.emailEnabled;
    }

    @Override // com.spotify.music.notification.NotificationV2
    public boolean isPushEnabled() {
        return this.pushEnabled;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationV2{name=");
        V0.append(this.name);
        V0.append(", description=");
        V0.append(this.description);
        V0.append(", key=");
        V0.append(this.key);
        V0.append(", emailEnabled=");
        V0.append(this.emailEnabled);
        V0.append(", pushEnabled=");
        return je.P0(V0, this.pushEnabled, "}");
    }
}
