package com.spotify.saveaccountinfo;

import androidx.work.ListenableWorker;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.functions.l;
import java.io.IOException;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof IOException) {
            return new ListenableWorker.a.b();
        }
        Assertion.w("SaveAccountInfoWorker failed", th);
        return new ListenableWorker.a.C0051a();
    }
}
