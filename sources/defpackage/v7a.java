package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.x;
import com.spotify.music.libs.collection.model.a;
import io.reactivex.functions.c;
import java.util.Map;

/* renamed from: v7a  reason: default package */
public final /* synthetic */ class v7a implements c {
    public final /* synthetic */ String a;

    public /* synthetic */ v7a(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        String str = this.a;
        a.AbstractC0282a a2 = a.a();
        a2.g((com.spotify.playlist.models.a) x.n(((Map) obj).get(str), com.spotify.playlist.models.a.a().e()));
        a2.h((Map) obj2);
        return ImmutableMap.of(str, a2.build());
    }
}
