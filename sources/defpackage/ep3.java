package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.e;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.s;

/* renamed from: ep3  reason: default package */
public class ep3 implements d {
    private final e a;
    private final SlotApi b;
    private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
    private final l6a f;

    /* renamed from: ep3$b */
    private static class b extends io.reactivex.observers.a<Response> {
        private final String b;

        b(String str, a aVar) {
            this.b = str;
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            Logger.b("Ads Connect - Request %s completed", this.b);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            Logger.b("Ads Connect - Request %s errored %s", th.getMessage(), this.b);
        }

        @Override // io.reactivex.x
        public void onNext(Object obj) {
            Response response = (Response) obj;
            Logger.b("Ads Connect - request %s succeeded", this.b);
        }
    }

    /* renamed from: ep3$c */
    private class c implements io.reactivex.c {
        private final String a;
        private io.reactivex.disposables.b b;

        c(String str, a aVar) {
            this.a = str;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            Logger.b("Ads Connect - request %s succeeded", this.a);
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            Logger.b("Ads Connect - Request %s errored %s", this.a, th.getMessage());
            ep3.this.c.a(this.b);
        }

        @Override // io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.b = bVar;
            ep3.this.c.b(this.b);
        }
    }

    public ep3(SlotApi slotApi, e eVar, l6a l6a) {
        this.b = slotApi;
        this.a = eVar;
        this.f = l6a;
    }

    public void b(Boolean bool) {
        if (bool.booleanValue()) {
            io.reactivex.disposables.a aVar = this.c;
            s<Response> d = this.a.d(AdSlot.WATCHNOW.getSlotId(), "slot_enabled", "false");
            b bVar = new b("disableWatchNow", null);
            d.subscribe(bVar);
            aVar.b(bVar);
            io.reactivex.disposables.a aVar2 = this.c;
            s<Response> d2 = this.a.d(AdSlot.MIDROLL_WATCHNOW.getSlotId(), "slot_enabled", "false");
            b bVar2 = new b("disableMidrollWatchNow", null);
            d2.subscribe(bVar2);
            aVar2.b(bVar2);
            SlotApi slotApi = this.b;
            String slotId = AdSlot.STREAM.getSlotId();
            SlotApi.Intent intent = SlotApi.Intent.CLEAR;
            slotApi.a(slotId, intent).subscribe(new c("ClearStream", null));
            this.b.a(AdSlot.PREROLL.getSlotId(), intent).subscribe(new c("ClearPreroll", null));
            return;
        }
        io.reactivex.disposables.a aVar3 = this.c;
        s<Response> d3 = this.a.d(AdSlot.WATCHNOW.getSlotId(), "slot_enabled", "true");
        b bVar3 = new b("enableWatchNow", null);
        d3.subscribe(bVar3);
        aVar3.b(bVar3);
        io.reactivex.disposables.a aVar4 = this.c;
        s<Response> d4 = this.a.d(AdSlot.MIDROLL_WATCHNOW.getSlotId(), "slot_enabled", "true");
        b bVar4 = new b("enableMidrollWatchNow", null);
        d4.subscribe(bVar4);
        aVar4.b(bVar4);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.c.b(this.f.b().subscribe(new dp3(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.c.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AdConnectConfigPlugin";
    }
}
