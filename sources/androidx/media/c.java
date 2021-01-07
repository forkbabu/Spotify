package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;

class c extends b.j<MediaBrowserCompat.MediaItem> {
    final /* synthetic */ p f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(b bVar, Object obj, p pVar) {
        super(obj);
        this.f = pVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.media.b.j
    public void e(MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        if ((b() & 2) != 0) {
            this.f.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem2);
        this.f.b(0, bundle);
    }
}
