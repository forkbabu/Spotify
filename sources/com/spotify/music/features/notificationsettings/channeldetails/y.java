package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.channeldetails.h;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class y implements x {
    private final PublishSubject<h> a;

    public y() {
        PublishSubject<h> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<ChannelDetailsEvent>()");
        this.a = h1;
    }

    @Override // com.spotify.music.features.notificationsettings.channeldetails.x
    public s<h> a() {
        return this.a;
    }

    @Override // com.spotify.music.features.notificationsettings.channeldetails.x
    public void b(int i, a aVar, Channel channel, boolean z) {
        h.e(aVar, "category");
        h.e(channel, "channel");
        this.a.onNext(new h.a(i, aVar, z));
    }
}
