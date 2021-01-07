package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import java.util.ArrayList;
import java.util.List;

class f extends b.j<List<MediaBrowserCompat.MediaItem>> {
    final /* synthetic */ b.k f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(b.e eVar, Object obj, b.k kVar) {
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
    public void e(List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f.a(arrayList);
    }
}
