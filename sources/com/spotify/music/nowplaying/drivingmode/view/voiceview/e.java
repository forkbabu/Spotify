package com.spotify.music.nowplaying.drivingmode.view.voiceview;

import androidx.viewpager.widget.ViewPager;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.i;

/* access modifiers changed from: package-private */
public class e extends ViewPager.l {
    final /* synthetic */ DrivingVoiceView a;

    e(DrivingVoiceView drivingVoiceView) {
        this.a = drivingVoiceView;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        uvb r = this.a.o.r(i);
        this.a.setContextTitleAndSubtitle(r);
        if (this.a.b != null) {
            ((i) this.a.b).a(r.b());
        }
    }
}
