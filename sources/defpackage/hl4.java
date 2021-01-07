package defpackage;

import android.net.Uri;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.s;

/* renamed from: hl4  reason: default package */
public class hl4 {
    private final RxWebToken a;
    private final fl4 b;

    hl4(RxWebToken rxWebToken, fl4 fl4) {
        this.a = rxWebToken;
        this.b = fl4;
    }

    public s<Uri> a(Uri uri) {
        s<Uri> a2 = this.a.a(uri);
        fl4 fl4 = this.b;
        fl4.getClass();
        return a2.j0(new el4(fl4)).N0(1);
    }
}
