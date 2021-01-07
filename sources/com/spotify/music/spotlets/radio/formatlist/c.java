package com.spotify.music.spotlets.radio.formatlist;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<Map<String, String>> mediaItems = ((RadioFormatListSourceModel) obj).mediaItems();
        if (mediaItems == null || mediaItems.isEmpty()) {
            return Optional.absent();
        }
        return Optional.fromNullable(mediaItems.get(0).get("uri"));
    }
}
