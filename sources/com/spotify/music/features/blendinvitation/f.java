package com.spotify.music.features.blendinvitation;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.ubi.specification.factories.z;
import java.util.List;
import kotlin.collections.d;

public final class f implements fjf<z> {
    private final c a;

    public f(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        List<String> b;
        this.a.getClass();
        String pageIdentifiers = PageIdentifiers.BLEND_INVITATION.toString();
        s52 a2 = t52.a(LinkType.BLEND_INVITATION);
        return new z(pageIdentifiers, (a2 == null || (b = a2.b()) == null) ? null : (String) d.j(b));
    }
}
