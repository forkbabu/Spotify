package defpackage;

import com.facebook.q;
import io.reactivex.functions.l;
import io.reactivex.internal.util.ExceptionHelper;
import org.json.JSONException;

/* renamed from: xl0  reason: default package */
public final /* synthetic */ class xl0 implements l {
    public static final /* synthetic */ xl0 a = new xl0();

    private /* synthetic */ xl0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        try {
            return ((q) obj).f().getJSONObject("picture").getJSONObject("data").getString("url");
        } catch (JSONException e) {
            throw ExceptionHelper.e(e);
        }
    }
}
