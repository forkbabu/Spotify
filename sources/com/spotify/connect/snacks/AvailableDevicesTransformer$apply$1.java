package com.spotify.connect.snacks;

import com.spotify.libs.connect.model.GaiaDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class AvailableDevicesTransformer$apply$1 extends FunctionReferenceImpl implements nmf<List<? extends GaiaDevice>, List<? extends GaiaDevice>> {
    AvailableDevicesTransformer$apply$1(AvailableDevicesTransformer availableDevicesTransformer) {
        super(1, availableDevicesTransformer, AvailableDevicesTransformer.class, "removeSelf", "removeSelf(Ljava/util/List;)Ljava/util/List;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public List<? extends GaiaDevice> invoke(List<? extends GaiaDevice> list) {
        T t;
        List<? extends GaiaDevice> list2 = list;
        h.e(list2, "p1");
        ((AvailableDevicesTransformer) this.receiver).getClass();
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.isSelf()) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return list2;
        }
        List W = d.W(list2);
        ((ArrayList) W).remove(t2);
        return d.Q(W);
    }
}
