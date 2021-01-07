package com.spotify.music.features.creatorartist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;

public class ArtistGalleryView extends FrameLayout {
    private ViewPager a = ((ViewPager) findViewById(C0707R.id.pager));

    public ArtistGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0707R.layout.mobile_artist_header, this);
        PageIndicator pageIndicator = (PageIndicator) findViewById(C0707R.id.page_indicator);
    }

    public ViewPager getPager() {
        return this.a;
    }

    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.a.c(iVar);
    }
}
