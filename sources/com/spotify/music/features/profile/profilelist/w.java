package com.spotify.music.features.profile.profilelist;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.ubi.specification.factories.g3;
import com.spotify.ubi.specification.factories.h3;
import com.spotify.ubi.specification.factories.i3;
import com.spotify.ubi.specification.factories.j3;

public class w {
    private final ere a;
    private final i3 b = new i3();
    private final j3 c = new j3();
    private final g3 d = new g3();
    private final h3 e = new h3();
    private final LinkType f;

    public w(ere ere, dt7 dt7) {
        this.a = ere;
        this.f = l0.z(dt7.x()).q();
    }

    public void a(ProfileListItem profileListItem, int i) {
        String i2 = profileListItem.i();
        int ordinal = this.f.ordinal();
        if (ordinal != 211) {
            switch (ordinal) {
                case 206:
                    this.a.a(this.c.b().b(Integer.valueOf(i), i2).a(i2));
                    return;
                case 207:
                    this.a.a(this.d.b().b(Integer.valueOf(i), i2).a(i2));
                    return;
                case 208:
                    this.a.a(this.e.b().b(Integer.valueOf(i), i2).a(i2));
                    return;
                default:
                    throw new Assertion.RecoverableAssertionError("Unsupported link type");
            }
        } else {
            this.a.a(this.b.b().b(Integer.valueOf(i), i2).a(i2));
        }
    }
}
