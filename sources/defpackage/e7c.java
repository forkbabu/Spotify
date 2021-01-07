package defpackage;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.music.nowplaying.videoads.widget.view.VideoAdsInfoView;
import com.spotify.player.model.ContextTrack;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: e7c  reason: default package */
public class e7c {
    private final g<ContextTrack> a;
    private final boolean b;
    private final p c = new p();
    private g7c d;

    public e7c(g<ContextTrack> gVar, AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties) {
        this.a = gVar;
        this.b = androidLibsAdsCommonProperties.m();
    }

    public static void a(e7c e7c, ContextTrack contextTrack) {
        String str;
        e7c.d.setVisible(!InterruptionUtil.isInterruptionUri(contextTrack.uri()));
        g7c g7c = e7c.d;
        if (e7c.b) {
            str = MoreObjects.nullToEmpty(contextTrack.metadata().get("title"));
        } else {
            str = MoreObjects.nullToEmpty(contextTrack.metadata().get("advertiser"));
        }
        boolean z = e7c.b;
        VideoAdsInfoView videoAdsInfoView = (VideoAdsInfoView) g7c;
        videoAdsInfoView.getClass();
        if (str.length() > 1) {
            SpannableString spannableString = new SpannableString(str);
            if (!z || !str.contains(":")) {
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 17);
            } else {
                spannableString.setSpan(new StyleSpan(1), 0, str.indexOf(58), 17);
            }
            videoAdsInfoView.setAlpha(1.0f);
            videoAdsInfoView.setText(spannableString);
            videoAdsInfoView.setVisible(true);
        }
    }

    public void b(g7c g7c) {
        this.d = g7c;
        this.c.b(this.a.subscribe(new u6c(this)));
    }

    public void c() {
        this.c.a();
    }
}
