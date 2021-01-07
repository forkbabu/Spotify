package com.spotify.music.libs.podcast.download;

import android.content.DialogInterface;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.podcast.download.a0;
import java.util.List;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ a0.b a;
    public final /* synthetic */ List b;

    public /* synthetic */ d(a0.b bVar, List list) {
        this.a = bVar;
        this.b = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(ImmutableList.copyOf(Collections2.transform((Iterable) this.b, (Function) a.a)));
    }
}
