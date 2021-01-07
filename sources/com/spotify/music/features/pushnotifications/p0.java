package com.spotify.music.features.pushnotifications;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.pushnotifications.AutoValue_NotificationChannelsCacheItem;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class p0 {

    public interface a {
    }

    @JsonCreator
    public static p0 create(@JsonProperty("channelId") String str, @JsonProperty("subscribed") boolean z, @JsonProperty("lastModifiedByOS") boolean z2) {
        AutoValue_NotificationChannelsCacheItem.b bVar = new AutoValue_NotificationChannelsCacheItem.b();
        bVar.b(str);
        AutoValue_NotificationChannelsCacheItem.b bVar2 = bVar;
        bVar2.d(z);
        AutoValue_NotificationChannelsCacheItem.b bVar3 = bVar2;
        bVar3.c(z2);
        return bVar3.a();
    }

    public abstract String getChannelId();

    public abstract boolean isLastModifiedByOS();

    public abstract boolean isSubscribed();

    public abstract a toBuilder();

    public p0 withLastModifiedByOS(boolean z) {
        AutoValue_NotificationChannelsCacheItem.b bVar = (AutoValue_NotificationChannelsCacheItem.b) toBuilder();
        bVar.c(z);
        return bVar.a();
    }

    public p0 withSubscribed(boolean z) {
        AutoValue_NotificationChannelsCacheItem.b bVar = (AutoValue_NotificationChannelsCacheItem.b) toBuilder();
        bVar.d(z);
        return bVar.a();
    }
}
