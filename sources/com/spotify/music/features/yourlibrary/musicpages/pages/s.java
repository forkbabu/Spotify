package com.spotify.music.features.yourlibrary.musicpages.pages;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;

public class s {
    private final LinearLayout a;

    public s(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setId(C0707R.id.music_pages_filtered_empty_container);
        nb0 b = pb0.b(context, linearLayout);
        b.A2(C0707R.string.your_library_music_pages_filtered_general_empty_subtitle);
        b.setTitle(C0707R.string.your_library_music_pages_filtered_general_empty_title);
        b.getView().setBackgroundColor(0);
        linearLayout.addView(b.getView());
        linearLayout.setVisibility(8);
    }

    public View a() {
        return this.a;
    }
}
