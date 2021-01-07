package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* renamed from: vr8  reason: default package */
public final class vr8 implements ur8 {
    private final zr8 a;
    private int b;
    private int c;
    private boolean f;
    private boolean n;
    private final dwd o;
    private final f0 p;
    private final DurationFormatter q;
    private final mt8 r;

    /* renamed from: vr8$a */
    public static final class a implements f0 {
        final /* synthetic */ vr8 a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(vr8 vr8) {
            this.a = vr8;
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapFailed(Exception exc, Drawable drawable) {
            h.e(drawable, "errorDrawable");
            this.a.f = true;
            if (this.a.b != 0 && this.a.c != 0) {
                this.a.a.b(this.a.b, this.a.c);
            }
        }

        @Override // com.squareup.picasso.f0
        public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            h.e(bitmap, "bitmap");
            h.e(loadedFrom, "from");
            MoreObjects.checkArgument(!bitmap.isRecycled());
            boolean z = loadedFrom != Picasso.LoadedFrom.MEMORY;
            zr8 zr8 = this.a.a;
            zr8.c(bitmap, z);
            zr8.b(-14145496, 872415231);
            MoreObjects.checkArgument(!bitmap.isRecycled());
        }

        @Override // com.squareup.picasso.f0
        public void onPrepareLoad(Drawable drawable) {
        }
    }

    /* renamed from: vr8$b */
    public static final class b extends dwd {
        final /* synthetic */ vr8 b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(vr8 vr8) {
            this.b = vr8;
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            this.b.b = i;
            int i2 = 855638016;
            float c = ovd.c(855638016, i);
            float c2 = ovd.c(872415231, i);
            vr8 vr8 = this.b;
            if (c <= c2) {
                i2 = 872415231;
            }
            vr8.c = i2;
            this.b.b = i;
            if (this.b.f || this.b.n) {
                this.b.a.b(i, this.b.c);
            }
        }
    }

    public vr8(ViewGroup viewGroup, DurationFormatter durationFormatter, mt8 mt8) {
        h.e(viewGroup, "root");
        h.e(durationFormatter, "durationFormatter");
        h.e(mt8, "dateFormatter");
        this.q = durationFormatter;
        this.r = mt8;
        h.e(viewGroup, "parent");
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.topic_episode_image_card_description, viewGroup, false);
        if (inflate != null) {
            TextPaint paint = ((TextView) inflate).getPaint();
            h.d(context, "context");
            this.a = new zr8(viewGroup, new ipc(context, paint, context.getResources().getDimensionPixelSize(C0707R.dimen.episode_card_text_offset)));
            getView().setTag(C0707R.id.glue_viewholder_tag, this);
            this.o = new b(this);
            this.p = new a(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    private final String e0(int i) {
        String a2 = this.q.a(DurationFormatter.Format.LONG_HOUR_AND_MINUTE, i);
        h.d(a2, "durationFormatter\n      …    seconds\n            )");
        Locale locale = Locale.ROOT;
        h.d(locale, "Locale.ROOT");
        String lowerCase = a2.toLowerCase(locale);
        h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // defpackage.ur8
    public dwd E0() {
        return this.o;
    }

    @Override // defpackage.ur8
    public ImageView M0() {
        return this.a.M0();
    }

    @Override // defpackage.ur8
    public f0 M1() {
        return this.p;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a.getView();
    }

    @Override // defpackage.ur8
    public void l1(boolean z) {
        this.n = z;
    }

    @Override // defpackage.ur8
    public void setOnClickListener(View.OnClickListener onClickListener) {
        h.e(onClickListener, "listener");
        this.a.getView().setOnClickListener(onClickListener);
    }

    @Override // defpackage.ur8
    public void v2(String str, String str2, String str3, int i, int i2) {
        String str4;
        je.x(str, "title", str2, "description", str3, "showName");
        this.a.reset();
        this.a.setTitle(str);
        this.a.n(str2);
        this.a.setSubtitle(str3);
        if (i2 > 0 && i > 0) {
            str4 = this.r.a(i2) + " • " + e0(i);
        } else if (i2 > 0) {
            str4 = this.r.a(i2);
        } else {
            str4 = i > 0 ? e0(i) : "";
        }
        this.a.d(str4);
    }
}
