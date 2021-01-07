package com.spotify.music.features.queue.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class AddRemoveQueueView extends LinearLayout {
    private final TextView a;
    private final TextView b;

    public AddRemoveQueueView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setAddButtonVisibility(boolean z) {
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setOnAddToQueueListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setOnRemoveFromQueueListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public void setRemoveButtonVisibility(boolean z) {
        this.a.setVisibility(z ? 0 : 8);
    }

    public AddRemoveQueueView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0707R.layout.queue_add_remove_view, (ViewGroup) this, true);
        this.a = (TextView) findViewById(C0707R.id.remove_from_queue);
        this.b = (TextView) findViewById(C0707R.id.add_to_queue);
    }
}
