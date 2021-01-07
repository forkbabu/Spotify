package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.album.offline.model.Album;
import com.spotify.music.features.album.offline.model.OfflineState;
import com.spotify.music.libs.collection.util.AlbumCollectionState;
import com.spotify.music.libs.collection.util.q;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.playlist.models.offline.a;
import io.reactivex.disposables.b;

/* renamed from: cy3  reason: default package */
public class cy3 {
    private final String a;
    private final t8a b;
    private final m8a c;
    private final ly3 d;
    private final OffliningLogger e;
    private boolean f;
    private b g;

    public cy3(String str, t8a t8a, m8a m8a, ly3 ly3, OffliningLogger offliningLogger) {
        this.a = str;
        this.b = t8a;
        this.c = m8a;
        this.d = ly3;
        this.e = offliningLogger;
    }

    public void a() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.f) {
            this.f = false;
            this.b.f(this.a, false);
        }
    }

    public void b() {
        this.e.a(this.a, OffliningLogger.SourceElement.HEADER_TOGGLE, true);
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
        }
        this.g = this.d.b(l0.z(this.a).i()).P0(bx3.a).subscribe(new ax3(this), new zw3(this));
    }

    public void c(OfflineState offlineState) {
        Album album = offlineState.getAlbum();
        if (new q(album.getCollectionUri(), AlbumCollectionState.d(album.getNumTracksInCollection(), album.isCompleteInCollection()), album.getOfflineState(), album.getInferredOfflineState()).b()) {
            this.f = true;
            t8a t8a = this.b;
            String str = this.a;
            t8a.a(str, str, false);
            return;
        }
        a offlineState2 = offlineState.getAlbum().getOfflineState();
        offlineState2.getClass();
        if (offlineState2 instanceof a.f) {
            this.c.a(offlineState.getAlbum().getCollectionUri());
            b bVar = this.g;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    public /* synthetic */ void d(Throwable th) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
        }
        Logger.e(th, "Failed to fetch album offline state when marking for offline", new Object[0]);
    }

    public void e(OfflineState offlineState) {
        a offlineState2 = offlineState.getAlbum().getOfflineState();
        offlineState2.getClass();
        if (offlineState2 instanceof a.C0377a) {
            this.c.b(offlineState.getAlbum().getCollectionUri());
            b bVar = this.g;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    public /* synthetic */ void f(Throwable th) {
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
        }
        Logger.e(th, "Failed to fetch album offline state when removing offline", new Object[0]);
    }

    public void g() {
        this.e.a(this.a, OffliningLogger.SourceElement.HEADER_TOGGLE, false);
        b bVar = this.g;
        if (bVar != null) {
            bVar.dispose();
        }
        this.g = this.d.b(l0.z(this.a).i()).subscribe(new yw3(this), new cx3(this));
    }
}
