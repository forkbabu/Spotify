package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.c;
import com.spotify.encore.foundation.R;
import com.spotify.music.freetiercommon.uicomponents.Rows;

public class f implements w {
    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.w
    public View a(Context context, ViewGroup viewGroup) {
        Rows.f d = Rows.d(context, viewGroup, 64, 8);
        c.n(d.getTitleView(), R.style.TextAppearance_Encore_BalladBold);
        return d.getView();
    }
}
