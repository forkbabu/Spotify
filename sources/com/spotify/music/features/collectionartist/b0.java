package com.spotify.music.features.collectionartist;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;

public class b0 implements blb {
    private final mfa a;

    public b0(mfa mfa) {
        this.a = mfa;
    }

    public elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        cVar.getClass();
        if (!((Boolean) cVar.M0(em9.c)).booleanValue()) {
            return elb.d(this.a.a(z.G(), cVar, z.s()));
        }
        String stringExtra = intent.getStringExtra("title");
        String currentUser = sessionState.currentUser();
        String B = z.B();
        int i = CollectionArtistFragment.z1;
        com.spotify.music.libs.viewuri.c b = ViewUris.s1.b(B);
        Bundle bundle = new Bundle();
        bundle.putParcelable("artist_collection_uri", b);
        bundle.putString("title", stringExtra);
        bundle.putString("username", currentUser);
        CollectionArtistFragment collectionArtistFragment = new CollectionArtistFragment();
        collectionArtistFragment.r4(bundle);
        d.a(collectionArtistFragment, cVar);
        return elb.d(collectionArtistFragment);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.COLLECTION_ARTIST), "Display the (collection) artist fragment.", new fkb(new u(this)));
    }
}
