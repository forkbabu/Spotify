package com.spotify.music.behindthelyrics.presenter;

import android.content.Intent;
import android.net.Uri;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.functions.g;

public class k implements g<TrackAnnotationSet> {
    private final bl2 a;
    private final sk2 b;

    public k(bl2 bl2, sk2 sk2) {
        this.a = bl2;
        this.b = sk2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(TrackAnnotationSet trackAnnotationSet) {
        TrackAnnotationSet trackAnnotationSet2 = trackAnnotationSet;
        this.a.setCreditsDestination(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://genius.com/songs/%s?utm_source=spotify", Integer.valueOf(trackAnnotationSet2.getGeniusTrackId())))));
        this.b.d(trackAnnotationSet2);
        this.a.setLoggingDataMapper(this.b);
    }
}
