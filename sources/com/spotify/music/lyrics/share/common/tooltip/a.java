package com.spotify.music.lyrics.share.common.tooltip;

import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.tooltip.TooltipContainer;
import kotlin.jvm.internal.h;

public final class a extends com.spotify.mobile.android.spotlets.tooltip.a {

    /* renamed from: com.spotify.music.lyrics.share.common.tooltip.a$a  reason: collision with other inner class name */
    public static final class C0308a {
        private uu1 a;
        private final TooltipContainer b;

        public C0308a(TooltipContainer tooltipContainer) {
            h.e(tooltipContainer, "mTooltipContainer");
            this.b = tooltipContainer;
        }

        public final C0308a a(uu1 uu1) {
            this.a = uu1;
            return this;
        }

        public final void b(View view) {
            h.e(view, "anchor");
            Object[] objArr = new Object[0];
            if (!(this.a != null)) {
                throw new IllegalStateException(MoreObjects.lenientFormat("Cannot show tinkerbell without a configuration", objArr));
            } else if (this.b.j()) {
                Logger.b("Ignoring. Tooltip already opened.", new Object[0]);
            } else {
                this.b.l(view, this.a);
            }
        }
    }
}
