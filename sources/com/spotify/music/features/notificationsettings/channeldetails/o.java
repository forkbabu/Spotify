package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import java.util.List;
import kotlin.jvm.internal.h;

public final class o {
    private final List<a> a;
    private final Channel b;

    public o(List<a> list, Channel channel) {
        h.e(list, "categories");
        h.e(channel, "showingChannel");
        this.a = list;
        this.b = channel;
    }

    public final List<a> a() {
        return this.a;
    }

    public final Channel b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.a(this.a, oVar.a) && h.a(this.b, oVar.b);
    }

    public int hashCode() {
        List<a> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Channel channel = this.b;
        if (channel != null) {
            i = channel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ChannelDetailsModel(categories=");
        V0.append(this.a);
        V0.append(", showingChannel=");
        V0.append(this.b);
        V0.append(")");
        return V0.toString();
    }
}
