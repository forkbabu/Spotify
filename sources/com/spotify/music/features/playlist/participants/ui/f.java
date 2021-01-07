package com.spotify.music.features.playlist.participants.ui;

import android.app.Activity;
import android.view.ViewGroup;
import com.spotify.music.features.playlist.participants.ui.d;

public final class f implements d.a {
    private final wlf<Activity> a;

    public f(wlf<Activity> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.features.playlist.participants.ui.d.a
    public d a(ViewGroup viewGroup, d.b bVar) {
        Activity activity = this.a.get();
        b(activity, 1);
        b(viewGroup, 2);
        b(bVar, 3);
        return new e(activity, viewGroup, bVar);
    }
}
