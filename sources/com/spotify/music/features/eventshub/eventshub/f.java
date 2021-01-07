package com.spotify.music.features.eventshub.eventshub;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.Concert;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.paste.graphics.drawable.b;
import java.util.List;

public class f extends ArrayAdapter<EventResult> {
    private final h a;
    private final cqe b;

    public f(Context context, List<EventResult> list, h hVar, cqe cqe) {
        super(context, 0, list);
        this.a = hVar;
        this.b = cqe;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = e90.i;
        y90 y90 = (y90) l70.p(view, y90.class);
        if (y90 == null) {
            y90 = e90.d().i(getContext(), viewGroup);
        }
        EventResult eventResult = (EventResult) getItem(i);
        Concert concert = eventResult.getPosterConcertResult().getConcert();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin);
        y90.getView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        y90.setTitle(concert.getListingTitle());
        y90.setSubtitle(eventResult.getMetadata(getContext(), this.b));
        String imageUri = concert.getImageUri();
        if (!MoreObjects.isNullOrEmpty(imageUri)) {
            y90.getImageView().setVisibility(0);
            this.a.e(y90.getImageView(), imageUri, yc0.a(getContext()), b.a());
        }
        return y90.getView();
    }
}
