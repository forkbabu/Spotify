package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: vb5  reason: default package */
public final /* synthetic */ class vb5 implements l {
    public static final /* synthetic */ vb5 a = new vb5();

    private /* synthetic */ vb5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            builder.mo51put(entry.getKey(), Boolean.valueOf(((CollectionStateProvider.a) entry.getValue()).b()));
        }
        return builder.build();
    }
}
