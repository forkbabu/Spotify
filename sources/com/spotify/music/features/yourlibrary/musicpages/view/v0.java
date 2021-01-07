package com.spotify.music.features.yourlibrary.musicpages.view;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

public final class v0 {
    private final wlf<e1> a;

    public v0(wlf<e1> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public t0 b(d39<MusicItem.Type, MusicItem> d39, RecyclerView recyclerView) {
        a(d39, 1);
        a(recyclerView, 2);
        e1 e1Var = this.a.get();
        a(e1Var, 3);
        return new t0(d39, recyclerView, e1Var);
    }
}
