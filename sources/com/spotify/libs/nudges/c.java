package com.spotify.libs.nudges;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.libs.nudges.api.options.a;
import com.spotify.libs.nudges.api.options.b;
import com.spotify.libs.nudges.api.options.c;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class c implements pv0 {
    private final LayoutInflater a;
    private final l b;
    private final Context c;

    public c(l lVar, Context context) {
        h.e(lVar, "popupFactory");
        h.e(context, "context");
        this.b = lVar;
        this.c = context;
        this.a = LayoutInflater.from(context);
    }

    private final DefaultNudge b(a aVar, boolean z) {
        int i = z ? C0707R.style.res_2132083106_nudgeanimation_rich : C0707R.style.NudgeAnimation;
        aVar.getClass();
        return new DefaultNudge(this.b, null, aVar.a(), C0707R.dimen.nudge_bottom_margin, i);
    }

    @Override // defpackage.pv0
    public ov0 a(a aVar) {
        DefaultNudge defaultNudge;
        h.e(aVar, "options");
        if (aVar instanceof com.spotify.libs.nudges.api.options.c) {
            com.spotify.libs.nudges.api.options.c cVar = (com.spotify.libs.nudges.api.options.c) aVar;
            if (cVar.a() == null) {
                cVar.c(DefaultNudgeFactory$createSimpleNudge$1.a);
            }
            defaultNudge = b(cVar, false);
            View inflate = this.a.inflate(C0707R.layout.simple_nudge, (ViewGroup) null);
            h.d(inflate, "content");
            View findViewById = inflate.findViewById(C0707R.id.icon_simple_nudge);
            h.d(findViewById, "view.findViewById(R.id.icon_simple_nudge)");
            ((ImageView) findViewById).setVisibility(8);
            View findViewById2 = inflate.findViewById(C0707R.id.text_simple_nudge);
            h.d(findViewById2, "view.findViewById(R.id.text_simple_nudge)");
            ((TextView) findViewById2).setVisibility(8);
            View findViewById3 = inflate.findViewById(C0707R.id.button_simple_nudge);
            h.d(findViewById3, "view.findViewById(R.id.button_simple_nudge)");
            Button button = (Button) findViewById3;
            if (cVar.e() == null) {
                button.setVisibility(8);
            } else {
                c.a e = cVar.e();
                if (e != null) {
                    button.setText(e.c());
                    button.setTextColor(androidx.core.content.a.b(this.c, e.a()));
                    button.setOnClickListener(new a(e, this, button, defaultNudge));
                    button.setOnTouchListener(new b(this, button, defaultNudge));
                }
                button.setVisibility(0);
            }
            defaultNudge.i(inflate);
            long j = 0;
            if (cVar.e() != null) {
                j = 6000;
            }
            if (j > 10000) {
                j = 10000;
            }
            defaultNudge.h(j);
        } else if (aVar instanceof b) {
            b bVar = (b) aVar;
            defaultNudge = b(bVar, true);
            View e2 = bVar.e();
            if (e2 != null) {
                defaultNudge.i(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return defaultNudge;
    }
}
