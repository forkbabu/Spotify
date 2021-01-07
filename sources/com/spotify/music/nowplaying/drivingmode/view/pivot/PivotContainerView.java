package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.pivot.p;
import java.util.List;

public class PivotContainerView extends FrameLayout implements p, k {
    private PivotListView a;
    private View b;
    private View c;

    public PivotContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        this.b.setVisibility(4);
        this.c.setVisibility(0);
        this.a.setVisibility(4);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void b(List<l> list, int i) {
        this.a.b(list, i);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void c(boolean z) {
        this.a.Z0(z);
    }

    public void d() {
        this.b.setVisibility(0);
        this.c.setVisibility(4);
        this.a.setVisibility(4);
    }

    public void e() {
        this.b.setVisibility(4);
        this.c.setVisibility(4);
        this.a.setVisibility(0);
    }

    public PivotListView getPivotListView() {
        return this.a;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.p
    public void setListener(p.a aVar) {
        this.a.setListener(aVar);
    }

    public PivotContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FrameLayout.inflate(getContext(), C0707R.layout.driving_pivot_container_view, this);
        this.b = findViewById(C0707R.id.pivot_offline_view);
        this.c = findViewById(C0707R.id.pivot_loading_view);
        this.a = (PivotListView) findViewById(C0707R.id.pivot_list_view);
    }
}
