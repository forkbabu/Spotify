package com.spotify.music.nowplaying.scroll.widgets.upnext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.scroll.widgets.upnext.k;
import com.spotify.paste.graphics.drawable.e;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;
import kotlin.jvm.internal.h;

public final class UpNextWidgetView extends FrameLayout implements fqd, k {
    private f4c a;
    private LinearLayout b;
    private k.a c;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                k.a aVar = ((UpNextWidgetView) this.b).c;
                if (aVar != null) {
                    aVar.a();
                }
            } else if (i == 1) {
                k.a aVar2 = ((UpNextWidgetView) this.b).c;
                if (aVar2 != null) {
                    aVar2.a();
                }
            } else {
                throw null;
            }
        }
    }

    /* compiled from: java-style lambda group */
    static final class b implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public b(int i, Object obj, Object obj2) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                k.a aVar = ((UpNextWidgetView) this.c).c;
                if (aVar != null) {
                    aVar.c((a) this.b);
                }
            } else if (i == 1) {
                k.a aVar2 = ((UpNextWidgetView) this.c).c;
                if (aVar2 != null) {
                    aVar2.b((a) this.b);
                }
            } else {
                throw null;
            }
        }
    }

    static final class c implements View.OnLongClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ UpNextWidgetView b;

        c(a aVar, UpNextWidgetView upNextWidgetView) {
            this.a = aVar;
            this.b = upNextWidgetView;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            k.a aVar = this.b.c;
            if (aVar == null) {
                return true;
            }
            aVar.b(this.a);
            return true;
        }
    }

    public UpNextWidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.upnext.k
    public void a(List<a> list) {
        h.e(list, "trackList");
        LinearLayout linearLayout = this.b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            for (T t : list) {
                f4c f4c = this.a;
                if (f4c != null) {
                    LinearLayout linearLayout2 = this.b;
                    if (linearLayout2 != null) {
                        y90 a2 = f4c.a(linearLayout2, t);
                        a2.getView().setOnClickListener(new b(0, t, this));
                        a2.getView().setOnLongClickListener(new c(t, this));
                        a2.W1().setOnClickListener(new b(1, t, this));
                        LinearLayout linearLayout3 = this.b;
                        if (linearLayout3 != null) {
                            View view = a2.getView();
                            LinearLayout linearLayout4 = this.b;
                            if (linearLayout4 != null) {
                                linearLayout3.addView(view, linearLayout4.getChildCount());
                            } else {
                                h.k("trackContainer");
                                throw null;
                            }
                        } else {
                            h.k("trackContainer");
                            throw null;
                        }
                    } else {
                        h.k("trackContainer");
                        throw null;
                    }
                } else {
                    h.k("transformer");
                    throw null;
                }
            }
            if (this.a != null) {
                LinearLayout linearLayout5 = this.b;
                if (linearLayout5 != null) {
                    h.e(linearLayout5, "parent");
                    Context context = linearLayout5.getContext();
                    int b2 = androidx.core.content.a.b(context, C0707R.color.rowAccessory);
                    int dimensionPixelSize = linearLayout5.getResources().getDimensionPixelSize(C0707R.dimen.row_icon_size);
                    u90 d = e90.d().d(context, linearLayout5);
                    String string = context.getString(C0707R.string.scroll_widget_up_next_go_to_queue_btn);
                    h.d(string, "context.getString(UpNext…_up_next_go_to_queue_btn)");
                    d.z0(z42.j(context, SpotifyIconV2.CHEVRON_RIGHT, new svd(context).a(b2)));
                    d.setText(string);
                    SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.QUEUE, (float) dimensionPixelSize);
                    spotifyIconDrawable.r(b2);
                    d.getImageView().setImageDrawable(new e(spotifyIconDrawable, 0.5f, 0));
                    h.d(d, "rowView.apply {\n        …etIconDrawable)\n        }");
                    d.getView().setOnClickListener(new a(0, this));
                    d.W1().setOnClickListener(new a(1, this));
                    LinearLayout linearLayout6 = this.b;
                    if (linearLayout6 != null) {
                        View view2 = d.getView();
                        LinearLayout linearLayout7 = this.b;
                        if (linearLayout7 != null) {
                            linearLayout6.addView(view2, linearLayout7.getChildCount());
                        } else {
                            h.k("trackContainer");
                            throw null;
                        }
                    } else {
                        h.k("trackContainer");
                        throw null;
                    }
                } else {
                    h.k("trackContainer");
                    throw null;
                }
            } else {
                h.k("transformer");
                throw null;
            }
        } else {
            h.k("trackContainer");
            throw null;
        }
    }

    public final void c(f4c f4c) {
        h.e(f4c, "trackToRowViewTransformer");
        this.a = f4c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0707R.id.scroll_widget_track_container);
        h.d(findViewById, "findViewById(R.id.scroll_widget_track_container)");
        this.b = (LinearLayout) findViewById;
    }

    @Override // defpackage.fqd
    public void setColor(int i) {
        Drawable background = getBackground();
        if (background != null) {
            ((GradientDrawable) background).setColor(i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.upnext.k
    public void setTrackRowEventListener(k.a aVar) {
        this.c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpNextWidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
    }
}
