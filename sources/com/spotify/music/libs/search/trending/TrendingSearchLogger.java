package com.spotify.music.libs.search.trending;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;

public class TrendingSearchLogger extends c {
    private final jz1 c;
    private final ifd f;
    private final com.spotify.music.libs.viewuri.c n;
    private final cqe o;
    private final l81 p;
    private final b q;

    private enum InteractionType {
        SWIPE("swipe");
        
        private final String mType;

        private InteractionType(String str) {
            this.mType = str;
        }

        public String d() {
            return this.mType;
        }
    }

    private enum UserIntent {
        SWIPE_SCROLLING_VIEW("swipe-scrolling-view");
        
        private final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }

        public String d() {
            return this.mIntent;
        }
    }

    public TrendingSearchLogger(jz1 jz1, ifd ifd, com.spotify.music.libs.viewuri.c cVar, cqe cqe, l81 l81, b bVar) {
        super(C0707R.id.hub_trending_search);
        this.p = l81;
        this.c = jz1;
        this.f = ifd;
        this.n = cVar;
        this.o = cqe;
        this.q = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.c
    public void n(int i, View view, RecyclerView.b0 b0Var) {
        this.q.getClass();
        s81 d = i61.f0(b0Var).d();
        p81 logging = d.logging();
        String string = logging.string("ui:uri");
        String string2 = logging.string("ui:group");
        this.c.a(new da1(logging.string("ui:source"), this.f.getName(), this.n.toString(), string2, (long) i, string, ImpressionLogger.ImpressionType.ITEM.toString(), ImpressionLogger.RenderType.LIST.toString(), (double) this.o.d()));
        this.p.a(d);
    }

    public void o() {
        this.c.a(new fa1(null, this.f.getName(), this.n.toString(), "mo-trending-searches-source", 0, "", InteractionType.SWIPE.d(), UserIntent.SWIPE_SCROLLING_VIEW.d(), (double) this.o.d()));
    }
}
