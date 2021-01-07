package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTrackArtist;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TracksEffectHandlersKt$toTrack$1 extends Lambda implements nmf<EntitySelector$CarePackageTrackArtist, CharSequence> {
    public static final TracksEffectHandlersKt$toTrack$1 a = new TracksEffectHandlersKt$toTrack$1();

    TracksEffectHandlersKt$toTrack$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public CharSequence invoke(EntitySelector$CarePackageTrackArtist entitySelector$CarePackageTrackArtist) {
        EntitySelector$CarePackageTrackArtist entitySelector$CarePackageTrackArtist2 = entitySelector$CarePackageTrackArtist;
        h.d(entitySelector$CarePackageTrackArtist2, "it");
        String h = entitySelector$CarePackageTrackArtist2.h();
        h.d(h, "it.name");
        return h;
    }
}
