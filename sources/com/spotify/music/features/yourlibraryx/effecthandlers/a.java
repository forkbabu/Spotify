package com.spotify.music.features.yourlibraryx.effecthandlers;

import android.app.Activity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.yourlibraryx.contextmenu.ContextItemType;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public final class a {
    private final Activity a;
    private final c b;
    private final b4<com.spotify.music.features.yourlibraryx.contextmenu.a> c;

    public a(Activity activity, c cVar, b4<com.spotify.music.features.yourlibraryx.contextmenu.a> b4Var) {
        h.e(activity, "activity");
        h.e(cVar, "viewUri");
        h.e(b4Var, "listener");
        this.a = activity;
        this.b = cVar;
        this.c = b4Var;
    }

    public final void a(String str, String str2, YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase entityCase) {
        ContextItemType contextItemType;
        h.e(str, "uri");
        h.e(str2, "title");
        h.e(entityCase, "entityCase");
        Activity activity = this.a;
        b4<com.spotify.music.features.yourlibraryx.contextmenu.a> b4Var = this.c;
        int ordinal = entityCase.ordinal();
        if (ordinal == 0) {
            contextItemType = ContextItemType.a;
        } else if (ordinal == 1) {
            contextItemType = ContextItemType.b;
        } else if (ordinal == 2) {
            contextItemType = ContextItemType.c;
        } else if (ordinal != 3) {
            contextItemType = ContextItemType.n;
        } else {
            contextItemType = ContextItemType.f;
        }
        ContextMenuFragment.b5(activity, b4Var, new com.spotify.music.features.yourlibraryx.contextmenu.a(str, str2, contextItemType), this.b);
    }
}
