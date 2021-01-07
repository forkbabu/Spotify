package com.spotify.connect.snacks;

import com.spotify.libs.connect.model.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class AvailableDevicesTransformer$apply$2 extends FunctionReferenceImpl implements nmf<List<? extends a>, List<? extends a>> {
    AvailableDevicesTransformer$apply$2(AvailableDevicesTransformer availableDevicesTransformer) {
        super(1, availableDevicesTransformer, AvailableDevicesTransformer.class, "toAvailableDevices", "toAvailableDevices(Ljava/util/List;)Ljava/util/List;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public List<? extends a> invoke(List<? extends a> list) {
        List<? extends a> list2 = list;
        h.e(list2, "p1");
        ((AvailableDevicesTransformer) this.receiver).getClass();
        ArrayList arrayList = new ArrayList(d.e(list2, 10));
        for (T t : list2) {
            String name = t.getName();
            h.d(name, "device.name");
            String cosmosIdentifier = t.getCosmosIdentifier();
            h.d(cosmosIdentifier, "device.cosmosIdentifier");
            arrayList.add(new a(name, cosmosIdentifier, t.isActive()));
        }
        return arrayList;
    }
}
