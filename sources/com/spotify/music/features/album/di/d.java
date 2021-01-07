package com.spotify.music.features.album.di;

import com.google.common.base.Predicate;

public final /* synthetic */ class d implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ d(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        String str = this.a;
        s81 s81 = (s81) obj;
        String id = s81.componentId().id();
        if (!(id.equals("glue2:trackRow") || id.equals("consumerMobile:albumTrackRow") || id.equals("glue:entityRow") || id.equals("row:trackWithDownloadProgress")) || !str.equals(s81.metadata().string("uri"))) {
            return false;
        }
        return true;
    }
}
