package com.spotify.encore.consumer.elements.backbutton;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface BackButton extends Element {

    public static final class DefaultImpls {
        public static void onEvent(BackButton backButton, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(backButton, nmf);
        }
    }
}
