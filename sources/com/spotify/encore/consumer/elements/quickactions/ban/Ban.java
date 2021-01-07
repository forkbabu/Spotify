package com.spotify.encore.consumer.elements.quickactions.ban;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Ban extends Element<Boolean, Boolean> {

    public static final class DefaultImpls {
        public static void onEvent(Ban ban, nmf<? super Boolean, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(ban, nmf);
        }
    }
}
