package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.channels.f;
import com.spotify.music.features.notificationsettings.common.Channel;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class x implements w {
    private final PublishSubject<f> a;

    public x() {
        PublishSubject<f> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<ChannelsEvent>()");
        this.a = h1;
    }

    @Override // com.spotify.music.features.notificationsettings.channels.w
    public s<f> a() {
        return this.a;
    }

    @Override // com.spotify.music.features.notificationsettings.channels.w
    public void b(Channel channel, int i) {
        h.e(channel, "channel");
        this.a.onNext(new f.a(channel, i));
    }
}
