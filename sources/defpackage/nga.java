package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.fullscreen.story.promo.encore.StateListAnimatorVideoSurfaceView;

/* renamed from: nga  reason: default package */
public final class nga {
    private final FrameLayout a;
    public final Barrier b;
    public final ArtworkView c;
    public final TextView d;
    public final ConstraintLayout e;
    public final ArtworkView f;
    public final StateListAnimatorVideoSurfaceView g;
    public final TextView h;
    public final TextView i;

    private nga(FrameLayout frameLayout, Barrier barrier, FrameLayout frameLayout2, ArtworkView artworkView, TextView textView, ConstraintLayout constraintLayout, ArtworkView artworkView2, StateListAnimatorVideoSurfaceView stateListAnimatorVideoSurfaceView, TextView textView2, TextView textView3) {
        this.a = frameLayout;
        this.b = barrier;
        this.c = artworkView;
        this.d = textView;
        this.e = constraintLayout;
        this.f = artworkView2;
        this.g = stateListAnimatorVideoSurfaceView;
        this.h = textView2;
        this.i = textView3;
    }

    public static nga b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0707R.layout.story_promo_card_home_layout, (ViewGroup) null, false);
        int i2 = C0707R.id.barrier;
        Barrier barrier = (Barrier) inflate.findViewById(C0707R.id.barrier);
        if (barrier != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            i2 = C0707R.id.item_art_work;
            ArtworkView artworkView = (ArtworkView) inflate.findViewById(C0707R.id.item_art_work);
            if (artworkView != null) {
                i2 = C0707R.id.label;
                TextView textView = (TextView) inflate.findViewById(C0707R.id.label);
                if (textView != null) {
                    i2 = C0707R.id.root_view;
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(C0707R.id.root_view);
                    if (constraintLayout != null) {
                        i2 = C0707R.id.story_art_work;
                        ArtworkView artworkView2 = (ArtworkView) inflate.findViewById(C0707R.id.story_art_work);
                        if (artworkView2 != null) {
                            i2 = C0707R.id.story_video_surface;
                            StateListAnimatorVideoSurfaceView stateListAnimatorVideoSurfaceView = (StateListAnimatorVideoSurfaceView) inflate.findViewById(C0707R.id.story_video_surface);
                            if (stateListAnimatorVideoSurfaceView != null) {
                                i2 = C0707R.id.subtitle;
                                TextView textView2 = (TextView) inflate.findViewById(C0707R.id.subtitle);
                                if (textView2 != null) {
                                    i2 = C0707R.id.title;
                                    TextView textView3 = (TextView) inflate.findViewById(C0707R.id.title);
                                    if (textView3 != null) {
                                        return new nga(frameLayout, barrier, frameLayout, artworkView, textView, constraintLayout, artworkView2, stateListAnimatorVideoSurfaceView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public FrameLayout a() {
        return this.a;
    }
}
