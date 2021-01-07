package defpackage;

import com.spotify.cosmos.android.CosmosException;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.spotlets.collection.proto.CollectionTracksRequest$ProtoCollectionTracksResponse;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: yh0  reason: default package */
public final class yh0 implements xh0 {
    private final wh0 a;

    /* renamed from: yh0$a */
    static final class a<T, R> implements l<Response, ni0> {
        final /* synthetic */ yh0 a;

        a(yh0 yh0) {
            this.a = yh0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ni0 apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return yh0.c(this.a, response2);
        }
    }

    /* renamed from: yh0$b */
    static final class b<T, R> implements l<Response, ni0> {
        final /* synthetic */ yh0 a;

        b(yh0 yh0) {
            this.a = yh0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public ni0 apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            return yh0.c(this.a, response2);
        }
    }

    public yh0(wh0 wh0) {
        h.e(wh0, "cosmosService");
        this.a = wh0;
    }

    public static final ni0 c(yh0 yh0, Response response) {
        yh0.getClass();
        int status = response.getStatus();
        if (status / 100 == 2) {
            CollectionTracksRequest$ProtoCollectionTracksResponse q = CollectionTracksRequest$ProtoCollectionTracksResponse.q(response.getBody());
            h.d(q, "CollectionTracksRequest.…se.body\n                )");
            return ci0.a(q);
        }
        throw new CosmosException(je.q0("Received error status code ", status, " in tracks response"));
    }

    @Override // defpackage.xh0
    public s<ni0> a(Map<String, String> map, Policy policy) {
        h.e(map, "queryMap");
        h.e(policy, "policy");
        s<R> j0 = this.a.a(map, policy).j0(new b(this));
        h.d(j0, "cosmosService.subscribeT…andleTracksResponse(it) }");
        return j0;
    }

    @Override // defpackage.xh0
    public z<ni0> b(Map<String, String> map, Policy policy) {
        h.e(map, "queryMap");
        h.e(policy, "policy");
        z<R> A = this.a.d(map, policy).A(new a(this));
        h.d(A, "cosmosService.getTracks(…andleTracksResponse(it) }");
        return A;
    }
}
