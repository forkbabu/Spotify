package com.spotify.encore.consumer.components.api.trackrowplaylistextender.elements;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface AddToPlaylist extends Element<Boolean, f> {

    public static final class DefaultImpls {
        public static void onEvent(AddToPlaylist addToPlaylist, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(addToPlaylist, nmf);
        }
    }
}
