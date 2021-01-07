package com.spotify.music.lyrics.share.social.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.jvm.internal.h;

public final class LyricsShareSocialIconBar extends LinearLayout implements b {
    private heb a;

    static final class a implements View.OnClickListener {
        final /* synthetic */ LyricsShareSocialIconBar a;

        a(LyricsShareSocialIconBar lyricsShareSocialIconBar) {
            this.a = lyricsShareSocialIconBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            heb heb = this.a.a;
            if (heb != null) {
                h.d(view, "view");
                heb.h(view.getId());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsShareSocialIconBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        setOrientation(0);
    }

    @Override // com.spotify.music.lyrics.share.social.ui.b
    public void a(int i, Drawable drawable, String str, Integer num) {
        h.e(str, "text");
        Context context = getContext();
        h.d(context, "context");
        a aVar = new a(context, i, drawable, str);
        if (num != null) {
            aVar.setTextColor(num.intValue());
        }
        aVar.setOnClickListener(new a(this));
        addView(aVar, 0);
        aVar.j();
    }

    public void c(heb heb) {
        h.e(heb, "presenter");
        this.a = heb;
        h.e(this, "binder");
        heb.a = this;
    }

    public final void d(qeb qeb) {
        List<peb> b;
        Integer num = null;
        peb peb = (qeb == null || (b = qeb.b()) == null) ? null : b.get(qeb.a());
        heb heb = this.a;
        if (heb != null) {
            Context context = getContext();
            h.d(context, "context");
            if (peb != null) {
                num = Integer.valueOf(peb.c());
            }
            heb.f(context, num);
        }
    }

    public void setColor(int i) {
        int childCount = getChildCount();
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = getChildAt(i2);
                if (childAt instanceof a) {
                    ((a) childAt).setTextColor(i);
                }
                if (i2 != childCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsShareSocialIconBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        setOrientation(0);
    }
}
