package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionAlbumsRequest$ProtoCollectionAlbumsResponse;
import io.reactivex.functions.l;

/* renamed from: d9a  reason: default package */
public final /* synthetic */ class d9a implements l {
    public static final /* synthetic */ d9a a = new d9a();

    private /* synthetic */ d9a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        int status = response.getStatus();
        if (status / 100 == 2) {
            return iaa.a(CollectionAlbumsRequest$ProtoCollectionAlbumsResponse.o(response.getBody()));
        }
        throw new RuntimeException(String.format("Received error status code %d in albums response with body: %s", Integer.valueOf(status), response.getBody() == null ? "" : response.getBodyString()));
    }
}
