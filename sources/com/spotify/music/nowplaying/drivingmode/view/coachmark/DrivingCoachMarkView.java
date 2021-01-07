package com.spotify.music.nowplaying.drivingmode.view.coachmark;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.j0;
import com.spotify.music.nowplaying.drivingmode.view.coachmark.b;

public class DrivingCoachMarkView extends FrameLayout implements b {
    private b.a a;

    public DrivingCoachMarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(getContext(), C0707R.layout.driving_coach_mark_view, this);
        setOnClickListener(new a(this));
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.coachmark.b
    public void a() {
        setVisibility(0);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.coachmark.b
    public void b() {
        setVisibility(8);
    }

    public /* synthetic */ void c(View view) {
        ((j0) this.a).a();
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.coachmark.b
    public void setListener(b.a aVar) {
        this.a = aVar;
    }

    public DrivingCoachMarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), C0707R.layout.driving_coach_mark_view, this);
        setOnClickListener(new a(this));
    }
}
