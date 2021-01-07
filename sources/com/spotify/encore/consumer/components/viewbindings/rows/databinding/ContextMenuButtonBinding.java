package com.spotify.encore.consumer.components.viewbindings.rows.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.consumer.components.viewbindings.rows.R;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;

public final class ContextMenuButtonBinding {
    private final ContextMenuButton rootView;

    private ContextMenuButtonBinding(ContextMenuButton contextMenuButton) {
        this.rootView = contextMenuButton;
    }

    public static ContextMenuButtonBinding bind(View view) {
        if (view != null) {
            return new ContextMenuButtonBinding((ContextMenuButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public static ContextMenuButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ContextMenuButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.context_menu_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ContextMenuButton getRoot() {
        return this.rootView;
    }
}
