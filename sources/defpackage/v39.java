package defpackage;

import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import kotlin.f;

/* renamed from: v39  reason: default package */
public final /* synthetic */ class v39 implements nmf {
    public final /* synthetic */ y59 a;
    public final /* synthetic */ MusicItem b;
    public final /* synthetic */ int c;

    public /* synthetic */ v39(y59 y59, MusicItem musicItem, int i) {
        this.a = y59;
        this.b = musicItem;
        this.c = i;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.h(this.b, this.c, (TrackRow.Events) obj);
        return f.a;
    }
}
