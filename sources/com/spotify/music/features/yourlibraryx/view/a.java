package com.spotify.music.features.yourlibraryx.view;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibraryx.view.YourLibraryXAdapter;

/* compiled from: java-style lambda group */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        int i = this.a;
        if (i == 0) {
            if (((j) this.c).d().c() && (recyclerView = ((YourLibraryXAdapter.c) this.b).a.q) != null) {
                recyclerView.I0(0);
            }
            ((YourLibraryXAdapter.c) this.b).a.p = ((j) this.c).d();
        } else if (i == 1) {
            ((YourLibraryXAdapter.c) this.b).a.p = ((j) this.c).d();
        } else {
            throw null;
        }
    }
}
