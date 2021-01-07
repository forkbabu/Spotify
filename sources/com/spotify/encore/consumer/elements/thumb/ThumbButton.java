package com.spotify.encore.consumer.elements.thumb;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ThumbButton extends Element<ThumbButtonState, ThumbButtonEvent> {

    public static final class DefaultImpls {
        public static void onEvent(ThumbButton thumbButton, nmf<? super ThumbButtonEvent, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(thumbButton, nmf);
        }
    }

    void swing();
}
