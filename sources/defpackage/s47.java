package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.podcast.entity.loadedpage.data.a;
import com.spotify.pageloader.z0;
import kotlin.jvm.internal.h;

/* renamed from: s47  reason: default package */
public final class s47 implements z0 {
    private final u47 a;
    private final y47 b;
    private final a c;

    public s47(u47 u47, y47 y47, a aVar) {
        h.e(u47, "presenter");
        h.e(y47, "viewBinder");
        h.e(aVar, "baseDataModel");
        this.a = u47;
        this.b = y47;
        this.c = aVar;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        this.a.d(bundle);
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        return this.a.a();
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
        this.b.j(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.i(this.b, this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.stop();
    }
}
