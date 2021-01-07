package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.google.common.base.Optional;

public final class i implements v51 {
    private static final kg0<HubsGlueRow> a;
    private static final kg0<HubsGlueCard> b;
    private static final kg0<HubsGlueSectionHeader> c;
    private static final kg0<HubsGlueComponent> f;

    static {
        int i = a81.a;
        w71 w71 = w71.a;
        a = kg0.b(HubsGlueRow.class, w71);
        b = kg0.b(HubsGlueCard.class, w71);
        c = kg0.b(HubsGlueSectionHeader.class, w71);
        f = kg0.b(HubsGlueComponent.class, w71);
    }

    @Override // defpackage.v51
    public int d(s81 s81) {
        s81.getClass();
        String id = s81.componentId().id();
        Optional<HubsGlueRow> f2 = a.f(id);
        if (f2.isPresent()) {
            return f2.get().d(s81);
        }
        Optional<HubsGlueCard> f3 = b.f(id);
        if (f3.isPresent()) {
            return f3.get().d(s81);
        }
        Optional<HubsGlueSectionHeader> f4 = c.f(id);
        if (f4.isPresent()) {
            return f4.get().d(s81);
        }
        Optional<HubsGlueComponent> f5 = f.f(id);
        if (f5.isPresent()) {
            return f5.get().d(s81);
        }
        return 0;
    }
}
