package com.spotify.music.features.followfeed.mobius.effecthandlers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.content.a;
import com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment;
import com.spotify.music.navigation.n;

final class x implements ViewArtistsContextMenuDialogFragment.b {
    final /* synthetic */ y a;

    x(y yVar) {
        this.a = yVar;
    }

    @Override // com.spotify.music.libs.viewartistscontextmenu.ui.ViewArtistsContextMenuDialogFragment.b
    public final void a(String str, String str2) {
        n.a a2 = n.a(str);
        a2.h(str2);
        n a3 = a2.a();
        Context context = this.a.a;
        Intent b = this.a.c.b(a3);
        int i = a.b;
        int i2 = Build.VERSION.SDK_INT;
        context.startActivity(b, null);
    }
}
