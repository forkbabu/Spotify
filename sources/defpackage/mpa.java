package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.kpa;

/* renamed from: mpa  reason: default package */
public abstract class mpa {

    /* renamed from: mpa$a */
    public interface a {
        a a(String str);

        a b(String str);

        mpa build();

        a e(com.spotify.playlist.models.offline.a aVar);

        a f(vqc vqc);

        a g(LottieAnimationView lottieAnimationView);
    }

    public static a b() {
        return new kpa.b();
    }

    public abstract LottieAnimationView a();

    public abstract String c();

    public abstract String d();

    public abstract vqc e();

    public abstract com.spotify.playlist.models.offline.a f();
}
