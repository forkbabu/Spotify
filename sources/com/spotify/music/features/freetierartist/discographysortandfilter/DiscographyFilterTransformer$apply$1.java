package com.spotify.music.features.freetierartist.discographysortandfilter;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.p81;
import defpackage.s81;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class DiscographyFilterTransformer$apply$1 extends FunctionReferenceImpl implements rmf<b91, String, b91> {
    DiscographyFilterTransformer$apply$1(DiscographyFilterTransformer discographyFilterTransformer) {
        super(2, discographyFilterTransformer, DiscographyFilterTransformer.class, "filterUpstreamModel", "filterUpstreamModel(Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;Ljava/lang/String;)Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public b91 invoke(b91 b91, String str) {
        b91 b912 = b91;
        String str2 = str;
        h.e(b912, "p1");
        h.e(str2, "p2");
        ((DiscographyFilterTransformer) this.receiver).getClass();
        if (str2.length() == 0) {
            return b912;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : b912.body()) {
            String id = t.componentId().id();
            int hashCode = id.hashCode();
            if (hashCode != -1192254569) {
                if (hashCode == -1012455792 && id.equals("consumerMobile:albumFilterRowDiscography")) {
                    if (!(str2.length() > 0)) {
                        continue;
                    } else {
                        Object obj = t.custom().get("items");
                        if (obj != null) {
                            HubsImmutableComponentBundle[] hubsImmutableComponentBundleArr = (HubsImmutableComponentBundle[]) obj;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(HubsImmutableComponentBundle.Companion.b().p("key", "cancel").p("label", "cancel").d());
                            for (HubsImmutableComponentBundle hubsImmutableComponentBundle : hubsImmutableComponentBundleArr) {
                                if (h.a(hubsImmutableComponentBundle.get("key"), str2)) {
                                    arrayList2.add(hubsImmutableComponentBundle.toBuilder().b("is_selected", true).d());
                                }
                            }
                            s81.a builder = t.toBuilder();
                            p81.a b = HubsImmutableComponentBundle.Companion.b();
                            Object[] array = arrayList2.toArray(new p81[0]);
                            if (array != null) {
                                arrayList.add(builder.p(b.f("items", (p81[]) array).d()).l());
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle>");
                        }
                    }
                }
            } else if (id.equals("freetier:largerRow")) {
                if (h.a(t.metadata().get("albumType"), str2)) {
                    arrayList.add(t);
                }
            }
            arrayList.add(t);
        }
        return je.L(b912, arrayList);
    }
}
