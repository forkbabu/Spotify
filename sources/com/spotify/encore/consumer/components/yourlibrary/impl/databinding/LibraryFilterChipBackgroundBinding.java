package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipBackgroundView;

public final class LibraryFilterChipBackgroundBinding {
    private final LibraryChipBackgroundView rootView;

    private LibraryFilterChipBackgroundBinding(LibraryChipBackgroundView libraryChipBackgroundView) {
        this.rootView = libraryChipBackgroundView;
    }

    public static LibraryFilterChipBackgroundBinding bind(View view) {
        if (view != null) {
            return new LibraryFilterChipBackgroundBinding((LibraryChipBackgroundView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static LibraryFilterChipBackgroundBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibraryFilterChipBackgroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_filter_chip_background, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LibraryChipBackgroundView getRoot() {
        return this.rootView;
    }
}
