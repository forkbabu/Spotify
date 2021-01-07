package com.spotify.music.features.profile.editprofile;

import com.spotify.music.features.profile.editprofile.utils.CroppingImageView;

/* access modifiers changed from: package-private */
public class l implements CroppingImageView.b {
    final /* synthetic */ ChangeImageActivity a;

    l(ChangeImageActivity changeImageActivity) {
        this.a = changeImageActivity;
    }

    @Override // com.spotify.music.features.profile.editprofile.utils.CroppingImageView.b
    public void a() {
        ChangeImageActivity.U0(this.a, true);
    }

    @Override // com.spotify.music.features.profile.editprofile.utils.CroppingImageView.b
    public void b() {
        this.a.K.n();
    }

    @Override // com.spotify.music.features.profile.editprofile.utils.CroppingImageView.b
    public void c() {
        this.a.K.m();
    }

    @Override // com.spotify.music.features.profile.editprofile.utils.CroppingImageView.b
    public void d() {
        this.a.K.o();
    }
}
