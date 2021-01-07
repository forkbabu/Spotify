package com.spotify.encore.consumer.components.podcastinteractivity.impl.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.components.podcastinteractivity.impl.R;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;

public final class ReplyRowQnaLayoutBinding {
    public final Barrier barrier;
    public final StateListAnimatorButton replyButton;
    public final TextView responseCount;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowRoot;

    private ReplyRowQnaLayoutBinding(ConstraintLayout constraintLayout, Barrier barrier2, StateListAnimatorButton stateListAnimatorButton, TextView textView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.barrier = barrier2;
        this.replyButton = stateListAnimatorButton;
        this.responseCount = textView;
        this.rowRoot = constraintLayout2;
    }

    public static ReplyRowQnaLayoutBinding bind(View view) {
        int i = R.id.barrier;
        Barrier barrier2 = (Barrier) view.findViewById(i);
        if (barrier2 != null) {
            i = R.id.replyButton;
            StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) view.findViewById(i);
            if (stateListAnimatorButton != null) {
                i = R.id.responseCount;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new ReplyRowQnaLayoutBinding(constraintLayout, barrier2, stateListAnimatorButton, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ReplyRowQnaLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ReplyRowQnaLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.reply_row_qna_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
