package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ChannelDetailsAdapter$setItems$$inlined$mapIndexed$lambda$1 extends Lambda implements rmf<a, Boolean, f> {
    final /* synthetic */ int $index;
    final /* synthetic */ Channel $showingCategoriesForChannel$inlined;
    final /* synthetic */ ChannelDetailsAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelDetailsAdapter$setItems$$inlined$mapIndexed$lambda$1(int i, ChannelDetailsAdapter channelDetailsAdapter, Channel channel) {
        super(2);
        this.$index = i;
        this.this$0 = channelDetailsAdapter;
        this.$showingCategoriesForChannel$inlined = channel;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(a aVar, Boolean bool) {
        a aVar2 = aVar;
        boolean booleanValue = bool.booleanValue();
        h.e(aVar2, "category");
        ChannelDetailsAdapter.X(this.this$0).b(this.$index, aVar2, this.$showingCategoriesForChannel$inlined, booleanValue);
        return f.a;
    }
}
