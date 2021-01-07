package defpackage;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: ia5  reason: default package */
public class ia5 {
    private final rf3 a;

    public ia5(rf3 rf3) {
        rf3.getClass();
        this.a = rf3;
    }

    public s<Uri> a(String str) {
        l0 z = l0.z(str);
        MoreObjects.checkArgument(z.q() == LinkType.TRACK, "SpotifyLink needs to be of link type Track");
        Uri parse = Uri.parse(String.format("hm://track-entity-view/v2/track/%s", z.i()));
        rf3 rf3 = this.a;
        rf3.getClass();
        parse.getClass();
        return new v(rf3.a().O(new pf3(parse)));
    }
}
