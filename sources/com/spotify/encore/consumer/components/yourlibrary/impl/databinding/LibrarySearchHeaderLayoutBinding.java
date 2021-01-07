package com.spotify.encore.consumer.components.yourlibrary.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public final class LibrarySearchHeaderLayoutBinding {
    public final EditText editText;
    public final SpotifyIconView iconBack;
    public final SpotifyIconView iconClearSearch;
    public final ConstraintLayout libraryHeaderSearchRoot;
    private final ConstraintLayout rootView;

    private LibrarySearchHeaderLayoutBinding(ConstraintLayout constraintLayout, EditText editText2, SpotifyIconView spotifyIconView, SpotifyIconView spotifyIconView2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.editText = editText2;
        this.iconBack = spotifyIconView;
        this.iconClearSearch = spotifyIconView2;
        this.libraryHeaderSearchRoot = constraintLayout2;
    }

    public static LibrarySearchHeaderLayoutBinding bind(View view) {
        int i = R.id.edit_text;
        EditText editText2 = (EditText) view.findViewById(i);
        if (editText2 != null) {
            i = R.id.icon_back;
            SpotifyIconView spotifyIconView = (SpotifyIconView) view.findViewById(i);
            if (spotifyIconView != null) {
                i = R.id.icon_clear_search;
                SpotifyIconView spotifyIconView2 = (SpotifyIconView) view.findViewById(i);
                if (spotifyIconView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new LibrarySearchHeaderLayoutBinding(constraintLayout, editText2, spotifyIconView, spotifyIconView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LibrarySearchHeaderLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LibrarySearchHeaderLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.library_search_header_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
