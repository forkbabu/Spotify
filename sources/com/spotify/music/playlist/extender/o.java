package com.spotify.music.playlist.extender;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.extender.g0;
import com.spotify.music.playlist.extender.v;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import io.reactivex.functions.g;

public final /* synthetic */ class o implements g {
    public final /* synthetic */ g0.b a;
    public final /* synthetic */ v.a.AbstractC0321a b;

    public /* synthetic */ o(g0.b bVar, v.a.AbstractC0321a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        g0.b bVar = this.a;
        v.a.AbstractC0321a aVar = this.b;
        Throwable th = (Throwable) obj;
        bVar.getClass();
        if (th instanceof InsufficientStorageException) {
            g0.j(g0.this).c(C0707R.string.toast_playlist_size_limit_exceeded, new Object[0]);
        } else {
            g0.j(g0.this).d(C0707R.string.error_general_title, new Object[0]);
        }
        aVar.a(false);
        Logger.e(th, "Failed to add playlist extender track to playlist", new Object[0]);
    }
}
