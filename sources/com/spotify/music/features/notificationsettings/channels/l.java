package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.pageloader.m0;
import com.spotify.pageloader.o0;
import com.spotify.remoteconfig.NotificationSettingsProperties;
import io.reactivex.z;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class l implements k {
    private final NotificationSettingsProperties a;

    public l(NotificationSettingsProperties notificationSettingsProperties) {
        h.e(notificationSettingsProperties, "properties");
        this.a = notificationSettingsProperties;
    }

    @Override // com.spotify.music.features.notificationsettings.channels.k
    public o0<List<Channel>> a() {
        if (this.a.a()) {
            o0<List<Channel>> a2 = m0.a(z.z(d.u(Channel.EMAIL, Channel.PUSH)));
            h.d(a2, "SingleLoadable.create(Si…el.EMAIL, Channel.PUSH)))");
            return a2;
        }
        o0<List<Channel>> a3 = m0.a(z.z(d.u(Channel.PUSH, Channel.EMAIL)));
        h.d(a3, "SingleLoadable.create(Si…el.PUSH, Channel.EMAIL)))");
        return a3;
    }
}
