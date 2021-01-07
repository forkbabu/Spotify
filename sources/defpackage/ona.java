package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import com.spotify.mobile.android.util.decorator.c;
import com.spotify.playlist.models.Show;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;

/* renamed from: ona  reason: default package */
public class ona extends c<Show> {
    private final qna d;

    public ona(qna qna, y yVar, y yVar2) {
        super(yVar, yVar2);
        this.d = qna;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public z<Response> a(UpdateModel updateModel) {
        return this.d.a(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public s<Response> b(UpdateModel updateModel) {
        return this.d.b(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public Map<String, Show> c(byte[] bArr) {
        return tyd.l(ShowDecorateRequest$ProtoDecorateResponse.n(bArr));
    }
}
