package com.spotify.android.glue.components.trackcloud;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

public class e {
    public c a(Context context, ViewGroup viewGroup) {
        d dVar = new d(context, viewGroup);
        dVar.getView().setTag(C0707R.id.glue_viewholder_tag, dVar);
        return dVar;
    }
}
