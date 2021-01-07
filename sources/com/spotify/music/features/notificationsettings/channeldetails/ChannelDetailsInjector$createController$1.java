package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.mobius.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ChannelDetailsInjector$createController$1 extends FunctionReferenceImpl implements nmf<o, s<o, g>> {
    public static final ChannelDetailsInjector$createController$1 a = new ChannelDetailsInjector$createController$1();

    ChannelDetailsInjector$createController$1() {
        super(1, f.class, "init", "init(Lcom/spotify/music/features/notificationsettings/channeldetails/ChannelDetailsModel;)Lcom/spotify/mobius/First;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<o, g> invoke(o oVar) {
        o oVar2 = oVar;
        h.e(oVar2, "p1");
        h.e(oVar2, "model");
        s<o, g> b = s.b(oVar2);
        h.d(b, "First.first(model)");
        return b;
    }
}
