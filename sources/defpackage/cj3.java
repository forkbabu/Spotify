package defpackage;

import com.spotify.playlist.models.f;
import io.reactivex.functions.d;

/* renamed from: cj3  reason: default package */
public final /* synthetic */ class cj3 implements d {
    public static final /* synthetic */ cj3 a = new cj3();

    private /* synthetic */ cj3() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        int i = mj3.g;
        if (fVar == null || fVar2 == null || fVar.getUnrangedLength() != 0 || fVar2.getUnrangedLength() != 0) {
            return false;
        }
        return true;
    }
}
