package com.spotify.music.features.home.common.viewbinder;

import android.content.Context;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.List;

public class a0 extends t {
    private final List<a> q = new ArrayList(1);

    public interface a {
        void onStop();
    }

    public a0(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.x
    public void k() {
        super.k();
        for (a aVar : this.q) {
            aVar.onStop();
        }
    }

    public void u(a aVar) {
        this.q.add(aVar);
    }
}
