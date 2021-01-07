package com.spotify.music.features.home.experimental;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.loggers.ImpressionLogger;

public class e extends tk9 {
    public e(ImpressionLogger impressionLogger, l81 l81, rk9 rk9) {
        super(impressionLogger, l81, rk9);
    }

    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c, androidx.recyclerview.widget.RecyclerView.l
    public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        int X = recyclerView.X(view);
        if (X > -1) {
            Boolean bool = (Boolean) view.getTag(this.a);
            if (bool == null || bool.booleanValue() || yVar.b()) {
                n(X, view, recyclerView.a0(view));
                view.setTag(this.a, Boolean.valueOf(this.b));
            }
        }
    }
}
