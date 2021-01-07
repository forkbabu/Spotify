package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.features.notificationsettings.common.a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class ChannelDetailsPageLoaderModule$providePageLoaderViewBuilder$2 extends FunctionReferenceImpl implements nmf<Pair<? extends List<a>, ? extends Channel>, p> {
    ChannelDetailsPageLoaderModule$providePageLoaderViewBuilder$2(q qVar) {
        super(1, qVar, q.class, "create", "create(Lkotlin/Pair;)Lcom/spotify/music/features/notificationsettings/channeldetails/ChannelDetailsPage;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public p invoke(Pair<? extends List<a>, ? extends Channel> pair) {
        return ((q) this.receiver).b(pair);
    }
}
