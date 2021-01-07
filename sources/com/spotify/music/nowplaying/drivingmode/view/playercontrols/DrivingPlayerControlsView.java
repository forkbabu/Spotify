package com.spotify.music.nowplaying.drivingmode.view.playercontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.spotify.music.C0707R;

public class DrivingPlayerControlsView extends RelativeLayout implements a {
    private View a;
    private View b;
    private View c;

    public DrivingPlayerControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        View inflate = RelativeLayout.inflate(getContext(), C0707R.layout.driving_player_controls, this);
        this.a = inflate.findViewById(C0707R.id.player_controls_music);
        this.b = inflate.findViewById(C0707R.id.player_controls_podcast);
        this.c = inflate.findViewById(C0707R.id.player_controls_ads);
    }

    public void b() {
        this.a.setVisibility(4);
        this.b.setVisibility(4);
        this.c.setVisibility(0);
    }

    public void c() {
        this.a.setVisibility(0);
        this.b.setVisibility(4);
        this.c.setVisibility(4);
    }

    public void d() {
        this.a.setVisibility(4);
        this.b.setVisibility(0);
        this.c.setVisibility(4);
    }

    public DrivingPlayerControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
