package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import java.util.List;
import kotlin.jvm.internal.h;

public final class m {
    private final List<Channel> a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.notificationsettings.common.Channel> */
    /* JADX WARN: Multi-variable type inference failed */
    public m(List<? extends Channel> list) {
        h.e(list, "channels");
        this.a = list;
    }

    public final List<Channel> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && h.a(this.a, ((m) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<Channel> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("ChannelsModel(channels="), this.a, ")");
    }
}
