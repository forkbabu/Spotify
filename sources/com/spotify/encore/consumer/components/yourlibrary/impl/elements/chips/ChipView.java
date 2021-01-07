package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import android.widget.TextView;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryFilterChipBackgroundBinding;
import com.spotify.encore.consumer.components.yourlibrary.impl.databinding.LibraryFilterChipTextBinding;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ChipView {
    private final LibraryFilterChipBackgroundBinding background;
    private final LibraryFilterChipTextBinding text;

    public ChipView(LibraryFilterChipTextBinding libraryFilterChipTextBinding, LibraryFilterChipBackgroundBinding libraryFilterChipBackgroundBinding) {
        h.e(libraryFilterChipTextBinding, "text");
        h.e(libraryFilterChipBackgroundBinding, "background");
        this.text = libraryFilterChipTextBinding;
        this.background = libraryFilterChipBackgroundBinding;
    }

    public final int backgroundId() {
        LibraryChipBackgroundView root = this.background.getRoot();
        h.d(root, "background.root");
        return root.getId();
    }

    public final LibraryFilterChipBackgroundBinding getBackground() {
        return this.background;
    }

    public final LibraryFilterChipTextBinding getText() {
        return this.text;
    }

    public final void selected(boolean z, int i) {
        TextView root = this.text.getRoot();
        h.d(root, "text.root");
        root.setSelected(z);
        LibraryChipBackgroundView root2 = this.background.getRoot();
        h.d(root2, "background.root");
        root2.setSelected(z);
        this.background.getRoot().setOrder$libs_encore_consumer_components_yourlibrary_impl(i > 0 ? Order.Middle : Order.First);
    }

    public final void setName(String str) {
        h.e(str, "name");
        TextView root = this.text.getRoot();
        h.d(root, "text.root");
        root.setText(str);
    }

    public final int textId() {
        TextView root = this.text.getRoot();
        h.d(root, "text.root");
        return root.getId();
    }

    public final void visibility(int i) {
        TextView root = this.text.getRoot();
        h.d(root, "text.root");
        root.setVisibility(i);
        LibraryChipBackgroundView root2 = this.background.getRoot();
        h.d(root2, "background.root");
        root2.setVisibility(i);
    }
}
