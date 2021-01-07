package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue.i;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Card;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2MiscComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SectionHeader;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2SolarComponents;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2TrackCloud;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.j;
import defpackage.a61;
import defpackage.u51;
import defpackage.v51;

public class h {
    private static final a61 e;
    private static final v51 f = v51.a.a(new i(), new j());
    private final HubsGlueImageDelegate a;
    private final HubsGlueComponent.a b;
    private final HubsGlue2Row.a c;
    private final HubsGlue2MiscComponents.a d;

    static {
        a61 fVar = new f();
        a61 hubsGlueEntityDecorator = new HubsGlueEntityDecorator();
        int i = a61.a.a;
        a61 a61 = o51.a;
        if (fVar == a61) {
            fVar = hubsGlueEntityDecorator;
        } else if (hubsGlueEntityDecorator != a61) {
            fVar = new n51(fVar, hubsGlueEntityDecorator);
        }
        e = fVar;
    }

    h(HubsGlueImageDelegate hubsGlueImageDelegate, HubsGlueComponent.a aVar, HubsGlue2Row.a aVar2, HubsGlue2MiscComponents.a aVar3) {
        this.a = hubsGlueImageDelegate;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    public static v51 a() {
        return f;
    }

    public static a61 c() {
        return e;
    }

    public u51 b() {
        return u51.b.a(HubsGlueCard.h(this.a), this.b, HubsGlueRow.h(this.a), HubsGlueSectionHeader.h(this.a), HubsGlue2Card.g(this.a), this.c, this.d, HubsGlue2SolarComponents.g(this.a), HubsGlue2SectionHeader.g(this.a), HubsGlue2TrackCloud.g(this.a));
    }
}
