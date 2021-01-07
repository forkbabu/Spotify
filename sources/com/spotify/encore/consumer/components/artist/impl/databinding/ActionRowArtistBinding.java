package com.spotify.encore.consumer.components.artist.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.artist.impl.R;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.follow.FollowButtonView;

public final class ActionRowArtistBinding {
    public final ConstraintLayout actionRowContainer;
    public final ContextMenuButton contextMenuButton;
    public final FollowButtonView followButton;
    public final Guideline guideActionRowBottom;
    public final Guideline guideActionRowEnd;
    public final Guideline guideActionRowStart;
    public final TextView metadata;
    private final ConstraintLayout rootView;

    private ActionRowArtistBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ContextMenuButton contextMenuButton2, FollowButtonView followButtonView, Guideline guideline, Guideline guideline2, Guideline guideline3, TextView textView) {
        this.rootView = constraintLayout;
        this.actionRowContainer = constraintLayout2;
        this.contextMenuButton = contextMenuButton2;
        this.followButton = followButtonView;
        this.guideActionRowBottom = guideline;
        this.guideActionRowEnd = guideline2;
        this.guideActionRowStart = guideline3;
        this.metadata = textView;
    }

    public static ActionRowArtistBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.context_menu_button;
        ContextMenuButton contextMenuButton2 = (ContextMenuButton) view.findViewById(i);
        if (contextMenuButton2 != null) {
            i = R.id.follow_button;
            FollowButtonView followButtonView = (FollowButtonView) view.findViewById(i);
            if (followButtonView != null) {
                i = R.id.guide_action_row_bottom;
                Guideline guideline = (Guideline) view.findViewById(i);
                if (guideline != null) {
                    i = R.id.guide_action_row_end;
                    Guideline guideline2 = (Guideline) view.findViewById(i);
                    if (guideline2 != null) {
                        i = R.id.guide_action_row_start;
                        Guideline guideline3 = (Guideline) view.findViewById(i);
                        if (guideline3 != null) {
                            i = R.id.metadata;
                            TextView textView = (TextView) view.findViewById(i);
                            if (textView != null) {
                                return new ActionRowArtistBinding((ConstraintLayout) view, constraintLayout, contextMenuButton2, followButtonView, guideline, guideline2, guideline3, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActionRowArtistBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActionRowArtistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.action_row_artist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
