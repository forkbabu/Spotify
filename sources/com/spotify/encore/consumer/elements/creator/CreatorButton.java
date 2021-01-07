package com.spotify.encore.consumer.elements.creator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.creator.Creator;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class CreatorButton extends StateListAnimatorButton implements Creator {
    private SpotifyIconV2 currentIcon;
    private Drawable placeholderDrawable;
    private final CreatorButton$target$1 target;
    private ViewContext viewContext;

    public static final class ViewContext {
        private final Picasso picasso;

        public ViewContext(Picasso picasso2) {
            h.e(picasso2, "picasso");
            this.picasso = picasso2;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }
    }

    public CreatorButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public CreatorButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreatorButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final Drawable getPlaceholderDrawable(Context context, SpotifyIconV2 spotifyIconV2, float f) {
        if (this.currentIcon == spotifyIconV2) {
            Drawable drawable = this.placeholderDrawable;
            if (drawable != null) {
                return drawable;
            }
            h.k("placeholderDrawable");
            throw null;
        }
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, f);
        this.placeholderDrawable = spotifyIconDrawable;
        this.currentIcon = spotifyIconV2;
        if (spotifyIconDrawable != null) {
            return spotifyIconDrawable;
        }
        h.k("placeholderDrawable");
        throw null;
    }

    private final Uri getUri(String str) {
        if (str == null || str.length() == 0) {
            Uri uri = Uri.EMPTY;
            h.d(uri, "Uri.EMPTY");
            return uri;
        }
        Uri parse = Uri.parse(str);
        h.d(parse, "Uri.parse(authorUri)");
        return parse;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void loadAuthorImage(Creator.Model model) {
        Context context = getContext();
        h.d(context, "context");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.encore_creator_button_image_size);
        Creator.ImageData authorImage = model.getAuthorImage();
        Context context2 = getContext();
        h.d(context2, "context");
        Drawable placeholderDrawable2 = getPlaceholderDrawable(context2, model.getAuthorImagePlaceholder(), (float) dimensionPixelOffset);
        if (authorImage.getUri() != null) {
            ViewContext viewContext2 = this.viewContext;
            if (viewContext2 != null) {
                z l = viewContext2.getPicasso().l(getUri(authorImage.getUri()));
                l.t(placeholderDrawable2);
                l.u(dimensionPixelOffset, dimensionPixelOffset);
                l.x(new cwd());
                l.w(Integer.valueOf(authorImage.getTag()));
                l.o(this.target);
                return;
            }
            h.k("viewContext");
            throw null;
        }
        c.h(this, placeholderDrawable2, null, null, null);
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super kotlin.f, kotlin.f> nmf) {
        h.e(nmf, "event");
        setOnClickListener(new CreatorButton$onEvent$1(nmf));
    }

    public final void setViewContext(ViewContext viewContext2) {
        h.e(viewContext2, "viewContext");
        this.viewContext = viewContext2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.target = new CreatorButton$target$1(this);
    }

    public void render(Creator.Model model) {
        h.e(model, "model");
        if (!q4.w(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new CreatorButton$render$$inlined$doOnLayout$1(this, model));
            return;
        }
        setText(CreatorAuthorsFormatterKt.format(model.getAuthorNames(), (float) getWidth(), new CreatorButton$render$1$1(getPaint())));
        if (model.getAuthorNames().size() == 1) {
            setClickable(true);
            loadAuthorImage(model);
            return;
        }
        setClickable(false);
        c.h(this, null, null, null, null);
    }
}
