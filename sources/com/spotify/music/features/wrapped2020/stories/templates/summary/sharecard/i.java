package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.widget.Button;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.mobile.android.share.menu.preview.view.ViewPagerDotsIndicator;
import kotlin.jvm.internal.h;

final class i {
    private final ViewPager2 a;
    private final ViewPagerDotsIndicator b;
    private final Button c;
    private final Button d;
    private final InterceptTouchLayout e;

    public i(ViewPager2 viewPager2, ViewPagerDotsIndicator viewPagerDotsIndicator, Button button, Button button2, InterceptTouchLayout interceptTouchLayout) {
        h.e(viewPager2, "viewPager");
        h.e(viewPagerDotsIndicator, "dots");
        h.e(button, "shareButton");
        h.e(button2, "replayButton");
        h.e(interceptTouchLayout, "interactionLayout");
        this.a = viewPager2;
        this.b = viewPagerDotsIndicator;
        this.c = button;
        this.d = button2;
        this.e = interceptTouchLayout;
    }

    public final ViewPagerDotsIndicator a() {
        return this.b;
    }

    public final InterceptTouchLayout b() {
        return this.e;
    }

    public final Button c() {
        return this.d;
    }

    public final Button d() {
        return this.c;
    }

    public final ViewPager2 e() {
        return this.a;
    }
}
