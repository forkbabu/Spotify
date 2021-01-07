package com.spotify.mobile.android.service.media.browser;

import com.google.common.base.Function;
import com.spotify.libs.album.AlbumArtist;

public final /* synthetic */ class e implements Function {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        AlbumArtist albumArtist = (AlbumArtist) obj;
        if (albumArtist != null) {
            return albumArtist.getName();
        }
        return null;
    }
}
