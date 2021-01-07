package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import com.spotify.playlist.models.j;
import io.reactivex.functions.l;
import io.reactivex.internal.util.ExceptionHelper;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Throwable th = (Throwable) obj;
        if (th instanceof NotFoundException) {
            j.a a2 = j.a();
            a2.B(str);
            return a2.d();
        }
        throw ExceptionHelper.e(th);
    }
}
