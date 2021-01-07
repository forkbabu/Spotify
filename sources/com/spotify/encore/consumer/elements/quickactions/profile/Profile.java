package com.spotify.encore.consumer.elements.quickactions.profile;

import com.spotify.encore.Element;
import com.spotify.libs.facepile.c;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Profile extends Element<List<? extends c>, f> {

    public static final class DefaultImpls {
        public static void onEvent(Profile profile, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(profile, nmf);
        }
    }
}
