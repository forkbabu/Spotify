package com.spotify.libs.search.online.entity;

import com.google.common.collect.ImmutableSet;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b bVar = (b) obj;
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.ALBUM);
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.ARTIST);
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.GENRE);
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.PLAYLIST);
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.USER_PROFILE);
        builder.mo53add((ImmutableSet.Builder) RequestEntityType.TRACK);
        if (bVar.a()) {
            builder.mo53add((ImmutableSet.Builder) RequestEntityType.AUDIO_EPISODE);
            builder.mo53add((ImmutableSet.Builder) RequestEntityType.AUDIO_SHOW);
        }
        if (bVar.b()) {
            builder.mo53add((ImmutableSet.Builder) RequestEntityType.TOPIC);
        }
        return builder.build();
    }
}
