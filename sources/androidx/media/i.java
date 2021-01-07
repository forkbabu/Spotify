package androidx.media;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.b;
import java.util.ArrayList;
import java.util.List;

class i extends b.j<List<MediaBrowserCompat.MediaItem>> {
    final /* synthetic */ b.k f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ b.g h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(b.g gVar, Object obj, b.k kVar, Bundle bundle) {
        super(obj);
        this.h = gVar;
        this.f = kVar;
        this.g = bundle;
    }

    @Override // androidx.media.b.j
    public void a() {
        this.f.a.detach();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: package-private */
    @Override // androidx.media.b.j
    public void e(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 == null) {
            this.f.a(null);
            return;
        }
        if ((b() & 1) != 0) {
            list2 = b.this.b(list2, this.g);
        }
        ArrayList arrayList = new ArrayList();
        for (MediaBrowserCompat.MediaItem mediaItem : list2) {
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        this.f.a(arrayList);
    }
}
