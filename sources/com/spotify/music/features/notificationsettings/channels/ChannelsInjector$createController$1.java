package com.spotify.music.features.notificationsettings.channels;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ChannelsInjector$createController$1 extends FunctionReferenceImpl implements nmf<m, s<m, e>> {
    public static final ChannelsInjector$createController$1 a = new ChannelsInjector$createController$1();

    ChannelsInjector$createController$1() {
        super(1, d.class, "init", "init(Lcom/spotify/music/features/notificationsettings/channels/ChannelsModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<m, e> invoke(m mVar) {
        m mVar2 = mVar;
        h.e(mVar2, "p1");
        h.e(mVar2, "model");
        s<m, e> b = s.b(mVar2);
        h.d(b, "First.first(model)");
        return b;
    }
}
