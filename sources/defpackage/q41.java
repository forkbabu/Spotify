package defpackage;

import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import io.reactivex.functions.n;
import java.io.IOException;
import retrofit2.HttpException;

/* renamed from: q41  reason: default package */
public final /* synthetic */ class q41 implements n {
    public static final /* synthetic */ q41 a = new q41();

    private /* synthetic */ q41() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        return (th instanceof IOException) || (th instanceof HttpException) || (th instanceof ParsingCallbackReceiver.ParserException);
    }
}
