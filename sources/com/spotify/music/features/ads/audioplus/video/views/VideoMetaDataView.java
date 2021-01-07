package com.spotify.music.features.ads.audioplus.video.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

public class VideoMetaDataView extends ConstraintLayout {
    private final TextView a;
    private final TextView b;
    private final Button c;
    private e f;

    public VideoMetaDataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public /* synthetic */ void C(View view) {
        this.f.a();
    }

    public /* synthetic */ void D(View view) {
        this.f.a();
    }

    public /* synthetic */ void E(View view) {
        this.f.a();
    }

    public void setAdvertiser(String str) {
        if (str.isEmpty()) {
            this.a.setVisibility(4);
            return;
        }
        this.a.setVisibility(0);
        this.a.setText(str);
        this.b.setOnClickListener(new a(this));
    }

    public void setButton(String str) {
        this.c.setText(str);
        this.c.setOnClickListener(new c(this));
    }

    public void setListener(e eVar) {
        this.f = eVar;
    }

    public void setTagline(String str) {
        if (str.isEmpty()) {
            this.b.setVisibility(4);
            return;
        }
        this.b.setVisibility(0);
        this.b.setText(str);
        this.b.setOnClickListener(new b(this));
    }

    public VideoMetaDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(getContext(), C0707R.layout.video_metadata_layout, this);
        this.a = (TextView) findViewById(C0707R.id.tv_advertiser_video);
        this.b = (TextView) findViewById(C0707R.id.tv_tagline_video);
        this.c = (Button) findViewById(C0707R.id.button_ctr_video);
    }
}
