package com.spotify.music.superbird.setup;

import com.spotify.music.superbird.setup.model.CarThingDevice;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SuperbirdSetupFragmentViewModel$getDeviceState$1 extends FunctionReferenceImpl implements nmf<List<? extends CarThingDevice>, f> {
    SuperbirdSetupFragmentViewModel$getDeviceState$1(SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel) {
        super(1, superbirdSetupFragmentViewModel, SuperbirdSetupFragmentViewModel.class, "getSetupStateFromDevicesRegistered", "getSetupStateFromDevicesRegistered(Ljava/util/List;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(List<? extends CarThingDevice> list) {
        List<? extends CarThingDevice> list2 = list;
        h.e(list2, "p1");
        SuperbirdSetupFragmentViewModel.h((SuperbirdSetupFragmentViewModel) this.receiver, list2);
        return f.a;
    }
}
