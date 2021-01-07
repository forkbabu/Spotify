package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.videoads.overlay.VideoAdOverlayHidingFrameLayout;
import com.spotify.rxjava2.p;
import io.reactivex.g;

/* renamed from: e5c  reason: default package */
public class e5c {
    private final g<Boolean> a;
    private final p b = new p();
    private VideoAdOverlayHidingFrameLayout c;
    private ConstraintLayout d;
    private ConstraintLayout e;
    private ViewGroup f;
    private a g;

    /* renamed from: e5c$a */
    interface a {
    }

    public e5c(g<Boolean> gVar) {
        this.a = gVar;
    }

    public static void a(e5c e5c, boolean z) {
        if (z) {
            ConstraintLayout constraintLayout = e5c.d;
            b bVar = new b();
            bVar.h(constraintLayout.getContext(), C0707R.layout.video_ads_renderer_layout_fullscreen);
            bVar.c(constraintLayout);
            g(e5c.e, C0707R.layout.video_ads_player_overlay_fullscreen);
            f(e5c.e, e5c.f, true);
            e5c.c.setFitsSystemWindows(false);
            e5c.c.setPadding(0, 0, 0, 0);
            e5c.e.setPadding(0, 0, 0, 0);
        } else {
            ConstraintLayout constraintLayout2 = e5c.d;
            b bVar2 = new b();
            bVar2.h(constraintLayout2.getContext(), C0707R.layout.video_ads_renderer_layout);
            bVar2.c(constraintLayout2);
            g(e5c.e, C0707R.layout.video_ads_player_overlay);
            f(e5c.e, e5c.f, false);
            e5c.c.setFitsSystemWindows(true);
        }
        a aVar = e5c.g;
        if (aVar != null) {
            ((c5c) aVar).e();
        }
    }

    private static void f(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        if (z) {
            viewGroup.setBackground(androidx.core.content.a.d(viewGroup.getContext(), C0707R.drawable.vertical_video_ads_overlay_gradient));
            viewGroup2.setBackground(null);
            return;
        }
        viewGroup.setBackground(null);
        viewGroup2.setBackgroundColor(androidx.core.content.a.b(viewGroup2.getContext(), R.color.black_60));
    }

    private static void g(ConstraintLayout constraintLayout, int i) {
        View findViewById = constraintLayout.findViewById(C0707R.id.ad_call_to_action);
        int visibility = findViewById.getVisibility();
        View findViewById2 = constraintLayout.findViewById(C0707R.id.video_ads_info);
        int visibility2 = findViewById2.getVisibility();
        View findViewById3 = constraintLayout.findViewById(C0707R.id.skip_ad_button);
        int visibility3 = findViewById3.getVisibility();
        View findViewById4 = constraintLayout.findViewById(C0707R.id.sponsored_session_message);
        int visibility4 = findViewById4.getVisibility();
        b bVar = new b();
        bVar.h(constraintLayout.getContext(), i);
        bVar.c(constraintLayout);
        findViewById.setVisibility(visibility);
        findViewById2.setVisibility(visibility2);
        findViewById3.setVisibility(visibility3);
        findViewById4.setVisibility(visibility4);
    }

    public void b(VideoAdOverlayHidingFrameLayout videoAdOverlayHidingFrameLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ViewGroup viewGroup) {
        videoAdOverlayHidingFrameLayout.getClass();
        this.c = videoAdOverlayHidingFrameLayout;
        constraintLayout.getClass();
        this.d = constraintLayout;
        constraintLayout2.getClass();
        this.e = constraintLayout2;
        viewGroup.getClass();
        this.f = viewGroup;
        this.c.setFitsSystemWindows(true);
        this.b.b(this.a.subscribe(new b5c(this)));
    }

    public void c() {
        this.c.setFitsSystemWindows(false);
        this.b.a();
    }

    public void d() {
        this.g = null;
    }

    public void e(a aVar) {
        this.g = aVar;
    }
}
