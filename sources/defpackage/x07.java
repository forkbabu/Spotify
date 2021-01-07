package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.functions.l;

/* renamed from: x07  reason: default package */
public final /* synthetic */ class x07 implements l {
    public static final /* synthetic */ x07 a = new x07();

    private /* synthetic */ x07() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return HubsImmutableViewModel.immutable((HubsJsonViewModel) obj);
    }
}
