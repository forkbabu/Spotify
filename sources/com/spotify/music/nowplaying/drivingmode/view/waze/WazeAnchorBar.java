package com.spotify.music.nowplaying.drivingmode.view.waze;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.waze.model.WazeBannerModel;

public class WazeAnchorBar extends AnchorBar implements a {
    private v82 y = this.y;

    public WazeAnchorBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        v82 v82 = new v82(this, "Waze Banner", 0);
        this.y = v82;
        e(v82);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.waze.a
    public void a() {
        setVisibility(0);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.waze.a
    public void b(WazeBannerModel wazeBannerModel) {
        this.y.e(wazeBannerModel);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.waze.a
    public void c() {
        setVisibility(8);
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.waze.a
    public void setPresenter(w82 w82) {
        this.y.h(w82);
    }

    public WazeAnchorBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v82 v82 = new v82(this, "Waze Banner", 0);
        this.y = v82;
        e(v82);
    }
}
