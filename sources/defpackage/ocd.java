package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import defpackage.rbd;
import io.reactivex.functions.l;
import io.reactivex.y;

/* renamed from: ocd  reason: default package */
public final /* synthetic */ class ocd implements l {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SnackbarManager b;
    public final /* synthetic */ y c;

    public /* synthetic */ ocd(Context context, SnackbarManager snackbarManager, y yVar) {
        this.a = context;
        this.b = snackbarManager;
        this.c = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return pcd.f(this.a, this.b, this.c, (rbd.h) obj);
    }
}
