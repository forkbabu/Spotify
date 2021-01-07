package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;
import androidx.fragment.app.o;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import defpackage.n25;
import io.reactivex.functions.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class y implements g<n25.j> {
    private final Context a;
    private final o b;
    private final com.spotify.music.navigation.o c;

    public y(Context context, o oVar, com.spotify.music.navigation.o oVar2) {
        h.e(context, "context");
        h.e(oVar, "fragmentManager");
        h.e(oVar2, "navigationIntentToIntentAdapter");
        this.a = context;
        this.b = oVar;
        this.c = oVar2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n25.j jVar) {
        n25.j jVar2 = jVar;
        h.e(jVar2, "effect");
        ViewArtistsContextMenuDialogFragment.a aVar = new ViewArtistsContextMenuDialogFragment.a();
        List<j25> a2 = jVar2.a();
        ArrayList arrayList = new ArrayList(d.e(a2, 10));
        for (T t : a2) {
            arrayList.add(new mab(t.a(), t.c(), t.b()));
        }
        aVar.e(arrayList);
        aVar.c(new x(this));
        aVar.d(this.a.getString(C0707R.string.context_menu_artists_list_title));
        aVar.a().Y4(this.b, "ViewArtistsContextMenuDialogFragment");
    }
}
