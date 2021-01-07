package com.spotify.encore;

import com.spotify.encore.Item;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Component<Model, Event> extends Item<Model, Event>, ViewProvider {

    public static final class DefaultImpls {
        public static <Model, Event> void onEvent(Component<Model, Event> component, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
            Item.DefaultImpls.onEvent(component, nmf);
        }
    }
}
