package com.spotify.music.libs.freetiertrackpreview.hubscomponentbinders;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.music.libs.freetiertrackpreview.b;
import com.spotify.music.libs.freetiertrackpreview.logging.c;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private LinearLayout e;
    private LinearLayout f;
    private final b<qfa> g;
    private final Picasso h;
    private final q i;
    private final com.spotify.music.libs.freetiertrackpreview.e j;
    private final c k;

    static final class a implements View.OnClickListener {
        final /* synthetic */ e a;
        final /* synthetic */ p81 b;

        a(e eVar, p81 p81) {
            this.a = eVar;
            this.b = p81;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.j.a();
            p81 p81 = this.b;
            if (p81 != null) {
                this.a.k.d(p81);
            }
        }
    }

    public e(b<qfa> bVar, Picasso picasso, q qVar, com.spotify.music.libs.freetiertrackpreview.e eVar, c cVar) {
        h.e(bVar, "accessoryViews");
        h.e(picasso, "picasso");
        h.e(qVar, "previewOverlay");
        h.e(eVar, "trackPreviewInfoDialog");
        h.e(cVar, "trackPreviewUserInteractionLogging");
        this.g = bVar;
        this.h = picasso;
        this.i = qVar;
        this.j = eVar;
        this.k = cVar;
    }

    public final void c(rfa rfa, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        h.e(rfa, AppProtocol.TrackData.TYPE_TRACK);
        h.e(onClickListener, "onHeartClickListener");
        h.e(onClickListener2, "onBannedClickListener");
        h.e(onClickListener3, "onContextMenuClickListener");
        List<View> b2 = this.g.b(rfa.f(), rfa.d(), new qfa(rfa.c(), rfa.b(), 0, null, null, 28), onClickListener, onClickListener2, onClickListener3);
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = ((ArrayList) b2).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                LinearLayout linearLayout2 = this.e;
                if (linearLayout2 != null) {
                    linearLayout2.addView(view);
                } else {
                    h.k("accessoryView");
                    throw null;
                }
            }
            return;
        }
        h.k("accessoryView");
        throw null;
    }

    public final void d(boolean z, Resources resources, Animation animation, Animation animation2, p81 p81) {
        h.e(resources, "resources");
        h.e(animation, "inAnimation");
        h.e(animation2, "outAnimation");
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            if (linearLayout.findViewWithTag("INFO_ICON_TAG") == null) {
                View c2 = this.g.c(new a(this, p81));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(C0707R.dimen.info_icon_size), (int) resources.getDimension(C0707R.dimen.info_icon_size));
                layoutParams.gravity = 16;
                c2.setTag("INFO_ICON_TAG");
                LinearLayout linearLayout2 = this.f;
                if (linearLayout2 != null) {
                    linearLayout2.addView(c2, layoutParams);
                } else {
                    h.k("infoLayout");
                    throw null;
                }
            }
            if (z) {
                LinearLayout linearLayout3 = this.f;
                if (linearLayout3 != null) {
                    linearLayout3.setLayoutAnimation(new LayoutAnimationController(animation, 0.0f));
                    LinearLayout linearLayout4 = this.f;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    } else {
                        h.k("infoLayout");
                        throw null;
                    }
                } else {
                    h.k("infoLayout");
                    throw null;
                }
            } else {
                LinearLayout linearLayout5 = this.f;
                if (linearLayout5 != null) {
                    linearLayout5.setLayoutAnimation(new LayoutAnimationController(animation2, 0.0f));
                    LinearLayout linearLayout6 = this.f;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                    } else {
                        h.k("infoLayout");
                        throw null;
                    }
                } else {
                    h.k("infoLayout");
                    throw null;
                }
            }
        } else {
            h.k("infoLayout");
            throw null;
        }
    }

    public final e e(View view, PreviewPage previewPage) {
        h.e(view, "view");
        h.e(previewPage, "page");
        View findViewById = view.findViewById(16908308);
        h.d(findViewById, "view.findViewById(android.R.id.text1)");
        this.b = (TextView) findViewById;
        View findViewById2 = view.findViewById(16908309);
        h.d(findViewById2, "view.findViewById(android.R.id.text2)");
        this.c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C0707R.id.accessory);
        h.d(findViewById3, "view.findViewById(R.id.accessory)");
        this.e = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(C0707R.id.track_preview_info);
        h.d(findViewById4, "view.findViewById(R.id.track_preview_info)");
        this.f = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(16908294);
        h.d(findViewById5, "view.findViewById(android.R.id.icon)");
        this.a = (ImageView) findViewById5;
        if (previewPage == PreviewPage.ARTIST) {
            View findViewById6 = view.findViewById(C0707R.id.track_row_number);
            h.d(findViewById6, "view.findViewById(R.id.track_row_number)");
            this.d = (TextView) findViewById6;
        }
        return this;
    }

    public final void f(String str, Context context, boolean z, boolean z2, rfa rfa) {
        h.e(context, "context");
        h.e(rfa, AppProtocol.TrackData.TYPE_TRACK);
        z l = this.h.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        l.t(yc0.o(context));
        ImageView imageView = this.a;
        if (imageView != null) {
            q qVar = this.i;
            String a2 = !z ? rfa.a() : "";
            l.o(t.d(imageView, qVar, a2, rfa.a() + rfa.c(), z2, false, 0));
            return;
        }
        h.k("imageView");
        throw null;
    }

    public final void g(String str, String str2, boolean z, Context context) {
        h.e(context, "context");
        TextView textView = this.c;
        if (textView != null) {
            textView.setText("");
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setText(str);
                TextView textView3 = this.c;
                if (textView3 != null) {
                    textView3.setText(str2);
                    TextView textView4 = this.c;
                    if (textView4 != null) {
                        TextLabelUtil.b(context, textView4, z);
                        String string = context.getString(C0707R.string.preview_track_preview_label);
                        h.d(string, "context.getString(R.stri…view_track_preview_label)");
                        TextView textView5 = this.c;
                        if (textView5 != null) {
                            TextLabelUtil.d(context, textView5, string);
                        } else {
                            h.k("labelsAndArtistNameTextView");
                            throw null;
                        }
                    } else {
                        h.k("labelsAndArtistNameTextView");
                        throw null;
                    }
                } else {
                    h.k("labelsAndArtistNameTextView");
                    throw null;
                }
            } else {
                h.k("songTitleTextView");
                throw null;
            }
        } else {
            h.k("labelsAndArtistNameTextView");
            throw null;
        }
    }

    public final void h(int i2) {
        if (i2 != -1) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                } else {
                    h.k("trackRowNumber");
                    throw null;
                }
            } else {
                h.k("trackRowNumber");
                throw null;
            }
        }
    }
}
