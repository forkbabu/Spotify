package com.spotify.music.features.onboarding.flow;

import com.spotify.android.flags.c;
import kotlin.jvm.internal.h;

public final class OnboardingDestination {
    private final Destination a;
    private final c b;

    public enum Destination {
        LANGUAGE,
        TASTE,
        FINISH
    }

    public OnboardingDestination(Destination destination, c cVar) {
        h.e(destination, "destination");
        this.a = destination;
        this.b = cVar;
    }

    public final Destination a() {
        return this.a;
    }
}
