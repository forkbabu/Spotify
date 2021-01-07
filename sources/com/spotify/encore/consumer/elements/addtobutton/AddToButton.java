package com.spotify.encore.consumer.elements.addtobutton;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface AddToButton extends Element<AddToButtonState, AddToButtonState> {

    public static final class DefaultImpls {
        public static void onEvent(AddToButton addToButton, nmf<? super AddToButtonState, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(addToButton, nmf);
        }
    }
}
