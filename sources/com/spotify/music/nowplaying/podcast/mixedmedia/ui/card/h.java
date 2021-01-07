package com.spotify.music.nowplaying.podcast.mixedmedia.ui.card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.SquareImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public final class h implements g {
    private View a;
    private View b;
    private View c;
    private SquareImageView d;
    private TextView e;
    private TextView f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private Drawable j;
    private g1c k;
    private com.spotify.music.nowplaying.podcast.mixedmedia.model.b l;
    private int m = -1;
    private final Picasso n;
    private final h1c o;
    private final y0c p;
    private final a q;

    static final class a implements View.OnClickListener {
        final /* synthetic */ h a;
        final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a b;

        a(h hVar, com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.q.b(this.b);
        }
    }

    public static final class b implements z0c {
        final /* synthetic */ h a;

        b(h hVar, com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
            this.a = hVar;
        }

        @Override // defpackage.z0c
        public void a() {
            this.a.p.o();
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ h a;
        final /* synthetic */ com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a b;

        c(h hVar, com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
            this.a = hVar;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.q.a(this.b);
        }
    }

    public h(Picasso picasso, h1c h1c, y0c y0c, a aVar) {
        kotlin.jvm.internal.h.e(picasso, "picasso");
        kotlin.jvm.internal.h.e(h1c, "likeButtonPresenterFactory");
        kotlin.jvm.internal.h.e(y0c, "cardLogger");
        kotlin.jvm.internal.h.e(aVar, "navigator");
        this.n = picasso;
        this.o = h1c;
        this.p = y0c;
        this.q = aVar;
    }

    private final void f(com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
        if (aVar.a().a() != this.m) {
            this.m = aVar.a().a();
            this.p.t();
        }
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g
    public void a(View view) {
        kotlin.jvm.internal.h.e(view, "rootView");
        this.a = view;
        Drawable o2 = yc0.o(view.getContext());
        kotlin.jvm.internal.h.d(o2, "Placeholders.createSmall…eholder(rootView.context)");
        this.j = o2;
        View findViewById = view.findViewById(C0707R.id.npv_current_track_music);
        kotlin.jvm.internal.h.d(findViewById, "rootView.findViewById(R.….npv_current_track_music)");
        this.b = findViewById;
        View findViewById2 = view.findViewById(C0707R.id.npv_current_track_talk);
        kotlin.jvm.internal.h.d(findViewById2, "rootView.findViewById(R.id.npv_current_track_talk)");
        this.c = findViewById2;
        View view2 = this.b;
        if (view2 != null) {
            View findViewById3 = view2.findViewById(C0707R.id.npv_track_music_card_image);
            kotlin.jvm.internal.h.d(findViewById3, "musicCardLayout.findView…v_track_music_card_image)");
            this.d = (SquareImageView) findViewById3;
            View view3 = this.b;
            if (view3 != null) {
                View findViewById4 = view3.findViewById(C0707R.id.npv_track_music_card_title);
                ((TextView) findViewById4).setSelected(true);
                kotlin.jvm.internal.h.d(findViewById4, "musicCardLayout.findView…ply { isSelected = true }");
                this.e = (TextView) findViewById4;
                View view4 = this.b;
                if (view4 != null) {
                    View findViewById5 = view4.findViewById(C0707R.id.npv_track_music_card_subtitle);
                    kotlin.jvm.internal.h.d(findViewById5, "musicCardLayout.findView…rack_music_card_subtitle)");
                    this.f = (TextView) findViewById5;
                    View view5 = this.b;
                    if (view5 != null) {
                        View findViewById6 = view5.findViewById(C0707R.id.npv_track_music_card_like);
                        kotlin.jvm.internal.h.d(findViewById6, "musicCardLayout.findView…pv_track_music_card_like)");
                        this.g = (ImageView) findViewById6;
                        View view6 = this.c;
                        if (view6 != null) {
                            View findViewById7 = view6.findViewById(C0707R.id.npv_track_talk_card_title);
                            ((TextView) findViewById7).setSelected(true);
                            kotlin.jvm.internal.h.d(findViewById7, "talkCardLayout.findViewB…ply { isSelected = true }");
                            this.h = (TextView) findViewById7;
                            View view7 = this.c;
                            if (view7 != null) {
                                View findViewById8 = view7.findViewById(C0707R.id.npv_track_talk_card_subtitle);
                                kotlin.jvm.internal.h.d(findViewById8, "talkCardLayout.findViewB…track_talk_card_subtitle)");
                                this.i = (TextView) findViewById8;
                                h1c h1c = this.o;
                                ImageView imageView = this.g;
                                if (imageView != null) {
                                    g1c b2 = h1c.b(C0707R.dimen.mme_track_card_icon_size, null, true, imageView);
                                    kotlin.jvm.internal.h.d(b2, "likeButtonPresenterFacto…  musicLikeView\n        )");
                                    this.k = b2;
                                    return;
                                }
                                kotlin.jvm.internal.h.k("musicLikeView");
                                throw null;
                            }
                            kotlin.jvm.internal.h.k("talkCardLayout");
                            throw null;
                        }
                        kotlin.jvm.internal.h.k("talkCardLayout");
                        throw null;
                    }
                    kotlin.jvm.internal.h.k("musicCardLayout");
                    throw null;
                }
                kotlin.jvm.internal.h.k("musicCardLayout");
                throw null;
            }
            kotlin.jvm.internal.h.k("musicCardLayout");
            throw null;
        }
        kotlin.jvm.internal.h.k("musicCardLayout");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g
    public void b(com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
        kotlin.jvm.internal.h.e(aVar, "model");
        f(aVar);
        com.spotify.music.nowplaying.podcast.mixedmedia.model.b b2 = aVar.a().b();
        if (!kotlin.jvm.internal.h.a(b2, this.l)) {
            TextView textView = this.h;
            if (textView != null) {
                textView.setText(iyb.e(b2));
                TextView textView2 = this.i;
                if (textView2 != null) {
                    View view = this.a;
                    if (view != null) {
                        Context context = view.getContext();
                        kotlin.jvm.internal.h.d(context, "rootView.context");
                        textView2.setText(iyb.d(b2, context));
                        View view2 = this.b;
                        if (view2 != null) {
                            view2.setVisibility(8);
                            TextView textView3 = this.i;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                                View view3 = this.c;
                                if (view3 != null) {
                                    view3.setVisibility(0);
                                    ImageView imageView = this.g;
                                    if (imageView != null) {
                                        imageView.setVisibility(8);
                                        TextView textView4 = this.i;
                                        if (textView4 != null) {
                                            textView4.setOnClickListener(new c(this, aVar));
                                        } else {
                                            kotlin.jvm.internal.h.k("talkSubtitleView");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.h.k("musicLikeView");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.h.k("talkCardLayout");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.h.k("talkSubtitleView");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.h.k("musicCardLayout");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.h.k("rootView");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.h.k("talkSubtitleView");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.h.k("talkTitleView");
                throw null;
            }
        }
        this.l = b2;
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.ui.card.g
    public void c(com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist.a aVar) {
        kotlin.jvm.internal.h.e(aVar, "model");
        f(aVar);
        com.spotify.music.nowplaying.podcast.mixedmedia.model.b b2 = aVar.a().b();
        if (!kotlin.jvm.internal.h.a(b2, this.l)) {
            View view = this.c;
            if (view != null) {
                view.setVisibility(8);
                z m2 = this.n.m(iyb.b(b2));
                Drawable drawable = this.j;
                if (drawable != null) {
                    m2.t(drawable);
                    Drawable drawable2 = this.j;
                    if (drawable2 != null) {
                        m2.g(drawable2);
                        SquareImageView squareImageView = this.d;
                        if (squareImageView != null) {
                            m2.n(squareImageView, null);
                            TextView textView = this.e;
                            if (textView != null) {
                                textView.setText(iyb.e(b2));
                                TextView textView2 = this.f;
                                if (textView2 != null) {
                                    View view2 = this.a;
                                    if (view2 != null) {
                                        Context context = view2.getContext();
                                        kotlin.jvm.internal.h.d(context, "rootView.context");
                                        textView2.setText(iyb.d(b2, context));
                                        View view3 = this.b;
                                        if (view3 != null) {
                                            view3.setVisibility(0);
                                            ImageView imageView = this.g;
                                            if (imageView != null) {
                                                imageView.setVisibility(0);
                                                TextView textView3 = this.f;
                                                if (textView3 != null) {
                                                    textView3.setOnClickListener(new a(this, aVar));
                                                } else {
                                                    kotlin.jvm.internal.h.k("musicSubtitleView");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.h.k("musicLikeView");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.h.k("musicCardLayout");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.h.k("rootView");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.h.k("musicSubtitleView");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.h.k("musicTitleView");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.h.k("musicImageView");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.h.k("musicPlaceHolderDrawable");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.h.k("musicPlaceHolderDrawable");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.h.k("talkCardLayout");
                throw null;
            }
        }
        g1c g1c = this.k;
        if (g1c != null) {
            g1c.c(aVar, b2.i(), b2.n(), b2.e().toString(), new b(this, aVar));
            this.l = b2;
            return;
        }
        kotlin.jvm.internal.h.k("likeButtonPresenter");
        throw null;
    }
}
