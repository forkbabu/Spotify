package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.functions.l;
import io.reactivex.internal.util.ExceptionHelper;
import java.io.IOException;

/* renamed from: zh7  reason: default package */
public final /* synthetic */ class zh7 implements l {
    public final /* synthetic */ ObjectMapper a;

    public /* synthetic */ zh7(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        try {
            return (HubsJsonViewModel) this.a.readValue((String) obj, HubsJsonViewModel.class);
        } catch (IOException e) {
            throw ExceptionHelper.e(e);
        }
    }
}
