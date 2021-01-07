package com.spotify.music.features.podcast.episode.transcript.ui.page;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;
import com.spotify.music.yourlibrary.quickscroll.x;
import kotlin.jvm.internal.h;

public final class i implements g {
    private View a;
    private RecyclerView b;
    private a c;
    private QuickScrollView d;
    private int e;
    private LinearLayoutManager f;
    private nb7 g;
    private mb7 h;
    private final jb7 i;

    public i(jb7 jb7) {
        h.e(jb7, "logger");
        this.i = jb7;
    }

    public static final int e(i iVar) {
        if (iVar.f == null) {
            RecyclerView recyclerView = iVar.b;
            if (recyclerView != null) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    iVar.f = (LinearLayoutManager) layoutManager;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
            } else {
                h.k("transcriptRecyclerView");
                throw null;
            }
        }
        LinearLayoutManager linearLayoutManager = iVar.f;
        if (linearLayoutManager != null) {
            return linearLayoutManager.Y1();
        }
        return 0;
    }

    public static final /* synthetic */ QuickScrollView f(i iVar) {
        QuickScrollView quickScrollView = iVar.d;
        if (quickScrollView != null) {
            return quickScrollView;
        }
        h.k("quickScrollerView");
        throw null;
    }

    @Override // com.spotify.music.features.podcast.episode.transcript.ui.page.g
    public void a(k kVar) {
        h.e(kVar, "viewModel");
        nb7 nb7 = this.g;
        if (nb7 != null) {
            nb7.b(kVar);
            mb7 mb7 = this.h;
            if (mb7 != null) {
                mb7.a(kVar);
                a aVar = this.c;
                if (aVar != null) {
                    aVar.b0(kVar.a());
                    this.i.a();
                    return;
                }
                h.k("transcriptAdapter");
                throw null;
            }
            h.k("ignoredItemProvider");
            throw null;
        }
        h.k("labelProvider");
        throw null;
    }

    @Override // com.spotify.music.features.podcast.episode.transcript.ui.page.g
    public void b(View view) {
        h.e(view, "rootView");
        this.a = view;
        this.c = new a();
        this.g = new nb7();
        this.h = new mb7();
        View view2 = this.a;
        if (view2 != null) {
            View findViewById = view2.findViewById(C0707R.id.transcript_recycler_view);
            h.d(findViewById, "findViewById(R.id.transcript_recycler_view)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.b = recyclerView;
            a aVar = this.c;
            if (aVar != null) {
                recyclerView.setAdapter(aVar);
                View view3 = this.a;
                recyclerView.setLayoutManager(new LinearLayoutManager(view3 != null ? view3.getContext() : null));
                recyclerView.setHasFixedSize(false);
                recyclerView.setFocusable(false);
                View findViewById2 = view.findViewById(C0707R.id.transcript_quickscroll_view);
                h.d(findViewById2, "rootView.findViewById(R.…nscript_quickscroll_view)");
                QuickScrollView quickScrollView = (QuickScrollView) findViewById2;
                this.d = quickScrollView;
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 != null) {
                    nb7 nb7 = this.g;
                    if (nb7 != null) {
                        mb7 mb7 = this.h;
                        if (mb7 != null) {
                            quickScrollView.a(x.a(new vpd(recyclerView2, nb7, mb7), null));
                            RecyclerView recyclerView3 = this.b;
                            if (recyclerView3 != null) {
                                recyclerView3.n(new h(this));
                            } else {
                                h.k("transcriptRecyclerView");
                                throw null;
                            }
                        } else {
                            h.k("ignoredItemProvider");
                            throw null;
                        }
                    } else {
                        h.k("labelProvider");
                        throw null;
                    }
                } else {
                    h.k("transcriptRecyclerView");
                    throw null;
                }
            } else {
                h.k("transcriptAdapter");
                throw null;
            }
        }
    }

    @Override // com.spotify.music.features.podcast.episode.transcript.ui.page.g
    public View c() {
        return this.a;
    }
}
