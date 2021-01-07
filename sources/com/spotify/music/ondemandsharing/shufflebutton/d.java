package com.spotify.music.ondemandsharing.shufflebutton;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import defpackage.s81;
import java.util.Map;

public final /* synthetic */ class d implements Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s81 b;

    public /* synthetic */ d(boolean z, s81 s81) {
        this.a = z;
        this.b = s81;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier;
        boolean z = this.a;
        s81 s81 = this.b;
        s81 s812 = (s81) obj;
        s812.getClass();
        if (!("glue:shuffleButton".equals(s812.componentId().id()) || je.B(s812, "playButton:RoundShuffle"))) {
            return s812;
        }
        s81.a builder = s812.toBuilder();
        if (z) {
            hubsImmutableComponentIdentifier = z81.d("onDemandSharingPlayback:roundButton", HubsComponentCategory.ROW.name());
        } else {
            hubsImmutableComponentIdentifier = z81.d("onDemandSharingPlayback:shuffleButton", HubsComponentCategory.ROW.name());
        }
        s81.a n = builder.n(hubsImmutableComponentIdentifier);
        Map<String, ? extends o81> events = s812.events();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        for (Map.Entry<String, ? extends o81> entry : events.entrySet()) {
            if ("click".equals(entry.getKey())) {
                o81 o81 = (o81) events.get("click");
                o81.getClass();
                builder2.mo51put("click", o81.toBuilder().e("onDemandSharingPlayback:playFromShuffleButton").c());
            } else {
                builder2.mo51put(entry.getKey(), entry.getValue());
            }
        }
        return n.q(builder2.build()).w(HubsImmutableComponentBundle.builder().p("uri", s81.metadata().string("uri")).d()).l();
    }
}
