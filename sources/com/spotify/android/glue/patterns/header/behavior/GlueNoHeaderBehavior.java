package com.spotify.android.glue.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;

public class GlueNoHeaderBehavior extends HeaderBehavior<GlueNoHeaderView> {
    public GlueNoHeaderBehavior() {
    }

    public GlueNoHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
