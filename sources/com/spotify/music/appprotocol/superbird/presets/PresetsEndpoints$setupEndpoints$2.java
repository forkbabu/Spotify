package com.spotify.music.appprotocol.superbird.presets;

import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.presets.model.PresetsAppProtocol;
import io.reactivex.s;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PresetsEndpoints$setupEndpoints$2 extends FunctionReferenceImpl implements nmf<PresetsAppProtocol.DevicePresetUpdateRequest, s<AppProtocolBase.Empty>> {
    PresetsEndpoints$setupEndpoints$2(PresetsEndpoints presetsEndpoints) {
        super(1, presetsEndpoints, PresetsEndpoints.class, "setPresetForDevice", "setPresetForDevice(Lcom/spotify/music/appprotocol/superbird/presets/model/PresetsAppProtocol$DevicePresetUpdateRequest;)Lio/reactivex/Observable;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public s<AppProtocolBase.Empty> invoke(PresetsAppProtocol.DevicePresetUpdateRequest devicePresetUpdateRequest) {
        PresetsAppProtocol.DevicePresetUpdateRequest devicePresetUpdateRequest2 = devicePresetUpdateRequest;
        h.e(devicePresetUpdateRequest2, "p1");
        return PresetsEndpoints.c((PresetsEndpoints) this.receiver, devicePresetUpdateRequest2);
    }
}
