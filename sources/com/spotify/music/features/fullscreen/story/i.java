package com.spotify.music.features.fullscreen.story;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.fullscreen.story.domain.d;
import com.spotify.music.libs.fullscreen.story.domain.e;

public final class i implements h {
    private final f<e> a;
    private final Activity b;

    public i(Activity activity, f<e> fVar) {
        activity.getClass();
        this.b = activity;
        this.a = fVar;
    }

    public /* synthetic */ void a(d dVar, b bVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(dVar.getUri()));
        try {
            this.b.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void b(e eVar) {
        this.a.a(eVar, this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(e eVar) {
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        int i = 0;
        for (d dVar : eVar.a()) {
            contextMenuViewModel.b(i, dVar.b(), l70.i(this.b, SpotifyIconV2.valueOf(dVar.a()))).o(new a(this, dVar));
            i++;
        }
        return cx1.b(contextMenuViewModel);
    }
}
