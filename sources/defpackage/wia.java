package defpackage;

import android.os.Bundle;
import android.util.Base64;
import com.spotify.packagevalidator.denylist.data.AndroidDenylist;
import io.reactivex.functions.l;

/* renamed from: wia  reason: default package */
public final /* synthetic */ class wia implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ wia(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean contains = ((AndroidDenylist) obj).packageNames().contains(Base64.encodeToString(bqd.a(this.a.getBytes()), 2));
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.spotify.music.extra.IS_PACKAGE_NAME_DENIED", contains);
        return new zia(1, bundle);
    }
}
