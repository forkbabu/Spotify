package com.spotify.remoteconfig;

import com.spotify.remoteconfig.NotificationSettingsProperties;

final class ti extends NotificationSettingsProperties {
    private final boolean a;
    private final NotificationSettingsProperties.StartingPage b;

    static final class b extends NotificationSettingsProperties.a {
        private Boolean a;
        private NotificationSettingsProperties.StartingPage b;

        b() {
        }

        public NotificationSettingsProperties a() {
            String str = this.a == null ? " showEmailFirst" : "";
            if (this.b == null) {
                str = je.x0(str, " startingPage");
            }
            if (str.isEmpty()) {
                return new ti(this.a.booleanValue(), this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public NotificationSettingsProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public NotificationSettingsProperties.a c(NotificationSettingsProperties.StartingPage startingPage) {
            if (startingPage != null) {
                this.b = startingPage;
                return this;
            }
            throw new NullPointerException("Null startingPage");
        }
    }

    ti(boolean z, NotificationSettingsProperties.StartingPage startingPage, a aVar) {
        this.a = z;
        this.b = startingPage;
    }

    @Override // com.spotify.remoteconfig.NotificationSettingsProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.NotificationSettingsProperties
    public NotificationSettingsProperties.StartingPage b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationSettingsProperties)) {
            return false;
        }
        NotificationSettingsProperties notificationSettingsProperties = (NotificationSettingsProperties) obj;
        if (this.a != notificationSettingsProperties.a() || !this.b.equals(notificationSettingsProperties.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationSettingsProperties{showEmailFirst=");
        V0.append(this.a);
        V0.append(", startingPage=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
