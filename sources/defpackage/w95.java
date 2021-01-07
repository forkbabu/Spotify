package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.c;
import java.util.Map;

/* renamed from: w95  reason: default package */
public final /* synthetic */ class w95 implements c {
    public final /* synthetic */ String a;

    public /* synthetic */ w95(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        b91 b91 = (b91) obj;
        CollectionStateProvider.a aVar = (CollectionStateProvider.a) ((Map) obj2).get(this.a);
        if (aVar != null) {
            return new u3(b91, jf3.a(b91, aVar.b(), aVar.a(), false));
        }
        throw new RuntimeException("No collection state for track");
    }
}
