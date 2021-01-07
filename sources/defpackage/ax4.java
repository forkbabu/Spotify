package defpackage;

import com.spotify.music.features.editplaylist.operations.SetPictureOperationHandler;
import io.reactivex.functions.l;

/* renamed from: ax4  reason: default package */
public final /* synthetic */ class ax4 implements l {
    public final /* synthetic */ qx4 a;

    public /* synthetic */ ax4(qx4 qx4) {
        this.a = qx4;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return qx4.D(this.a, (SetPictureOperationHandler.Status) obj);
    }
}
