package com.spotify.encore.consumer.components.viewbindings.headers;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.encore.consumer.components.viewbindings.headers.databinding.HeaderMotionLayoutBinding;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class HeaderMotionBindingsExtensions$init$1 implements AppBarLayout.c {
    final /* synthetic */ HeaderMotionLayoutBinding $this_init;

    HeaderMotionBindingsExtensions$init$1(HeaderMotionLayoutBinding headerMotionLayoutBinding) {
        this.$this_init = headerMotionLayoutBinding;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        MotionLayout motionLayout = this.$this_init.motionContainer;
        h.d(motionLayout, "motionContainer");
        h.d(appBarLayout, "appBar");
        motionLayout.setProgress(((float) (-i)) / ((float) appBarLayout.getTotalScrollRange()));
    }
}
