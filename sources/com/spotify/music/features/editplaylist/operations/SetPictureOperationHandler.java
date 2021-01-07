package com.spotify.music.features.editplaylist.operations;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.n;
import androidx.work.ExistingWorkPolicy;
import androidx.work.d;
import androidx.work.impl.l;
import androidx.work.k;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.t;

public class SetPictureOperationHandler {
    private final Context a;
    private final n b;

    public enum Status {
        NOTHING,
        PROGRESS,
        SUCCEEDED,
        CANCELLED,
        ERROR
    }

    public SetPictureOperationHandler(Context context, n nVar) {
        this.a = context;
        this.b = nVar;
    }

    private static String d(String str) {
        l0 z = l0.z(str);
        return z.q() == LinkType.PROFILE_PLAYLIST ? l0.A(z.i()).B() : str;
    }

    public void a(o0 o0Var) {
        l.k(this.a).a(d(o0Var.b()));
    }

    public void b(o0 o0Var, t tVar) {
        l.k(this.a).p(d(o0Var.b())).h(this.b, new j(tVar));
    }

    public void c(o0 o0Var) {
        String d = d(o0Var.b());
        Uri a2 = o0Var.a();
        d.a aVar = new d.a();
        aVar.g("KEY_PLAYLIST_URI", d);
        aVar.g("KEY_IMAGE_URI", a2.toString());
        d a3 = aVar.a();
        l.k(this.a).e(d, ExistingWorkPolicy.REPLACE, (k) ((k.a) new k.a(SetPlaylistPictureWorker.class).h(a3)).b());
    }
}
