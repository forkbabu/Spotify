package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;

public final class LibraryFilterChipTextBinding {
    public final TextView name;
    private final TextView rootView;

    private LibraryFilterChipTextBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.name = textView2;
    }

    public static LibraryFilterChipTextBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new LibraryFilterChipTextBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    public static LibraryFilterChipTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibraryFilterChipTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_filter_chip_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}
