package com.spotify.music.features.profile.entity;

import com.google.common.base.Supplier;
import com.spotify.music.libs.viewuri.c;

public final /* synthetic */ class a implements Supplier {
    public final /* synthetic */ ProfileEntityFragment a;

    public /* synthetic */ a(ProfileEntityFragment profileEntityFragment) {
        this.a = profileEntityFragment;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        String string = this.a.k4().getString("key_profile_uri");
        string.getClass();
        return c.a(string);
    }
}
