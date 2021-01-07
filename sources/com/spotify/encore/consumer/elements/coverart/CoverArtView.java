package com.spotify.encore.consumer.elements.coverart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.coverart.CoverArt;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.f;

@Deprecated
public class CoverArtView extends StateListAnimatorImageView implements CoverArt {
    private static final int[] DEFAULT_STATE = new int[0];
    private static final int DISABLED_OVERLAY_ALPHA = 128;
    private static final int[] DISABLE_STATE = {-16842910};
    private SpotifyIconV2 mCurrentIcon;
    private final ColorDrawable mDisabledOverlay;
    private final ColorDrawable mPlaceholderBackground;
    private Drawable mPlaceholderDrawable;
    private final int mPlaceholderInset;
    private final RoundedCornerTreatment mRoundedCornerTreatment;
    private ViewContext mViewContext;

    public static final class ViewContext {
        Picasso mPicasso;

        public ViewContext(Picasso picasso) {
            this.mPicasso = picasso;
        }
    }

    public CoverArtView(Context context) {
        this(context, null);
    }

    private Drawable addDisableOverlay(Drawable drawable) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, this.mDisabledOverlay});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(DISABLE_STATE, layerDrawable);
        stateListDrawable.addState(DEFAULT_STATE, drawable);
        return stateListDrawable;
    }

    private Drawable applyDisableState(Drawable drawable) {
        return (drawable == null || drawable.isStateful() || Build.VERSION.SDK_INT < 21) ? drawable : addDisableOverlay(drawable);
    }

    private Drawable createPlaceholderDrawable(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) (i - (i2 * 2)));
        spotifyIconDrawable.s(a.c(context, R.color.encore_placeholder_icon));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.mPlaceholderBackground, spotifyIconDrawable});
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    private int getCoverArtSize() {
        return getLayoutParams().width < 0 ? getWidth() : getLayoutParams().width;
    }

    private Drawable getPlaceholderDrawable(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        if (this.mCurrentIcon == spotifyIconV2) {
            return this.mPlaceholderDrawable;
        }
        Drawable createPlaceholderDrawable = createPlaceholderDrawable(context, spotifyIconV2, i, i2);
        this.mPlaceholderDrawable = createPlaceholderDrawable;
        this.mCurrentIcon = spotifyIconV2;
        return createPlaceholderDrawable;
    }

    private static Uri getUri(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: loadCoverArt */
    public void a(CoverArt.Model model) {
        Drawable placeholderDrawable = getPlaceholderDrawable(getContext(), model.placeholder(), getCoverArtSize(), this.mPlaceholderInset);
        CoverArt.ImageData data = model.data();
        if (data.uri() != null) {
            z l = this.mViewContext.mPicasso.l(getUri(data.uri()));
            l.t(placeholderDrawable);
            l.w(Integer.valueOf(data.tag()));
            l.m(this);
            return;
        }
        setImageDrawable(placeholderDrawable);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mRoundedCornerTreatment.onPreDraw(canvas);
        super.onDraw(canvas);
        this.mRoundedCornerTreatment.onPostDraw(canvas);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Void, f> nmf) {
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mRoundedCornerTreatment.onSizeChanged(i, i2);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(applyDisableState(drawable));
    }

    public void setViewContext(ViewContext viewContext) {
        this.mViewContext = viewContext;
    }

    public CoverArtView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void render(CoverArt.Model model) {
        if ((getLayoutParams() == null || getLayoutParams().width < 0) && getWidth() == 0) {
            post(new a(this, model));
        } else {
            a(model);
        }
    }

    public CoverArtView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorDrawable colorDrawable = new ColorDrawable(a.b(getContext(), com.spotify.encore.foundation.R.color.gray_7));
        this.mDisabledOverlay = colorDrawable;
        colorDrawable.setAlpha(DISABLED_OVERLAY_ALPHA);
        ColorStateList c = a.c(context, R.color.encore_placeholder_background);
        ColorDrawable colorDrawable2 = new ColorDrawable(a.b(context, com.spotify.encore.foundation.R.color.gray_15));
        this.mPlaceholderBackground = colorDrawable2;
        androidx.core.graphics.drawable.a.i(colorDrawable2, c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoverArtView, i, 0);
        this.mPlaceholderInset = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CoverArtView_iconInset, 0);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CoverArtView_cornerRadius, 0.0f);
        obtainStyledAttributes.recycle();
        this.mRoundedCornerTreatment = RoundedCornerTreatment.create(this, dimension);
    }
}
