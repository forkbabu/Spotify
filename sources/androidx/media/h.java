package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;

class h extends b.j<MediaBrowserCompat.MediaItem> {
    final /* synthetic */ b.k f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(b.f fVar, Object obj, b.k kVar) {
        super(obj);
        this.f = kVar;
    }

    @Override // androidx.media.b.j
    public void a() {
        this.f.a.detach();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.media.b.j
    public void e(MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        if (mediaItem2 == null) {
            this.f.a(null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        mediaItem2.writeToParcel(obtain, 0);
        this.f.a(obtain);
    }
}
