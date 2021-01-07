package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.voiceassistant.player.models.ParsedQuery;
import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import com.spotify.voiceassistant.player.models.SourceDevice;
import com.spotify.voiceassistant.voice.results.o;
import defpackage.ohf;
import defpackage.wy8;
import io.reactivex.d0;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iy8  reason: default package */
public class iy8 {
    private final boolean a;
    private final o b;
    private final qx8 c;
    private final pea d;
    private final wx8 e;
    private final tx8 f;
    private final y g;
    private final wy8 h;
    private final mx8 i;
    private final phf<SearchRequest, SearchResponse> j;
    final a k;
    private final io.reactivex.disposables.a l = new io.reactivex.disposables.a();
    private final AtomicBoolean m = new AtomicBoolean(false);

    /* renamed from: iy8$a */
    final class a implements ohf<SearchRequest, SearchResponse> {
        a() {
        }

        @Override // defpackage.ohf
        public void a() {
            iy8.this.i.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, ohf$a] */
        @Override // defpackage.ohf
        public void b(SearchResponse searchResponse, ohf.a aVar) {
            SearchResponse searchResponse2 = searchResponse;
            if (SearchResponse.RESULT_ERROR.equals(searchResponse2.result())) {
                iy8.this.i.b(searchResponse2);
                aVar.onPreparePlayFailed();
                return;
            }
            aVar.a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.ohf
        public void c(SearchRequest searchRequest, SearchResponse searchResponse) {
            SearchRequest searchRequest2 = searchRequest;
            SearchResponse searchResponse2 = searchResponse;
            io.reactivex.a d = iy8.this.e.d(searchResponse2, searchRequest2.interactionId()).d(iy8.this.b.e(searchRequest2, searchResponse2)).d(iy8.this.c.b(searchResponse2.viewUri()));
            bx8 bx8 = new bx8(this);
            mx8 mx8 = iy8.this.i;
            mx8.getClass();
            iy8.this.l.b(d.subscribe(bx8, new uw8(mx8)));
        }
    }

    public iy8(tx8 tx8, boolean z, y yVar, wy8 wy8, qhf<SearchRequest, SearchResponse> qhf, s<Boolean> sVar, o oVar, qx8 qx8, pea pea, wx8 wx8, mx8 mx8) {
        a aVar = new a();
        this.k = aVar;
        this.b = oVar;
        this.c = qx8;
        this.d = pea;
        this.e = wx8;
        this.f = tx8;
        this.g = yVar;
        this.h = wy8;
        this.i = mx8;
        Logger.b("Google assistant Resolver is connected.", new Object[0]);
        this.a = z;
        this.j = qhf.b(aVar, sVar);
    }

    private z<SearchRequest> g(vx8 vx8, yda yda, Optional<String> optional) {
        return this.f.a().N0(1).B0().A(new dx8(this, vx8, yda, optional)).B(this.g);
    }

    public void h(yda yda) {
        this.m.set(false);
        io.reactivex.disposables.a aVar = this.l;
        io.reactivex.a a2 = this.e.a();
        z<String> i2 = this.d.i(yda, false);
        i2.getClass();
        aVar.b(a2.E(new i(i2)).subscribe());
    }

    public void i() {
        Logger.b("Google assistant Resolver is disconnected.", new Object[0]);
        this.l.f();
    }

    public void j(yda yda) {
        this.m.set(true);
        io.reactivex.disposables.a aVar = this.l;
        io.reactivex.a b2 = this.e.b();
        z<String> i2 = this.d.i(yda, true);
        i2.getClass();
        aVar.b(b2.E(new i(i2)).subscribe());
    }

    public SearchRequest k(vx8 vx8, yda yda, Optional optional, String str) {
        String str2;
        String uri = khf.a(this.j.c(vx8.d())).toString();
        vy8 a2 = this.h.a(wy8.a.a(yda.h()));
        SearchRequest.Builder parsedQuery = SearchRequest.builder().textQuery(vx8.b()).textQueryLanguage(vx8.c()).parsedQuery(ParsedQuery.builder().uri(uri).build());
        str.getClass();
        if (this.a) {
            str2 = DeviceType.GaiaTypes.TABLET.toJson();
        } else {
            str2 = DeviceType.GaiaTypes.SMARTPHONE.toJson();
        }
        return parsedQuery.sourceDevice(SourceDevice.builder().brand(yda.c()).model(yda.e()).deviceType(str2).deviceId(str).build()).interactionId(optional).voiceFeatureName(a2.b()).build();
    }

    public /* synthetic */ d0 l(vx8 vx8, yda yda, String str) {
        return g(vx8, yda, Optional.of(str));
    }

    public /* synthetic */ void m(vx8 vx8, SearchRequest searchRequest) {
        this.j.g(vx8.d(), searchRequest);
    }

    public /* synthetic */ void n(Throwable th) {
        Logger.e(th, "Couldn't create request for play", new Object[0]);
        this.i.a();
    }

    public /* synthetic */ void o(vx8 vx8, SearchRequest searchRequest) {
        this.j.h(vx8.d(), searchRequest);
    }

    public /* synthetic */ void p(Throwable th) {
        Logger.d("Couldn't create request for prepare", new Object[0]);
        this.i.a();
    }

    public void q(vx8 vx8, yda yda) {
        this.l.b(this.d.n(yda, vx8.d().toString(), null).s(new ex8(this, vx8, yda)).subscribe(new hx8(this, vx8), new fx8(this)));
    }

    public void r(vx8 vx8, yda yda) {
        this.l.b(g(vx8, yda, Optional.absent()).subscribe(new gx8(this, vx8), new cx8(this)));
    }
}
