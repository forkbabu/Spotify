package com.spotify.music.libs.fullscreen.story.promo.encore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.ArtworkView;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.h;

public final class FullscreenStoryPromoCardImpl implements Component {
    private final nga a;
    private final FrameLayout b;

    public FullscreenStoryPromoCardImpl(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        nga b2 = nga.b(LayoutInflater.from(context));
        h.d(b2, "StoryPromoCardHomeLayout…utInflater.from(context))");
        this.a = b2;
        FrameLayout a2 = b2.a();
        h.d(a2, "root");
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        bvd b3 = dvd.b(b2.e);
        b3.g(b2.d, b2.i, b2.h);
        b3.f(b2.f, b2.g, b2.c);
        b3.a();
        b2.c.setViewContext(new ArtworkView.ViewContext(picasso));
        b2.f.setViewContext(new ArtworkView.ViewContext(picasso));
        b2.g.setScaleType(VideoSurfaceView.ScaleType.ASPECT_FILL);
        RoundedCornerTreatment.Companion companion = RoundedCornerTreatment.Companion;
        ConstraintLayout constraintLayout = b2.e;
        h.d(constraintLayout, "rootView");
        companion.create(constraintLayout, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.promotion_background_corner_radius));
        FrameLayout a3 = b2.a();
        h.d(a3, "binding.root");
        this.b = a3;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.b;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super FullscreenStoryPromoCard$Events, f> nmf) {
        h.e(nmf, "event");
        nga nga = this.a;
        ConstraintLayout constraintLayout = nga.e;
        h.d(constraintLayout, "rootView");
        FullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1 fullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1 = new FullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1(nga, this, nmf);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = 0.0f;
        constraintLayout.setOnTouchListener(new c(ref$FloatRef));
        constraintLayout.setOnClickListener(new d(fullscreenStoryPromoCardImpl$onEvent$$inlined$apply$lambda$1, ref$FloatRef));
    }

    @Override // com.spotify.encore.Item
    public void render(Object obj) {
        b bVar = (b) obj;
        h.e(bVar, "model");
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            nga nga = this.a;
            nga.e.setBackgroundColor(aVar.a());
            TextView textView = nga.d;
            h.d(textView, "label");
            textView.setText(aVar.c());
            TextView textView2 = nga.i;
            h.d(textView2, "title");
            textView2.setText(aVar.f());
            TextView textView3 = nga.h;
            h.d(textView3, ContextTrack.Metadata.KEY_SUBTITLE);
            textView3.setText(aVar.e());
            nga.c.render((Artwork.Model) new Artwork.Model.Playlist(new Artwork.ImageData(aVar.b()), false, 2, null));
            nga.f.render((Artwork.Model) new Artwork.Model.Playlist(new Artwork.ImageData(aVar.d()), false, 2, null));
        } else if (bVar instanceof b.AbstractC0293b.c) {
            nga nga2 = this.a;
            ArtworkView artworkView = nga2.f;
            h.d(artworkView, "storyArtWork");
            artworkView.setVisibility(8);
            StateListAnimatorVideoSurfaceView stateListAnimatorVideoSurfaceView = nga2.g;
            h.d(stateListAnimatorVideoSurfaceView, "storyVideoSurface");
            stateListAnimatorVideoSurfaceView.setVisibility(0);
        } else if (bVar instanceof b.AbstractC0293b.a) {
            ((b.AbstractC0293b.a) bVar).a().e(this.a.g);
        } else if (bVar instanceof b.AbstractC0293b.C0294b) {
            ((b.AbstractC0293b.C0294b) bVar).a().k(this.a.g);
        }
    }
}
