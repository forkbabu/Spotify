package com.spotify.music.features.notificationsettings.channels;

import com.spotify.music.features.notificationsettings.common.Channel;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class ChannelsPageLoaderModule$providePageLoaderViewBuilder$2 extends FunctionReferenceImpl implements nmf<List<? extends Channel>, n> {
    ChannelsPageLoaderModule$providePageLoaderViewBuilder$2(o oVar) {
        super(1, oVar, o.class, "create", "create(Ljava/util/List;)Lcom/spotify/music/features/notificationsettings/channels/ChannelsPage;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public n invoke(List<? extends Channel> list) {
        return ((o) this.receiver).b(list);
    }
}
