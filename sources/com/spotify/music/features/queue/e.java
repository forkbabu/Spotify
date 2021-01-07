package com.spotify.music.features.queue;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ QueueActivity a;

    public /* synthetic */ e(QueueActivity queueActivity) {
        this.a = queueActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        x i = this.a.G.i();
        i.q(C0707R.id.container, (Fragment) obj, null);
        i.j();
    }
}
