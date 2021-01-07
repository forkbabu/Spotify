package com.spotify.music.podcast.ui.topic;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.ui.topic.o;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class l implements o {
    private String a = "";
    private final TextView b;

    static final class a implements View.OnClickListener {
        final /* synthetic */ l a;
        final /* synthetic */ nmf b;

        a(l lVar, nmf nmf) {
            this.a = lVar;
            this.b = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.invoke(new o.a.C0331a(this.a.a));
        }
    }

    public l(ViewGroup viewGroup) {
        h.e(viewGroup, "parent");
        View G = je.G(viewGroup, C0707R.layout.podcast_topic_chip, viewGroup, false);
        if (G != null) {
            this.b = (TextView) G;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View b() {
        return this.b;
    }

    public void c(nmf<? super o.a, f> nmf) {
        h.e(nmf, "event");
        if (this.a.length() > 0) {
            this.b.setOnClickListener(new a(this, nmf));
        }
    }

    public void d(o.c cVar) {
        h.e(cVar, "model");
        this.a = cVar.b();
        this.b.setText(cVar.a());
    }
}
