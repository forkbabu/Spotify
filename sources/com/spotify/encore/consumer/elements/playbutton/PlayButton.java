package com.spotify.encore.consumer.elements.playbutton;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface PlayButton extends Element<PlayState, f> {

    public static final class DefaultImpls {
        public static void onEvent(PlayButton playButton, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(playButton, nmf);
        }
    }
}
