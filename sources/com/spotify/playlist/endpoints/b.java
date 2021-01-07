package com.spotify.playlist.endpoints;

import com.google.protobuf.u;
import com.spotify.messages.AddToPlaylist;
import com.spotify.messages.CreatePlaylist;
import java.util.List;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final gl0<u> a;

    public b(gl0<u> gl0) {
        h.e(gl0, "mEventPublisher");
        this.a = gl0;
    }

    @Override // com.spotify.playlist.endpoints.a
    public void a(String str, List<String> list, String str2, String str3, boolean z) {
        h.e(list, "itemUris");
        h.e(str2, "sourceViewUri");
        h.e(str3, "sourceContextUri");
        AddToPlaylist.b o = AddToPlaylist.o();
        o.m(list);
        o.n(z);
        o.q(str2);
        o.p(str3);
        if (!(str.length() == 0)) {
            o.o(str);
        }
        this.a.c(o.build());
    }

    @Override // com.spotify.playlist.endpoints.a
    public void b(String str, String str2, String str3) {
        h.e(str2, "sourceViewUri");
        h.e(str3, "sourceContextUri");
        CreatePlaylist.b m = CreatePlaylist.m();
        m.o(str2);
        m.n(str3);
        if (!(str.length() == 0)) {
            m.m(str);
        }
        this.a.c(m.build());
    }
}
