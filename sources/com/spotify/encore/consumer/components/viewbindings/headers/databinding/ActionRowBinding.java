package com.spotify.encore.consumer.components.viewbindings.headers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encore.consumer.components.viewbindings.headers.R;
import com.spotify.encore.consumer.elements.contextmenu.ContextMenuButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadButtonView;
import com.spotify.encore.consumer.elements.heart.HeartButton;

public final class ActionRowBinding {
    public final ConstraintLayout actionRowContainer;
    public final Barrier barrier;
    public final ContextMenuButton contextMenuButton;
    public final DownloadButtonView downloadButton;
    public final Guideline guideActionRowEnd;
    public final Guideline guideActionRowStart;
    public final HeartButton heartButton;
    public final TextView metadata;
    private final ConstraintLayout rootView;

    private ActionRowBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Barrier barrier2, ContextMenuButton contextMenuButton2, DownloadButtonView downloadButtonView, Guideline guideline, Guideline guideline2, HeartButton heartButton2, TextView textView) {
        this.rootView = constraintLayout;
        this.actionRowContainer = constraintLayout2;
        this.barrier = barrier2;
        this.contextMenuButton = contextMenuButton2;
        this.downloadButton = downloadButtonView;
        this.guideActionRowEnd = guideline;
        this.guideActionRowStart = guideline2;
        this.heartButton = heartButton2;
        this.metadata = textView;
    }

    public static ActionRowBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.barrier;
        Barrier barrier2 = (Barrier) view.findViewById(i);
        if (barrier2 != null) {
            i = R.id.context_menu_button;
            ContextMenuButton contextMenuButton2 = (ContextMenuButton) view.findViewById(i);
            if (contextMenuButton2 != null) {
                i = R.id.download_button;
                DownloadButtonView downloadButtonView = (DownloadButtonView) view.findViewById(i);
                if (downloadButtonView != null) {
                    i = R.id.guide_action_row_end;
                    Guideline guideline = (Guideline) view.findViewById(i);
                    if (guideline != null) {
                        i = R.id.guide_action_row_start;
                        Guideline guideline2 = (Guideline) view.findViewById(i);
                        if (guideline2 != null) {
                            i = R.id.heart_button;
                            HeartButton heartButton2 = (HeartButton) view.findViewById(i);
                            if (heartButton2 != null) {
                                i = R.id.metadata;
                                TextView textView = (TextView) view.findViewById(i);
                                if (textView != null) {
                                    return new ActionRowBinding((ConstraintLayout) view, constraintLayout, barrier2, contextMenuButton2, downloadButtonView, guideline, guideline2, heartButton2, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ActionRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActionRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.action_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
