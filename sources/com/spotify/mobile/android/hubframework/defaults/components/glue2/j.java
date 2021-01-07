package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;

public final class j implements v51 {
    private static final kg0<HubsGlue2Card> a;
    private static final kg0<HubsGlue2Row> b;
    private static final kg0<HubsGlue2SectionHeader> c;
    private static final kg0<HubsGlue2MiscComponents> f;
    private static final kg0<HubsGlue2SolarComponents> n;
    private static final kg0<HubsGlue2TrackCloud> o;

    static {
        int i = a81.a;
        w71 w71 = w71.a;
        a = kg0.b(HubsGlue2Card.class, w71);
        b = kg0.b(HubsGlue2Row.class, w71);
        c = kg0.b(HubsGlue2SectionHeader.class, w71);
        f = kg0.b(HubsGlue2MiscComponents.class, w71);
        n = kg0.b(HubsGlue2SolarComponents.class, w71);
        o = kg0.b(HubsGlue2TrackCloud.class, w71);
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        s81.getClass();
        String id = s81.componentId().id();
        Optional<HubsGlue2Card> f2 = a.f(id);
        if (f2.isPresent()) {
            return f2.get().d(s81);
        }
        Optional<HubsGlue2Row> f3 = b.f(id);
        if (f3.isPresent()) {
            return f3.get().d(s81);
        }
        Optional<HubsGlue2SectionHeader> f4 = c.f(id);
        if (f4.isPresent()) {
            return ((HubsGlue2SectionHeader.AnonymousClass1) f4.get()).d(s81);
        }
        Optional<HubsGlue2MiscComponents> f5 = f.f(id);
        if (f5.isPresent()) {
            return f5.get().d(s81);
        }
        Optional<HubsGlue2SolarComponents> f6 = n.f(id);
        if (f6.isPresent()) {
            return f6.get().d(s81);
        }
        Optional<HubsGlue2TrackCloud> f7 = o.f(id);
        if (f7.isPresent()) {
            return ((HubsGlue2TrackCloud.AnonymousClass1) f7.get()).d(s81);
        }
        return 0;
    }
}
