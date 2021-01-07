package com.spotify.music.features.yourlibraryx.view;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXAdapter;

final class p implements Runnable {
    final /* synthetic */ YourLibraryXAdapter.c a;
    final /* synthetic */ j b;
    final /* synthetic */ boolean c;

    static final class a implements Runnable {
        final /* synthetic */ p a;

        a(p pVar) {
            this.a = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView;
            if ((this.a.b.d().c() || !this.a.c) && (recyclerView = this.a.a.a.q) != null) {
                recyclerView.I0(0);
            }
            p pVar = this.a;
            pVar.a.a.p = pVar.b.d();
        }
    }

    p(YourLibraryXAdapter.c cVar, j jVar, boolean z) {
        this.a = cVar;
        this.b = jVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c0(new f(this.b.a(), this.b.c()), new a(this));
    }
}
