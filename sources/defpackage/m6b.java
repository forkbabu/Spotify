package defpackage;

import com.spotify.searchview.proto.DrillDownViewResponse;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.z;

/* renamed from: m6b  reason: default package */
public class m6b implements l6b {
    private final vz0 a;

    public m6b(vz0 vz0) {
        this.a = vz0;
    }

    @Override // defpackage.l6b
    public z<MainViewResponse> a(s7b s7b) {
        return this.a.a(s7b.b());
    }

    @Override // defpackage.l6b
    public z<DrillDownViewResponse> b(s7b s7b, String str) {
        return this.a.d(str, s7b.b());
    }
}
