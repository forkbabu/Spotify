package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

/* renamed from: epa  reason: default package */
public final /* synthetic */ class epa implements nmf {
    public final /* synthetic */ vqc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LottieAnimationView c;
    public final /* synthetic */ Context f;
    public final /* synthetic */ String n;

    public /* synthetic */ epa(vqc vqc, String str, LottieAnimationView lottieAnimationView, Context context, String str2) {
        this.a = vqc;
        this.b = str;
        this.c = lottieAnimationView;
        this.f = context;
        this.n = str2;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        vqc vqc = this.a;
        String str = this.b;
        LottieAnimationView lottieAnimationView = this.c;
        Context context = this.f;
        String str2 = this.n;
        a.g gVar = (a.g) obj;
        vqc.a(str, new xqc(), lottieAnimationView);
        lottieAnimationView.setContentDescription(context.getString(C0707R.string.content_description_download_episode_with_param_downloaded, str2));
        return f.a;
    }
}
