package com.spotify.music.appprotocol.superbird.presets;

import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.presets.model.PresetsAppProtocol;
import defpackage.cf2;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class PresetsEndpoints implements com.spotify.music.appprotocol.api.a {
    private final ppe a;

    static final class a<A extends JacksonModel, R extends JacksonModel> implements cf2.c<PresetsAppProtocol.DevicePresetsRequest, PresetsAppProtocol.DevicePresets> {
        final /* synthetic */ PresetsEndpoints a;

        a(PresetsEndpoints presetsEndpoints) {
            this.a = presetsEndpoints;
        }

        /* Return type fixed from 'io.reactivex.s' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.mobile.android.cosmos.JacksonModel] */
        @Override // defpackage.cf2.c
        public s<PresetsAppProtocol.DevicePresets> a(PresetsAppProtocol.DevicePresetsRequest devicePresetsRequest) {
            return PresetsEndpoints.b(this.a);
        }
    }

    public PresetsEndpoints(ppe ppe) {
        h.e(ppe, "presetsManager");
        this.a = ppe;
    }

    public static final s b(PresetsEndpoints presetsEndpoints) {
        s<R> j0 = presetsEndpoints.a.b().P().j0(a.a);
        h.d(j0, "presetsManager\n         …ets(it)\n                }");
        return j0;
    }

    public static final s c(PresetsEndpoints presetsEndpoints, PresetsAppProtocol.DevicePresetUpdateRequest devicePresetUpdateRequest) {
        s g = presetsEndpoints.a.a(devicePresetUpdateRequest.getPresets()).g(s.i0(AppProtocolBase.a));
        h.d(g, "presetsManager.saveJsonP…t(AppProtocolBase.EMPTY))");
        return g;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b = cf2.b(PresetsAppProtocol.DevicePresetsRequest.class, PresetsAppProtocol.DevicePresets.class);
        b.d("com.spotify.superbird.presets.get_presets");
        b.c(0);
        b.e(new a(this));
        qg0.accept(b.a());
        cf2 b2 = cf2.b(PresetsAppProtocol.DevicePresetUpdateRequest.class, AppProtocolBase.Empty.class);
        b2.d("com.spotify.superbird.presets.set_preset");
        b2.c(8);
        b2.e(new b(new PresetsEndpoints$setupEndpoints$2(this)));
        qg0.accept(b2.a());
    }
}
