package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.display.e;
import io.reactivex.functions.n;

/* renamed from: nz7  reason: default package */
public final /* synthetic */ class nz7 implements n {
    public static final /* synthetic */ nz7 a = new nz7();

    private /* synthetic */ nz7() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return FormatType.FULLSCREEN == ((e) obj).getFormat();
    }
}
