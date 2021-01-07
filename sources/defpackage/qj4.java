package defpackage;

import com.spotify.encore.consumer.components.api.trackrowcharts.TrackRowCharts;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.playlist.models.l;
import defpackage.wj4;
import kotlin.f;

/* renamed from: qj4  reason: default package */
public final /* synthetic */ class qj4 implements nmf {
    public final /* synthetic */ wj4 a;
    public final /* synthetic */ wj4.b b;
    public final /* synthetic */ l c;
    public final /* synthetic */ ContextMenuItem f;
    public final /* synthetic */ int n;

    public /* synthetic */ qj4(wj4 wj4, wj4.b bVar, l lVar, ContextMenuItem contextMenuItem, int i) {
        this.a = wj4;
        this.b = bVar;
        this.c = lVar;
        this.f = contextMenuItem;
        this.n = i;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.X(this.b, this.c, this.f, this.n, (TrackRowCharts.Events) obj);
        return f.a;
    }
}
