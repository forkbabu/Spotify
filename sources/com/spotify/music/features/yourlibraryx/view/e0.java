package com.spotify.music.features.yourlibraryx.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.features.yourlibraryx.quickscroll.QuickScrollConnectable;
import kotlin.jvm.internal.h;

public final class e0 {
    private final ajf<YourLibraryXAdapter> a;
    private final eh9 b;
    private final QuickScrollConnectable c;
    private final b0 d;
    private final EncoreConsumerEntryPoint e;

    public e0(ajf<YourLibraryXAdapter> ajf, eh9 eh9, QuickScrollConnectable quickScrollConnectable, b0 b0Var, EncoreConsumerEntryPoint encoreConsumerEntryPoint) {
        h.e(ajf, "adapter");
        h.e(eh9, "logger");
        h.e(quickScrollConnectable, "quickScrollConnectable");
        h.e(b0Var, "settingsButtonViewBinder");
        h.e(encoreConsumerEntryPoint, "endpoint");
        this.a = ajf;
        this.b = eh9;
        this.c = quickScrollConnectable;
        this.d = b0Var;
        this.e = encoreConsumerEntryPoint;
    }

    public final YourLibraryXViews a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(layoutInflater, "inflater");
        YourLibraryXAdapter yourLibraryXAdapter = this.a.get();
        h.d(yourLibraryXAdapter, "adapter.get()");
        return new YourLibraryXViews(yourLibraryXAdapter, this.c, this.d, viewGroup, layoutInflater, this.b, this.e);
    }
}
