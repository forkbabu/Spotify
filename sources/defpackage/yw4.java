package defpackage;

import com.spotify.music.features.editplaylist.operations.SetPictureOperationHandler;
import io.reactivex.functions.g;

/* renamed from: yw4  reason: default package */
public final /* synthetic */ class yw4 implements g {
    public final /* synthetic */ qx4 a;

    public /* synthetic */ yw4(qx4 qx4) {
        this.a = qx4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        qx4.C(this.a, (SetPictureOperationHandler.Status) obj);
    }
}
