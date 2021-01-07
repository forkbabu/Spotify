package com.spotify.music.slate.model;

import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public abstract class v implements o {
    /* access modifiers changed from: protected */
    public abstract Uri a();

    @Override // com.spotify.music.slate.model.o
    public z p1(Picasso picasso) {
        return picasso.l(a());
    }
}
