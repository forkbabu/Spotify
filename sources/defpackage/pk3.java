package defpackage;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: pk3  reason: default package */
public final /* synthetic */ class pk3 implements l {
    public static final /* synthetic */ pk3 a = new pk3();

    private /* synthetic */ pk3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        if (response.getStatus() == 200) {
            return z.z(response);
        }
        return z.q(new Exception("[VoiceAd] Failed to retrieve inaudible signal information"));
    }
}
