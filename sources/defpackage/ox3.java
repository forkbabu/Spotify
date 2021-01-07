package defpackage;

import com.spotify.music.libs.collection.model.c;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.io.IOException;

/* renamed from: ox3  reason: default package */
public final /* synthetic */ class ox3 implements l {
    public static final /* synthetic */ ox3 a = new ox3();

    private /* synthetic */ ox3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c cVar = (c) obj;
        if (!cVar.getItems().isEmpty()) {
            return z.z(cVar);
        }
        return z.q(new IOException("could not get album tracks."));
    }
}
