package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixUser;
import com.spotify.music.features.playlistentity.homemix.usertoggle.m;

class p implements m.b {
    final /* synthetic */ HomeMixUser a;
    final /* synthetic */ int b;
    final /* synthetic */ q c;

    p(q qVar, HomeMixUser homeMixUser, int i) {
        this.c = qVar;
        this.a = homeMixUser;
        this.b = i;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.m.b
    public void j() {
        this.c.n.g();
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.m.b
    public boolean k() {
        return this.c.n.d(this.c.c.size());
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.m.b
    public void l(boolean z) {
        this.c.n.j(this.a, this.b, z);
    }

    @Override // com.spotify.music.features.playlistentity.homemix.usertoggle.m.b
    public void m(boolean z) {
        this.c.n.i(this.a, this.b, z);
    }
}
