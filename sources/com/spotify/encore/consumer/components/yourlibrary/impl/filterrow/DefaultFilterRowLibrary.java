package com.spotify.encore.consumer.components.yourlibrary.impl.filterrow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.spotify.encore.consumer.components.yourlibrary.api.filterrow.FilterRowLibrary;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryFilterChipsLayoutBinding;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class DefaultFilterRowLibrary implements FilterRowLibrary {
    private final LibraryFilterChipsLayoutBinding binding;

    public DefaultFilterRowLibrary(Context context) {
        h.e(context, "context");
        LibraryFilterChipsLayoutBinding inflate = LibraryFilterChipsLayoutBinding.inflate(LayoutInflater.from(context));
        h.d(inflate, "it");
        HorizontalScrollView root = inflate.getRoot();
        h.d(root, "it.root");
        root.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        h.d(inflate, "LibraryFilterChipsLayout…T\n            )\n        }");
        this.binding = inflate;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        HorizontalScrollView root = this.binding.getRoot();
        h.d(root, "binding.root");
        return root;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super FilterRowLibrary.Event, f> nmf) {
        h.e(nmf, "event");
        this.binding.chips.setListener$libs_encore_consumer_components_yourlibrary_impl(new DefaultFilterRowLibrary$onEvent$1(nmf));
    }

    public void render(FilterRowLibrary.Model model) {
        h.e(model, "model");
        this.binding.chips.render(model.getFilters());
    }
}
