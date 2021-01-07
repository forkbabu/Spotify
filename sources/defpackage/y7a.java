package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.util.decorator.UpdateModel;
import com.spotify.mobile.android.util.decorator.c;
import com.spotify.playlist.models.a;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;

/* renamed from: y7a  reason: default package */
public class y7a extends c<a> {
    private final f8a d;

    public y7a(f8a f8a, y yVar, y yVar2) {
        super(yVar, yVar2);
        this.d = f8a;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public z<Response> a(UpdateModel updateModel) {
        return this.d.b(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public s<Response> b(UpdateModel updateModel) {
        return this.d.a(d(), updateModel);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.util.decorator.c
    public Map<String, a> c(byte[] bArr) {
        return iaa.f(CollectionDecorateRequest$ProtoDecorateResponse.p(bArr));
    }
}
