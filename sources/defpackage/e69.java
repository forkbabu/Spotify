package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.endpoint.model.BansResponse;
import io.reactivex.functions.l;

/* renamed from: e69  reason: default package */
public final /* synthetic */ class e69 implements l {
    public static final /* synthetic */ e69 a = new e69();

    private /* synthetic */ e69() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getTracks().isEmpty());
    }
}
