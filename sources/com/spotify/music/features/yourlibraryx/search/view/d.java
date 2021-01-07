package com.spotify.music.features.yourlibraryx.search.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXAdapter;
import kotlin.jvm.internal.h;

public final class d {
    private final EncoreConsumerEntryPoint a;
    private final YourLibraryXAdapter b;
    private final eh9 c;

    public d(EncoreConsumerEntryPoint encoreConsumerEntryPoint, YourLibraryXAdapter yourLibraryXAdapter, eh9 eh9) {
        h.e(encoreConsumerEntryPoint, "encoreConsumerEntryPoint");
        h.e(yourLibraryXAdapter, "adapter");
        h.e(eh9, "logger");
        this.a = encoreConsumerEntryPoint;
        this.b = yourLibraryXAdapter;
        this.c = eh9;
    }

    public final YourLibraryXSearchViews a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(layoutInflater, "inflater");
        return new YourLibraryXSearchViews(viewGroup, layoutInflater, this.a, this.b, this.c);
    }
}
