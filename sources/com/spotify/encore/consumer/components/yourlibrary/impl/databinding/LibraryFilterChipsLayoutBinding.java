package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips.LibraryChipsView;

public final class LibraryFilterChipsLayoutBinding {
    public final LibraryChipsView chips;
    private final HorizontalScrollView rootView;

    private LibraryFilterChipsLayoutBinding(HorizontalScrollView horizontalScrollView, LibraryChipsView libraryChipsView) {
        this.rootView = horizontalScrollView;
        this.chips = libraryChipsView;
    }

    public static LibraryFilterChipsLayoutBinding bind(View view) {
        int i = R.id.chips;
        LibraryChipsView libraryChipsView = (LibraryChipsView) view.findViewById(i);
        if (libraryChipsView != null) {
            return new LibraryFilterChipsLayoutBinding((HorizontalScrollView) view, libraryChipsView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LibraryFilterChipsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibraryFilterChipsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_filter_chips_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public HorizontalScrollView getRoot() {
        return this.rootView;
    }
}
