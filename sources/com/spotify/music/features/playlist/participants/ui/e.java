package com.spotify.music.features.playlist.participants.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.music.features.playlist.participants.ui.d;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final ToolbarManager a;
    private final Activity b;

    static final class a implements View.OnClickListener {
        final /* synthetic */ d.b a;

        a(d.b bVar) {
            this.a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.d();
        }
    }

    public e(Activity activity, ViewGroup viewGroup, d.b bVar) {
        h.e(activity, "activity");
        h.e(viewGroup, "container");
        h.e(bVar, "listener");
        this.b = activity;
        Context context = viewGroup.getContext();
        c c = l70.c(context, viewGroup);
        com.spotify.android.glue.components.toolbar.e eVar = (com.spotify.android.glue.components.toolbar.e) c;
        com.spotify.android.paste.app.d.d(eVar.getView(), context);
        viewGroup.addView(eVar.getView(), 0);
        ToolbarManager toolbarManager = new ToolbarManager(activity, c, new a(bVar));
        toolbarManager.b(false);
        toolbarManager.h(true);
        toolbarManager.g(true);
        this.a = toolbarManager;
    }

    public void a(String str) {
        h.e(str, "title");
        this.a.setTitle(str);
    }
}
