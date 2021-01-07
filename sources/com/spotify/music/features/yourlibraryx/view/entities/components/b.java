package com.spotify.music.features.yourlibraryx.view.entities.components;

import android.view.View;
import com.spotify.encore.Component;
import kotlin.f;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class b implements Component {
    private final View a;

    public b(View view) {
        h.e(view, "view");
        this.a = view;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<?, f> nmf) {
        h.e(nmf, "event");
        Component.DefaultImpls.onEvent(this, nmf);
    }

    @Override // com.spotify.encore.Item
    public void render(Object obj) {
        h.e((f) obj, "model");
    }
}
