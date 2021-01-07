package defpackage;

import com.spotify.music.spotlets.scannables.model.IdModel;
import io.reactivex.functions.l;

/* renamed from: ngd  reason: default package */
public final /* synthetic */ class ngd implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ ngd(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3((IdModel) obj, this.a);
    }
}
