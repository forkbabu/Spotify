package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.mobile.android.util.LinkType;

public class m1 implements blb {
    @Override // defpackage.blb
    public void b(glb glb) {
        q0 q0Var = q0.a;
        r0 r0Var = r0.a;
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.COLLECTION_TRACKS, "Collection tracks: Liked Songs in Your Library.", q0Var);
        xkb.k(mlb.b(LinkType.COLLECTION_PLAYLIST_FOLDER), "Collection playlist folders: Music pages drill down in Your Library.", new fkb(r0Var));
    }
}
