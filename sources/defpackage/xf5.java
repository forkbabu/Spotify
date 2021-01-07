package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.b91;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Iterator;
import java.util.List;

/* renamed from: xf5  reason: default package */
public class xf5 implements w<b91, b91> {
    private static p81 a(List<? extends s81> list) {
        String str;
        p81 a;
        Iterator<? extends s81> it = list.iterator();
        do {
            p81 p81 = null;
            if (it.hasNext()) {
                s81 s81 = (s81) it.next();
                x81 background = s81.images().background();
                if (background != null) {
                    str = background.uri();
                } else {
                    x81 main = s81.images().main();
                    str = (main == null || main.uri() == null) ? null : main.uri();
                }
                if (!TextUtils.isEmpty(str)) {
                    p81 = HubsImmutableComponentBundle.builder().e("gradient", HubsImmutableComponentBundle.builder().p("style", "diagonal").p("startColorFromImage", str).i("overlayDarkness", 0.2f).d()).d();
                } else {
                    p81 bundle = s81.custom().bundle("gradient");
                    if (bundle != null) {
                        p81 = HubsImmutableComponentBundle.builder().e("gradient", HubsImmutableComponentBundle.builder().p("style", "diagonal").p("startColorFromImage", bundle.string("startColorFromImage")).p("startColor", bundle.string("startColor")).i("overlayDarkness", 0.2f).d()).d();
                    }
                }
                if (p81 == null) {
                    a = a(s81.children());
                }
            }
            return p81;
        } while (a == null);
        return a;
    }

    static b91 b(b91 b91) {
        if (b91.header() != null) {
            return b91;
        }
        p81 a = a(b91.body());
        b91.a builder = b91.toBuilder();
        if (a != null) {
            return builder.c(a).g();
        }
        return !b91.body().isEmpty() ? builder.c(HubsImmutableComponentBundle.builder().e("gradient", HubsImmutableComponentBundle.builder().p("style", "default").d()).d()).g() : b91;
    }

    /* Return type fixed from 'io.reactivex.v' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s] */
    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return sVar.j0(vf5.a);
    }
}
