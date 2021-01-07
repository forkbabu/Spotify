package com.spotify.music.lyrics.core.experience.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.spotify.music.lyrics.core.experience.contract.LyricsContract$SelectionStyle;
import com.spotify.music.lyrics.core.experience.model.c;
import io.reactivex.subjects.a;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class LyricsView extends AppCompatTextView {
    private Spannable a;
    private c b;
    public rcb c;
    private scb f;

    public LyricsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void getLyricsViewHighlightHelper$annotations() {
    }

    public final int getCharacterCount() {
        rcb rcb = this.c;
        if (rcb != null) {
            return rcb.a();
        }
        h.k("lyricsViewHighlightHelper");
        throw null;
    }

    public final rcb getLyricsViewHighlightHelper() {
        rcb rcb = this.c;
        if (rcb != null) {
            return rcb;
        }
        h.k("lyricsViewHighlightHelper");
        throw null;
    }

    public final Spannable getSpannable() {
        return this.a;
    }

    public final LyricsView getTextView() {
        return this;
    }

    public final int getVisibleHeight() {
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        return rect.bottom - rect.top;
    }

    public final void j(c cVar) {
        h.e(cVar, "model");
        this.b = cVar;
        this.a = new SpannableString(cVar.e());
        setTextColor(cVar.b());
        Spannable spannable = this.a;
        if (spannable != null) {
            ndb c2 = cVar.c();
            spannable.removeSpan(c2);
            spannable.setSpan(c2, 0, spannable.length(), 33);
        }
        androidx.core.widget.c.k(this, cVar.c().a());
        setLineSpacing(0.0f, 1.0f);
        setText(this.a, TextView.BufferType.SPANNABLE);
        c cVar2 = this.b;
        if (cVar2 != null) {
            this.c = new rcb(this, cVar2);
        } else {
            h.k("lyricsUIModel");
            throw null;
        }
    }

    public final void k(HashMap<Integer, Pair<Integer, Integer>> hashMap, a<Integer> aVar) {
        h.e(hashMap, "charCountForLineMap");
        h.e(aVar, "lineSelectedSubject");
        scb scb = new scb(this);
        this.f = scb;
        scb.b(hashMap, aVar);
    }

    public final void l(LyricsContract$SelectionStyle lyricsContract$SelectionStyle, int i, int i2) {
        h.e(lyricsContract$SelectionStyle, "style");
        scb scb = this.f;
        if (scb != null) {
            scb.c(lyricsContract$SelectionStyle, i, i2);
        }
    }

    public final void setLyricsViewHighlightHelper(rcb rcb) {
        h.e(rcb, "<set-?>");
        this.c = rcb;
    }

    public final void setSpannable(Spannable spannable) {
        this.a = spannable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
