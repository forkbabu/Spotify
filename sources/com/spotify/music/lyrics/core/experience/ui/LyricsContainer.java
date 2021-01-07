package com.spotify.music.lyrics.core.experience.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.contract.LyricsContract$SelectionStyle;
import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import com.spotify.music.lyrics.core.experience.model.SyncMode;
import com.spotify.music.lyrics.core.experience.model.c;
import defpackage.m3;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class LyricsContainer extends NestedScrollView implements NestedScrollView.b, b {
    private com.spotify.music.lyrics.core.experience.contract.a L;
    private final LyricsHeaderView M;
    private final LyricsFooterView N;
    private final LyricsView O;
    private View.OnLayoutChangeListener P;

    static final class a implements View.OnLayoutChangeListener {
        final /* synthetic */ LyricsContainer a;

        a(LyricsContainer lyricsContainer) {
            this.a = lyricsContainer;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            if (i9 != i8 - i6) {
                int paddingLeft = this.a.getPaddingLeft();
                LyricsContainer.S(this.a).i((i3 - i) - (this.a.getPaddingRight() + paddingLeft), i9);
                LyricsContainer lyricsContainer = this.a;
                LyricsContainer.R(lyricsContainer, lyricsContainer.getScrollY());
            }
        }
    }

    public LyricsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void R(LyricsContainer lyricsContainer, int i) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = lyricsContainer.L;
        if (aVar != null) {
            aVar.g(i);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    public static final /* synthetic */ com.spotify.music.lyrics.core.experience.contract.a S(LyricsContainer lyricsContainer) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = lyricsContainer.L;
        if (aVar != null) {
            return aVar;
        }
        h.k("presenter");
        throw null;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void a(int i, int i2) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.d(i, i2);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void b(int i) {
        scrollTo(0, i);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void c(int i) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.c(i);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int d(int i) {
        int max = Math.max(0, i - this.M.getVisibleHeight());
        Layout layout = this.O.getLayout();
        if (layout != null) {
            return layout.getLineForVertical(max);
        }
        return 0;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void e(c cVar) {
        h.e(cVar, "model");
        LyricsHeaderView lyricsHeaderView = this.M;
        lyricsHeaderView.getClass();
        h.e(cVar, "model");
        lyricsHeaderView.setVisibility((!cVar.f() || cVar.d().getSyncMode() != SyncMode.a) ? 8 : 0);
        lyricsHeaderView.setHeight(((((int) lyricsHeaderView.getPaint().measureText(lyricsHeaderView.getText().toString())) / cVar.g().c().intValue()) + 1) * cVar.c().a());
        this.O.j(cVar);
        this.N.j(cVar);
    }

    @Override // androidx.core.widget.NestedScrollView.b
    public void f(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.g(i2);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void g(Lyrics lyrics, boolean z) {
        h.e(lyrics, "lyrics");
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.e(lyrics, z);
            setOnScrollChangeListener(this);
            return;
        }
        h.k("presenter");
        throw null;
    }

    public int getCountHightlightedCharacters() {
        return this.O.getCharacterCount();
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int getCurrScrollY() {
        return getScrollY();
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void h(HashMap<Integer, Pair<Integer, Integer>> hashMap, io.reactivex.subjects.a<Integer> aVar) {
        h.e(hashMap, "charCountForLineMap");
        h.e(aVar, "lineSelectedSubject");
        this.O.k(hashMap, aVar);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void i(LyricsContract$SelectionStyle lyricsContract$SelectionStyle, int i, int i2) {
        h.e(lyricsContract$SelectionStyle, "style");
        this.O.l(lyricsContract$SelectionStyle, i, i2);
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int j(boolean z) {
        return nud.g((float) (z ? 40 : 32), getResources());
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void k(int i) {
        rcb rcb = this.O.c;
        if (rcb != null) {
            rcb.b(i);
        } else {
            h.k("lyricsViewHighlightHelper");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int l(int i) {
        LyricsView lyricsView = this.O;
        Layout layout = lyricsView.getLayout();
        int i2 = 0;
        int lineEnd = layout != null ? layout.getLineEnd(i) : 0;
        Layout layout2 = lyricsView.getLayout();
        if (layout2 != null) {
            i2 = layout2.getLineStart(i);
        }
        return lineEnd - i2;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void m(int i) {
        if (i < this.O.getLineCount()) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            LyricsHeaderView lyricsHeaderView = this.M;
            lyricsHeaderView.getClass();
            h.e(rect, "bounds");
            rect.top = 0;
            rect.bottom = lyricsHeaderView.getHeight();
            LyricsView lyricsView = this.O;
            lyricsView.getClass();
            h.e(rect2, "bounds");
            Layout layout = lyricsView.getLayout();
            if (layout != null) {
                layout.getLineBounds(i, rect2);
            }
            O(0, ((rect.bottom - rect.top) + rect2.bottom) - (getHeight() / 2));
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void n(com.spotify.music.lyrics.core.experience.contract.a aVar) {
        h.e(aVar, "containerPresenter");
        this.L = aVar;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int o(int i) {
        int max = Math.max(0, i - this.M.getVisibleHeight());
        LyricsView lyricsView = this.O;
        int visibleHeight = lyricsView.getVisibleHeight() + max;
        Layout layout = lyricsView.getLayout();
        if (layout != null) {
            return layout.getLineForVertical(visibleHeight);
        }
        return 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.b();
            a aVar2 = new a(this);
            this.P = aVar2;
            addOnLayoutChangeListener(aVar2);
            return;
        }
        h.k("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.a();
            removeOnLayoutChangeListener(this.P);
            super.onDetachedFromWindow();
            return;
        }
        h.k("presenter");
        throw null;
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public int p(String str) {
        h.e(str, "text");
        LyricsView lyricsView = this.O;
        lyricsView.getClass();
        h.e(str, "text");
        m3.a e = androidx.core.widget.c.e(lyricsView);
        h.d(e, "TextViewCompat.getTextMetricsParams(this)");
        androidx.core.widget.c.m(lyricsView, m3.a(str, e));
        return lyricsView.getLineCount();
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void q() {
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength((int) getResources().getDimension(C0707R.dimen.fading_edge_length));
    }

    @Override // com.spotify.music.lyrics.core.experience.contract.b
    public void setStartY(int i) {
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.L;
        if (aVar != null) {
            aVar.setStartY(i);
        } else {
            h.k("presenter");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LyricsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(context).inflate(C0707R.layout.lyrics_custom_view, this);
        View findViewById = findViewById(C0707R.id.lyrics_header);
        h.d(findViewById, "findViewById(R.id.lyrics_header)");
        this.M = (LyricsHeaderView) findViewById;
        View findViewById2 = findViewById(C0707R.id.lyrics_body);
        h.d(findViewById2, "findViewById(R.id.lyrics_body)");
        this.O = (LyricsView) findViewById2;
        View findViewById3 = findViewById(C0707R.id.lyrics_footer);
        h.d(findViewById3, "findViewById(R.id.lyrics_footer)");
        this.N = (LyricsFooterView) findViewById3;
    }

    public LyricsView getTextView() {
        return this.O.getTextView();
    }
}
