package com.spotify.music.features.profile.editprofile.permissions;

import com.spotify.music.features.profile.editprofile.EditProfileActivity;

public final class a implements fjf<EditProfilePermissionsManager> {
    private final wlf<EditProfileActivity> a;

    public a(wlf<EditProfileActivity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EditProfilePermissionsManager(this.a.get());
    }
}
