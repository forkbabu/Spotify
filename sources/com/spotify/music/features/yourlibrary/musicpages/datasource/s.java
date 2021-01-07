package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.mobile.android.util.x;
import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.AlbumRecommendation;
import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.AlbumRecommendationsResponse;
import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;

public final /* synthetic */ class s implements l {
    public static final /* synthetic */ s a = new s();

    private /* synthetic */ s() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List list = (List) x.n(((AlbumRecommendationsResponse) obj).getAlbumRecommendations(), Collections.emptyList());
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((AlbumRecommendation) list.get(i)).getUri();
        }
        return strArr;
    }
}
