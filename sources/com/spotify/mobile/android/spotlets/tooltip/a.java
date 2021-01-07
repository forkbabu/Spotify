package com.spotify.mobile.android.spotlets.tooltip;

import android.app.Activity;
import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;

public class a {

    /* renamed from: com.spotify.mobile.android.spotlets.tooltip.a$a  reason: collision with other inner class name */
    public static class C0193a {
        private final TooltipContainer a;
        private c b;
        private uu1 c;

        C0193a(TooltipContainer tooltipContainer) {
            this.a = tooltipContainer;
        }

        public C0193a a(c cVar) {
            this.b = cVar;
            return this;
        }

        public C0193a b(uu1 uu1) {
            this.c = uu1;
            return this;
        }

        public void c(View view) {
            MoreObjects.checkState(this.c != null, "Cannot show tinkerbell without a configuration");
            if (this.a.j()) {
                Logger.b("Ignoring. Tooltip already opened.", new Object[0]);
                return;
            }
            c cVar = this.b;
            if (cVar != null) {
                this.a.setOnScrollerListenerOn(cVar);
            }
            this.a.l(view, this.c);
        }
    }

    public C0193a a(Activity activity) {
        int i = TooltipContainer.z;
        activity.getClass();
        View findViewById = activity.findViewById(C0707R.id.tooltip_container);
        findViewById.getClass();
        return new C0193a((TooltipContainer) findViewById);
    }
}
