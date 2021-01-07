package com.spotify.music.features.fullscreen.story;

import android.app.Activity;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;

public class g<T> implements f<T> {
    private final Activity a;
    private final c b;

    public g(Activity activity, c cVar) {
        activity.getClass();
        this.a = activity;
        this.b = cVar;
    }

    @Override // com.spotify.music.features.fullscreen.story.f
    public void a(T t, b4<? super T> b4Var) {
        Activity activity = this.a;
        c cVar = this.b;
        int i = ContextMenuFragment.J0;
        ContextMenuFragment.f5(b4Var.p0(t), (androidx.fragment.app.c) activity, cVar);
    }
}
