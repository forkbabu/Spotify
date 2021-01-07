package com.spotify.music.libs.fullscreen.story.promo.encore;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.mobile.android.video.VideoSurfaceView;
import kotlin.jvm.internal.h;

public final class StateListAnimatorVideoSurfaceView extends VideoSurfaceView implements zud {
    private final yud C = new yud(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateListAnimatorVideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.C.a();
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.C.b();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.C.c();
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.C.d(lVar);
    }
}
