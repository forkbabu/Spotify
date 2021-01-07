package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.display.e;
import io.reactivex.functions.n;

/* renamed from: mz7  reason: default package */
public final /* synthetic */ class mz7 implements n {
    public static final /* synthetic */ mz7 a = new mz7();

    private /* synthetic */ mz7() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return FormatType.CARDS == ((e) obj).getFormat();
    }
}
