package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import java.util.List;

class d extends b.j<List<MediaBrowserCompat.MediaItem>> {
    final /* synthetic */ p f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    d(b bVar, Object obj, p pVar) {
        super(obj);
        this.f = pVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.media.b.j
    public void e(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if ((b() & 4) != 0 || list2 == null) {
            this.f.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list2.toArray(new MediaBrowserCompat.MediaItem[0]));
        this.f.b(0, bundle);
    }
}
