package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ChannelsAdapter$setItems$$inlined$mapIndexed$lambda$1 extends Lambda implements nmf<Channel, f> {
    final /* synthetic */ int $position;
    final /* synthetic */ ChannelsAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelsAdapter$setItems$$inlined$mapIndexed$lambda$1(int i, ChannelsAdapter channelsAdapter) {
        super(1);
        this.$position = i;
        this.this$0 = channelsAdapter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Channel channel) {
        Channel channel2 = channel;
        h.e(channel2, "it");
        ChannelsAdapter.X(this.this$0).b(channel2, this.$position);
        return f.a;
    }
}
