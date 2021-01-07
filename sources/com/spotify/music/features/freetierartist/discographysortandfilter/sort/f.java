package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.glue.patterns.contextmenu.glue.c;
import com.spotify.android.glue.patterns.contextmenu.glue.k;
import com.spotify.android.glue.patterns.contextmenu.glue.m;
import com.spotify.android.glue.patterns.contextmenu.glue.n;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import kotlin.jvm.internal.h;

public final class f extends k {
    private ContextMenuViewModel g;
    private final Context h;
    private final m i;

    static final class a implements View.OnClickListener {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.i();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, ua0 ua0, m mVar) {
        super(context, ua0, mVar, c.a);
        h.e(context, "context");
        h.e(ua0, "contextMenuCallback");
        h.e(mVar, "glueHeader");
        this.h = context;
        this.i = mVar;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public int a() {
        ContextMenuViewModel contextMenuViewModel = this.g;
        if (contextMenuViewModel != null) {
            return contextMenuViewModel.l().size();
        }
        h.k("viewModel");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public View b(int i2, ViewGroup viewGroup) {
        ContextMenuViewModel contextMenuViewModel = this.g;
        if (contextMenuViewModel != null) {
            b bVar = contextMenuViewModel.l().get(i2);
            e55 b = e55.b(LayoutInflater.from(this.h));
            h.d(b, "SortCriteriaItemBinding.…utInflater.from(context))");
            h.d(bVar, "currentSortItemViewModel");
            if (!bVar.g()) {
                bvd c = dvd.c(b.a());
                int i3 = 0;
                c.g(b.c);
                c.a();
                TextView textView = b.c;
                h.d(textView, "row.sortCriteriaText");
                textView.setText(bVar.d());
                SpotifyIconView spotifyIconView = b.b;
                h.d(spotifyIconView, "row.checkIconView");
                if (!bVar.f()) {
                    i3 = 8;
                }
                spotifyIconView.setVisibility(i3);
                b.a().setOnClickListener(new a(bVar));
                LinearLayout a2 = b.a();
                h.d(a2, "row.root");
                return a2;
            }
            View view = new View(this.h);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, this.h.getResources().getDimensionPixelSize(C0707R.dimen.sort_fragment_divider_row_height)));
            return view;
        }
        h.k("viewModel");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public int c() {
        ContextMenuViewModel contextMenuViewModel = this.g;
        if (contextMenuViewModel != null) {
            return contextMenuViewModel.l().size();
        }
        h.k("viewModel");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k
    public void f(ContextMenuViewModel contextMenuViewModel) {
        h.e(contextMenuViewModel, "viewModel");
        this.g = contextMenuViewModel;
        this.i.f(contextMenuViewModel);
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.k, defpackage.wa0
    public n getHeader() {
        return this.i;
    }
}
