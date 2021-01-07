package defpackage;

import com.spotify.share.base.linkgeneration.proto.GenerateUrlResponse;
import io.reactivex.functions.l;

/* renamed from: d4e  reason: default package */
public final /* synthetic */ class d4e implements l {
    public static final /* synthetic */ d4e a = new d4e();

    private /* synthetic */ d4e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        GenerateUrlResponse generateUrlResponse = (GenerateUrlResponse) obj;
        return w3e.a(generateUrlResponse.i(), generateUrlResponse.h(), generateUrlResponse.l());
    }
}
