package com.spotify.music.features.nowplayingbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.i;
import com.spotify.music.C0707R;

public class TrackInfoView extends LinearLayout {
    private final TextView a;
    private final TextView b;

    public TrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(String str, String str2) {
        if (!str.contentEquals(this.a.getText())) {
            this.a.setText(str);
        }
        if (!str2.contentEquals(this.b.getText())) {
            this.b.setText(str2);
        }
        this.b.setVisibility(i.a(str2) ? 8 : 0);
    }

    public void setTrackInfoOneLine(String str) {
        if (!str.contentEquals(this.a.getText())) {
            this.a.setText(str);
        }
        this.b.setText((CharSequence) null);
        this.b.setVisibility(4);
    }

    public TrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.inflate(context, C0707R.layout.track_info_view, this);
        setOrientation(1);
        TextView textView = (TextView) findViewById(C0707R.id.track_info_view_title);
        this.a = textView;
        TextView textView2 = (TextView) findViewById(C0707R.id.track_info_view_subtitle);
        this.b = textView2;
        textView.setSelected(true);
        textView2.setSelected(true);
    }
}
