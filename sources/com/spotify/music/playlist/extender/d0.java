package com.spotify.music.playlist.extender;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageButton;
import com.google.common.base.MoreObjects;
import com.spotify.encore.ViewProvider;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.extender.model.RecTrack;
import com.spotify.music.playlist.extender.v;

class d0 implements ViewProvider {
    private static final Keyframe[] s = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.75f), Keyframe.ofFloat(0.4f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)};
    private static final Keyframe[] t = {Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.15f, 1.0f), Keyframe.ofFloat(0.2f, 0.5f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)};
    private final Drawable a;
    private final Drawable b;
    private ValueAnimator c;
    private final c f;
    private v.a n;
    private View.OnClickListener o;
    private final b4<RecTrack> p;
    private final v.b q;
    private final x90 r;

    d0(x90 x90, c cVar, Drawable drawable, Drawable drawable2, b4<RecTrack> b4Var, v.b bVar) {
        this.r = x90;
        this.a = drawable;
        this.b = drawable2;
        this.f = cVar;
        this.p = b4Var;
        this.q = bVar;
        x90.z0(z42.g(getView().getContext()));
        ImageButton imageButton = (ImageButton) x90.W1();
        imageButton.setImageDrawable(drawable);
        imageButton.setContentDescription(imageButton.getContext().getString(C0707R.string.playlist_extended_tracks_add_to_playlist_content_description));
    }

    public void E(RecTrack recTrack, int i, boolean z, String str) {
        this.o = new j(this, recTrack, i);
        ((ImageButton) this.r.W1()).setOnClickListener(this.o);
        Context context = this.r.getView().getContext();
        this.r.setTitle(recTrack.getName());
        x90 x90 = this.r;
        String str2 = recTrack.getArtists().get(0).name;
        String str3 = recTrack.getAlbum().name;
        StringBuilder sb = new StringBuilder(16);
        if (!MoreObjects.isNullOrEmpty(str2)) {
            sb.append(str2);
        }
        if (!MoreObjects.isNullOrEmpty(str3)) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(str3);
        }
        x90.setSubtitle(sb.toString());
        this.r.setActive(recTrack.getUri().equals(str));
        this.r.getView().setEnabled(!z);
        this.r.getView().setOnClickListener(new l(this, i));
        this.r.getView().setOnLongClickListener(new k(this, context));
        this.r.getView().setTag(recTrack);
        this.r.getView().setTag(C0707R.id.context_menu_tag, new i42(this.p, recTrack));
        TextLabelUtil.b(context, this.r.getSubtitleView(), recTrack.isExplicit());
        TextLabelUtil.a(context, this.r.getSubtitleView(), recTrack.isTagged19plus());
        this.r.setAppearsDisabled(!recTrack.isCurrentlyPlayable());
        this.r.getView().setId(C0707R.id.extender_item);
    }

    public void I0() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
        ImageButton imageButton = (ImageButton) this.r.W1();
        imageButton.setImageDrawable(this.a);
        imageButton.setOnClickListener(this.o);
    }

    public void J(RecTrack recTrack, int i, View view) {
        if (this.n != null) {
            view.setOnClickListener(null);
            String uri = recTrack.getUri();
            ImageButton imageButton = (ImageButton) this.r.W1();
            Property property = View.SCALE_X;
            Keyframe[] keyframeArr = s;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageButton, PropertyValuesHolder.ofKeyframe(property, keyframeArr), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArr), PropertyValuesHolder.ofKeyframe(View.ALPHA, t));
            this.c = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(1000L);
            this.c.addUpdateListener(new b0(this, imageButton));
            this.c.addListener(new c0(this, imageButton, uri, i));
            this.c.start();
        }
    }

    public void J0(v.a aVar) {
        this.n = aVar;
    }

    public /* synthetic */ void W(int i, View view) {
        if (i != -1) {
            this.q.a(i);
        }
    }

    public /* synthetic */ boolean e0(Context context, View view) {
        Object tag = view.getTag(C0707R.id.context_menu_tag);
        if (tag == null) {
            return false;
        }
        ((i42) tag).a(context, this.f);
        return true;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.r.getView();
    }
}
