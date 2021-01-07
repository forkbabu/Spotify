package com.spotify.music.newplaying.scroll.widgets.lyrics.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.g;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import com.spotify.music.lyrics.share.common.sharebutton.ShareButton;
import com.spotify.music.lyrics.share.common.sharebutton.a;
import com.spotify.music.newplaying.scroll.widgets.lyrics.view.b;

public class LyricsWidgetView extends LinearLayout implements b {
    public static final /* synthetic */ int t = 0;
    private b a;
    private View b;
    private View c;
    private GradientDrawable f;
    private b.a n;
    private ViewGroup o;
    private int p;
    private boolean q;
    private ShareButton r;
    public LyricsWrapper s;

    public LyricsWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private g getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (g) context;
            }
        }
        return null;
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void a(int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void b(LyricsWrapper lyricsWrapper) {
        this.s = lyricsWrapper;
        this.a.g(lyricsWrapper.getLyrics(), false);
        ((View) this.a).setVisibility(0);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        int i = this.p;
        this.p = i;
        this.a.c(i);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void c(int i, boolean z) {
        this.p = i;
        if (z) {
            this.a.c(i);
        }
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void d() {
        ((View) this.a).setVisibility(8);
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void e() {
        ((View) this.a).setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public com.spotify.music.lyrics.core.experience.contract.b getLyricsViewBinder() {
        return this.a;
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public a getShareButtonViewBinder() {
        return this.r;
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public Bundle getViewStateBundle() {
        g activity = getActivity();
        if (this.s == null || activity == null) {
            return null;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        ((View) this.a).getLocationInWindow(new int[2]);
        Bundle bundle = new Bundle();
        bundle.putInt("start_y", rect.top);
        bundle.putInt("start_height", rect.bottom - rect.top);
        bundle.putInt("end_height", point.y);
        bundle.putInt("start_width", rect.right - rect.left);
        bundle.putInt("end_width", point.x);
        bundle.putInt("player_position", this.p);
        bundle.putParcelable("lyrics_wrapper", this.s);
        bundle.putBoolean("vocal_removal_possible", this.q);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (com.spotify.music.lyrics.core.experience.contract.b) findViewById(C0707R.id.lyrics_view);
        this.b = findViewById(C0707R.id.loading_view);
        this.c = findViewById(C0707R.id.error_view);
        this.o = (ViewGroup) findViewById(C0707R.id.lyrics_card_container);
        this.f = (GradientDrawable) ((LinearLayout) findViewById(C0707R.id.container)).getBackground();
        this.r = (ShareButton) findViewById(C0707R.id.share_button);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b.a aVar = this.n;
        if (aVar != null) {
            ((qmb) aVar).a(z);
        }
    }

    @Override // android.view.View, com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void setBackgroundColor(int i) {
        this.f.setColor(i);
    }

    public void setContainerPresenter(com.spotify.music.lyrics.core.experience.contract.a aVar) {
        this.a.n(aVar);
        aVar.f(this.a);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void setFocusChangeListener(b.a aVar) {
        this.n = aVar;
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void setFullscreenClickedListener(b.AbstractC0311b bVar) {
        a aVar = new a(bVar);
        setOnClickListener(aVar);
        this.o.setOnClickListener(aVar);
    }

    @Override // com.spotify.music.newplaying.scroll.widgets.lyrics.view.b
    public void setVocalRemovalPossible(boolean z) {
        this.q = z;
    }

    public LyricsWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDescendantFocusability(393216);
    }
}
