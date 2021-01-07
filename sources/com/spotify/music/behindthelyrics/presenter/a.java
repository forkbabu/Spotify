package com.spotify.music.behindthelyrics.presenter;

import com.google.common.collect.ImmutableList;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ l a;

    public /* synthetic */ a(l lVar) {
        this.a = lVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.getClass();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) TrackAnnotation.createIntroAnnotation());
        builder.addAll((Iterable) ((TrackAnnotationSet) obj).getAnnotations());
        return builder.build();
    }
}
