package defpackage;

import android.content.Context;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.playlist.models.l;
import kotlin.f;

/* renamed from: ci6  reason: default package */
public final /* synthetic */ class ci6 implements nmf {
    public final /* synthetic */ ki6 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l f;
    public final /* synthetic */ ContextMenuItem n;

    public /* synthetic */ ci6(ki6 ki6, Context context, int i, l lVar, ContextMenuItem contextMenuItem) {
        this.a = ki6;
        this.b = context;
        this.c = i;
        this.f = lVar;
        this.n = contextMenuItem;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.Z(this.b, this.c, this.f, this.n, (TrackRow.Events) obj);
        return f.a;
    }
}
