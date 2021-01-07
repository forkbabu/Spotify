package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.z0;
import com.spotify.playlist.endpoints.d;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: l06  reason: default package */
public final class l06 implements z0 {
    private final com.spotify.music.features.playlist.participants.presenter.a a;
    private final n06 b;
    private final s<d.a> c;

    /* renamed from: l06$a */
    public interface a {
    }

    public l06(com.spotify.music.features.playlist.participants.presenter.a aVar, n06 n06, s<d.a> sVar) {
        h.e(aVar, "presenter");
        h.e(n06, "viewBinder");
        h.e(sVar, "collaboratorsObservable");
        this.a = aVar;
        this.b = n06;
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        Parcelable parcelable = bundle.getParcelable("PlaylistParticipantsPageElement.STATE_KEY");
        if (parcelable != null) {
            n06 n06 = this.b;
            h.d(parcelable, "it");
            n06.b(parcelable);
        }
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PlaylistParticipantsPageElement.STATE_KEY", this.b.a());
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b.getView();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.b.e(context, layoutInflater, viewGroup, this.a);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.a(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.stop();
    }
}
