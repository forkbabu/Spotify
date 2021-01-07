package com.spotify.music.features.pushnotifications;

import com.spotify.music.features.pushnotifications.p0;

/* access modifiers changed from: package-private */
public final class AutoValue_NotificationChannelsCacheItem extends p0 {
    private final String channelId;
    private final boolean lastModifiedByOS;
    private final boolean subscribed;

    /* access modifiers changed from: package-private */
    public static final class b implements p0.a {
        private String a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public p0 a() {
            String str = this.a == null ? " channelId" : "";
            if (this.b == null) {
                str = je.x0(str, " subscribed");
            }
            if (this.c == null) {
                str = je.x0(str, " lastModifiedByOS");
            }
            if (str.isEmpty()) {
                return new AutoValue_NotificationChannelsCacheItem(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public p0.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null channelId");
        }

        public p0.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public p0.a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        b(p0 p0Var, a aVar) {
            this.a = p0Var.getChannelId();
            this.b = Boolean.valueOf(p0Var.isSubscribed());
            this.c = Boolean.valueOf(p0Var.isLastModifiedByOS());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.channelId.equals(p0Var.getChannelId()) && this.subscribed == p0Var.isSubscribed() && this.lastModifiedByOS == p0Var.isLastModifiedByOS()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.pushnotifications.p0
    public String getChannelId() {
        return this.channelId;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.channelId.hashCode() ^ 1000003) * 1000003) ^ (this.subscribed ? 1231 : 1237)) * 1000003;
        if (!this.lastModifiedByOS) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.features.pushnotifications.p0
    public boolean isLastModifiedByOS() {
        return this.lastModifiedByOS;
    }

    @Override // com.spotify.music.features.pushnotifications.p0
    public boolean isSubscribed() {
        return this.subscribed;
    }

    @Override // com.spotify.music.features.pushnotifications.p0
    public p0.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationChannelsCacheItem{channelId=");
        V0.append(this.channelId);
        V0.append(", subscribed=");
        V0.append(this.subscribed);
        V0.append(", lastModifiedByOS=");
        return je.P0(V0, this.lastModifiedByOS, "}");
    }

    private AutoValue_NotificationChannelsCacheItem(String str, boolean z, boolean z2) {
        this.channelId = str;
        this.subscribed = z;
        this.lastModifiedByOS = z2;
    }
}
