package defpackage;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.api.c;

/* renamed from: vk3  reason: default package */
public class vk3 implements c {
    private final nl3 a;

    public vk3(nl3 nl3) {
        this.a = nl3;
    }

    @Override // com.spotify.music.features.ads.api.c
    public void a(l0 l0Var) {
        this.a.a(l0Var.i()).subscribe(gk3.a, fk3.a);
    }
}
