package com.spotify.encore.consumer.elements.artwork;

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
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.artwork.Placeholder;
import com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.spotify.libs.facepile.e;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageView;
import com.squareup.picasso.Picasso;
import kotlin.f;

public class ArtworkView extends StateListAnimatorImageView implements Artwork {
    private static final int[] DEFAULT_STATE = new int[0];
    private static final int DISABLED_OVERLAY_ALPHA = 128;
    private static final int[] DISABLE_STATE = {-16842910};
    private SpotifyIconV2 mCurrentIcon;
    private final ColorDrawable mDisabledOverlay;
    private int mExtractedColor;
    ColorCallback mPicassoCallback;
    private final ColorDrawable mPlaceholderBackground;
    private Drawable mPlaceholderDrawable;
    private final int mPlaceholderInset;
    private final float mPlaceholderInsetRatio;
    private RoundedCornerTreatment mRoundedCornerTreatment;
    private ViewContext mViewContext;

    public static final class ViewContext {
        Picasso mPicasso;

        public ViewContext(Picasso picasso) {
            this.mPicasso = picasso;
        }
    }

    public ArtworkView(Context context) {
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

    private int calculateInset() {
        if (((double) this.mPlaceholderInsetRatio) >= 1.0d || getCoverArtSize() <= 0) {
            return this.mPlaceholderInset;
        }
        return (((int) (((float) getCoverArtSize()) * this.mPlaceholderInsetRatio)) / 2) + this.mPlaceholderInset;
    }

    private Drawable createPlaceholderDrawable(Context context, SpotifyIconV2 spotifyIconV2, int i, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, (float) (i - (i2 * 2)));
        spotifyIconDrawable.s(a.c(context, R.color.encore_placeholder_icon));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.mPlaceholderBackground, spotifyIconDrawable});
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    private int getCoverArtSize() {
        return getLayoutParams().width <= 0 ? getWidth() : getLayoutParams().width;
    }

    private Drawable getPlaceholderDrawable(Placeholder placeholder) {
        if (placeholder instanceof Placeholder.SpotifyIconPlaceholder) {
            return getPlaceholderDrawable(getContext(), ((Placeholder.SpotifyIconPlaceholder) placeholder).getIcon(), getCoverArtSize(), calculateInset());
        }
        if (placeholder instanceof Placeholder.UserPlaceholder) {
            Placeholder.UserPlaceholder userPlaceholder = (Placeholder.UserPlaceholder) placeholder;
            return new e(getContext(), userPlaceholder.getUserInitials(), userPlaceholder.getUserColor());
        }
        Assertion.g("Unkown placeholder");
        return new ColorDrawable(a.b(getContext(), com.spotify.encore.foundation.R.color.gray_15));
    }

    private static Uri getUri(String str) {
        return TextUtils.isEmpty(str) ? Uri.EMPTY : Uri.parse(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0081  */
    /* renamed from: loadCoverArt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.spotify.encore.consumer.elements.artwork.Artwork.Model r5) {
        /*
            r4 = this;
            boolean r0 = needsCircle(r5)
            if (r0 == 0) goto L_0x000f
            int r0 = r4.getCoverArtSize()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x000d:
            float r0 = r0 / r1
            goto L_0x001e
        L_0x000f:
            boolean r0 = needsRoundedCorners(r5)
            if (r0 == 0) goto L_0x001d
            int r0 = r4.getCoverArtSize()
            float r0 = (float) r0
            r1 = 1094713344(0x41400000, float:12.0)
            goto L_0x000d
        L_0x001d:
            r0 = 0
        L_0x001e:
            com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment r1 = r4.mRoundedCornerTreatment
            if (r1 == 0) goto L_0x002a
            float r1 = r1.getCornerRadius()
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
        L_0x002a:
            com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment r0 = com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment.create(r4, r0)
            r4.mRoundedCornerTreatment = r0
            int r1 = r4.getWidth()
            int r2 = r4.getHeight()
            r0.onSizeChanged(r1, r2)
        L_0x003b:
            com.spotify.encore.consumer.elements.artwork.Placeholder r0 = r5.getPlaceholder$libs_encore_consumer_elements()
            android.graphics.drawable.Drawable r0 = r4.getPlaceholderDrawable(r0)
            com.spotify.encore.consumer.elements.artwork.Artwork$ImageData r1 = r5.getImageData()
            java.lang.String r2 = r1.getUri()
            if (r2 == 0) goto L_0x0081
            com.spotify.encore.consumer.elements.artwork.ArtworkView$ViewContext r2 = r4.mViewContext
            com.squareup.picasso.Picasso r2 = r2.mPicasso
            java.lang.String r3 = r1.getUri()
            android.net.Uri r3 = getUri(r3)
            com.squareup.picasso.z r2 = r2.l(r3)
            r2.t(r0)
            int r0 = r1.getTag()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.w(r0)
            boolean r5 = r5.getShouldExtractColor()
            if (r5 == 0) goto L_0x007b
            com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback r5 = r4.mPicassoCallback
            com.squareup.picasso.f0 r5 = com.spotify.encore.mobile.utils.picassocolorextractor.SpotifyPicassoTargetProviderKt.providesTargetWithColor(r4, r5)
            r2.o(r5)
            goto L_0x0084
        L_0x007b:
            com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback r5 = r4.mPicassoCallback
            r2.n(r4, r5)
            goto L_0x0084
        L_0x0081:
            r4.setImageDrawable(r0)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.consumer.elements.artwork.ArtworkView.a(com.spotify.encore.consumer.elements.artwork.Artwork$Model):void");
    }

    private static boolean needsCircle(Artwork.Model model) {
        return (model instanceof Artwork.Model.Artist) || (model instanceof Artwork.Model.User) || (model instanceof Artwork.Model.ArtistCollection) || (model instanceof Artwork.Model.ArtistSearch);
    }

    private static boolean needsRoundedCorners(Artwork.Model model) {
        return (model instanceof Artwork.Model.Episode) || (model instanceof Artwork.Model.Show);
    }

    public int getExtractedColor() {
        return this.mExtractedColor;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mRoundedCornerTreatment.onPreDraw(canvas);
        super.onDraw(canvas);
        this.mRoundedCornerTreatment.onPostDraw(canvas);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(final nmf<? super Artwork.Events, f> nmf) {
        this.mPicassoCallback = new ColorCallback() {
            /* class com.spotify.encore.consumer.elements.artwork.ArtworkView.AnonymousClass1 */

            @Override // com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback
            public void onColorExtracted(int i) {
                ArtworkView.this.mExtractedColor = i;
                nmf.invoke(Artwork.Events.ArtworkColorExtractionComplete);
            }

            @Override // com.squareup.picasso.g.a, com.squareup.picasso.g
            public void onError(Exception exc) {
                nmf.invoke(Artwork.Events.ArtworkFetchError);
            }

            @Override // com.squareup.picasso.g.a, com.squareup.picasso.g
            public void onSuccess() {
                nmf.invoke(Artwork.Events.ArtworkFetchComplete);
            }
        };
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

    public ArtworkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void render(Artwork.Model model) {
        if ((getLayoutParams() == null || getLayoutParams().width <= 0) && getWidth() == 0) {
            post(new a(this, model));
        } else {
            a(model);
        }
    }

    public ArtworkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mExtractedColor = -1;
        ColorDrawable colorDrawable = new ColorDrawable(a.b(getContext(), com.spotify.encore.foundation.R.color.gray_7));
        this.mDisabledOverlay = colorDrawable;
        colorDrawable.setAlpha(DISABLED_OVERLAY_ALPHA);
        ColorStateList c = a.c(context, R.color.encore_placeholder_background);
        ColorDrawable colorDrawable2 = new ColorDrawable(a.b(context, com.spotify.encore.foundation.R.color.gray_15));
        this.mPlaceholderBackground = colorDrawable2;
        androidx.core.graphics.drawable.a.i(colorDrawable2, c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoverArtView, i, 0);
        this.mPlaceholderInset = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CoverArtView_iconInset, 0);
        this.mPlaceholderInsetRatio = obtainStyledAttributes.getFloat(R.styleable.CoverArtView_iconInsetRatio, 1.0f);
        this.mRoundedCornerTreatment = RoundedCornerTreatment.create(this, 0.0f);
        obtainStyledAttributes.recycle();
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
}
