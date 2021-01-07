package defpackage;

import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.playlist.models.l;
import defpackage.xi6;
import kotlin.f;

/* renamed from: si6  reason: default package */
public final /* synthetic */ class si6 implements nmf {
    public final /* synthetic */ zi6 a;
    public final /* synthetic */ xi6.b b;
    public final /* synthetic */ l c;
    public final /* synthetic */ ContextMenuItem f;
    public final /* synthetic */ int n;

    public /* synthetic */ si6(zi6 zi6, xi6.b bVar, l lVar, ContextMenuItem contextMenuItem, int i) {
        this.a = zi6;
        this.b = bVar;
        this.c = lVar;
        this.f = contextMenuItem;
        this.n = i;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.Y(this.b, this.c, this.f, this.n, (TrackRow.Events) obj);
        return f.a;
    }
}
