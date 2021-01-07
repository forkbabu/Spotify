package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.display.e;
import io.reactivex.functions.n;

/* renamed from: jz7  reason: default package */
public final /* synthetic */ class jz7 implements n {
    public static final /* synthetic */ jz7 a = new jz7();

    private /* synthetic */ jz7() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return FormatType.NOTES == ((e) obj).getFormat();
    }
}
