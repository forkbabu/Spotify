package com.spotify.music.features.login.startview;

import com.spotify.libs.pse.model.a;
import com.spotify.libs.pse.model.d;
import com.spotify.pses.v1.proto.Header;

public class s {
    private final String a;

    public s(a aVar) {
        if (aVar instanceof d) {
            Header header = ((d) aVar).getHeader();
            if (header != null) {
                this.a = header.i();
            } else {
                this.a = null;
            }
        } else {
            this.a = null;
        }
    }

    public String a() {
        return this.a;
    }
}
