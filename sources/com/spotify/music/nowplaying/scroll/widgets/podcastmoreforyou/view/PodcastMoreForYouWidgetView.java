package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.j;
import kotlin.jvm.internal.h;

public final class PodcastMoreForYouWidgetView extends FrameLayout implements fqd, j {
    private i61 a;
    private RecyclerView b;

    public PodcastMoreForYouWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.j
    public void a(b91 b91) {
        h.e(b91, "hubsViewModel");
        i61 i61 = this.a;
        if (i61 != null) {
            i61.c0(b91.body());
            i61 i612 = this.a;
            if (i612 != null) {
                i612.z();
            } else {
                h.k("hubsAdapter");
                throw null;
            }
        } else {
            h.k("hubsAdapter");
            throw null;
        }
    }

    public final void b(i61 i61, m mVar) {
        h.e(i61, "hubsAdapter");
        h.e(mVar, "hubsLayoutManagerFactory");
        this.a = i61;
        View findViewById = findViewById(C0707R.id.scroll_widget_more_for_you_recyclerview);
        h.d(findViewById, "findViewById(R.id.scroll…ore_for_you_recyclerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.b = recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(i61);
            RecyclerView recyclerView2 = this.b;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(mVar.create());
                RecyclerView recyclerView3 = this.b;
                if (recyclerView3 != null) {
                    recyclerView3.setHasFixedSize(true);
                    RecyclerView recyclerView4 = this.b;
                    if (recyclerView4 != null) {
                        recyclerView4.setNestedScrollingEnabled(false);
                    } else {
                        h.k("moreForYourRecyclerView");
                        throw null;
                    }
                } else {
                    h.k("moreForYourRecyclerView");
                    throw null;
                }
            } else {
                h.k("moreForYourRecyclerView");
                throw null;
            }
        } else {
            h.k("moreForYourRecyclerView");
            throw null;
        }
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        Drawable background = getBackground();
        if (background != null) {
            ((GradientDrawable) background).setColor(i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PodcastMoreForYouWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
