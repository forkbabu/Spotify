package com.spotify.music.lyrics.share.assetpicker.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment;
import com.spotify.music.lyrics.share.social.ui.LyricsShareSocialIconBar;
import com.spotify.player.model.ContextTrack;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class LyricsShareAssetPickerFragment extends BaseLyricsFullscreenFragment implements mfd, aeb {
    private ImageButton A0;
    public heb B0;
    public e C0;
    public jeb D0;
    private feb E0;
    private feb F0;
    private View v0;
    private TextView w0;
    private TextView x0;
    private RecyclerView y0;
    private LyricsShareSocialIconBar z0;

    /* access modifiers changed from: package-private */
    /* compiled from: java-style lambda group */
    public static final class a<T> implements qg0<Integer> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.qg0
        public final void accept(Integer num) {
            int i = this.a;
            if (i == 0) {
                Integer num2 = num;
                View d5 = LyricsShareAssetPickerFragment.d5((LyricsShareAssetPickerFragment) this.b);
                h.d(num2, "it");
                d5.setBackgroundColor(num2.intValue());
            } else if (i == 1) {
                Integer num3 = num;
                TextView g5 = LyricsShareAssetPickerFragment.g5((LyricsShareAssetPickerFragment) this.b);
                h.d(num3, "it");
                g5.setTextColor(num3.intValue());
                LyricsShareAssetPickerFragment.f5((LyricsShareAssetPickerFragment) this.b).setTextColor(num3.intValue());
            } else {
                throw null;
            }
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ LyricsShareAssetPickerFragment a;

        b(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment) {
            this.a = lyricsShareAssetPickerFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.M4();
        }
    }

    public static final /* synthetic */ View d5(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment) {
        View view = lyricsShareAssetPickerFragment.v0;
        if (view != null) {
            return view;
        }
        h.k("background");
        throw null;
    }

    public static final /* synthetic */ RecyclerView e5(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment) {
        RecyclerView recyclerView = lyricsShareAssetPickerFragment.y0;
        if (recyclerView != null) {
            return recyclerView;
        }
        h.k("recyclerView");
        throw null;
    }

    public static final /* synthetic */ TextView f5(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment) {
        TextView textView = lyricsShareAssetPickerFragment.x0;
        if (textView != null) {
            return textView;
        }
        h.k(ContextTrack.Metadata.KEY_SUBTITLE);
        throw null;
    }

    public static final /* synthetic */ TextView g5(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment) {
        TextView textView = lyricsShareAssetPickerFragment.w0;
        if (textView != null) {
            return textView;
        }
        h.k("title");
        throw null;
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public View b5() {
        LyricsShareSocialIconBar lyricsShareSocialIconBar = this.z0;
        if (lyricsShareSocialIconBar != null) {
            return lyricsShareSocialIconBar;
        }
        h.k("socialIconBar");
        throw null;
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public void c5() {
        heb heb = this.B0;
        if (heb != null) {
            heb.g();
        } else {
            h.k("assetPickerPresenter");
            throw null;
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.LYRICS_FULLSCREEN;
    }

    public void h5(qeb qeb) {
        h.e(qeb, "shareableData");
        peb peb = qeb.b().get(qeb.a());
        feb feb = this.E0;
        if (feb != null) {
            feb.b(peb.a(), new a(0, this));
            feb feb2 = this.F0;
            if (feb2 != null) {
                feb2.b(peb.e(), new a(1, this));
                LyricsShareSocialIconBar lyricsShareSocialIconBar = this.z0;
                if (lyricsShareSocialIconBar != null) {
                    lyricsShareSocialIconBar.setColor(peb.c());
                    jeb jeb = this.D0;
                    if (jeb != null) {
                        jeb.z();
                    } else {
                        h.k("lyricsShareAssetAdapter");
                        throw null;
                    }
                } else {
                    h.k("socialIconBar");
                    throw null;
                }
            } else {
                h.k("textColorTransitionHelper");
                throw null;
            }
        } else {
            h.k("bgColorTransitionHelper");
            throw null;
        }
    }

    public View i5() {
        View view = this.v0;
        if (view != null) {
            return view;
        }
        h.k("background");
        throw null;
    }

    public View j5(boolean z) {
        RecyclerView recyclerView = this.y0;
        View view = null;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                view = layoutManager.Q(0);
            }
            h.c(view);
            h.d(view, "recyclerView.layoutManag…?.findViewByPosition(0)!!");
            if (z || !(view instanceof AssetScaleView)) {
                return view;
            }
            View findViewById = view.findViewById(C0707R.id.cardContainer);
            h.d(findViewById, "assetView.findViewById(R.id.cardContainer)");
            return findViewById;
        }
        h.k("recyclerView");
        throw null;
    }

    public void k5() {
        TextView textView = this.x0;
        if (textView != null) {
            textView.setVisibility(4);
        } else {
            h.k(ContextTrack.Metadata.KEY_SUBTITLE);
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.lyrics_share_asset_picker_container, viewGroup, false);
        F2();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        View findViewById = inflate.findViewById(C0707R.id.background);
        h.d(findViewById, "view.findViewById(R.id.background)");
        this.v0 = findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.title);
        h.d(findViewById2, "view.findViewById(R.id.title)");
        this.w0 = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.subtitle);
        h.d(findViewById3, "view.findViewById(R.id.subtitle)");
        this.x0 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.recycler_view);
        h.d(findViewById4, "view.findViewById(R.id.recycler_view)");
        this.y0 = (RecyclerView) findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.socialBarIcon);
        h.d(findViewById5, "view.findViewById(R.id.socialBarIcon)");
        this.z0 = (LyricsShareSocialIconBar) findViewById5;
        View findViewById6 = inflate.findViewById(C0707R.id.close_button);
        h.d(findViewById6, "view.findViewById(R.id.close_button)");
        ImageButton imageButton = (ImageButton) findViewById6;
        this.A0 = imageButton;
        imageButton.setOnClickListener(new b(this));
        RecyclerView recyclerView = this.y0;
        if (recyclerView != null) {
            jeb jeb = this.D0;
            if (jeb != null) {
                recyclerView.setAdapter(jeb);
                RecyclerView recyclerView2 = this.y0;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(linearLayoutManager);
                    e eVar = this.C0;
                    if (eVar != null) {
                        h.e(eVar, "factory");
                        this.E0 = new feb(eVar);
                        e eVar2 = this.C0;
                        if (eVar2 != null) {
                            h.e(eVar2, "factory");
                            this.F0 = new feb(eVar2);
                            LyricsShareSocialIconBar lyricsShareSocialIconBar = this.z0;
                            if (lyricsShareSocialIconBar != null) {
                                heb heb = this.B0;
                                if (heb != null) {
                                    lyricsShareSocialIconBar.c(heb);
                                    Bundle D2 = D2();
                                    qeb qeb = D2 != null ? (qeb) D2.getParcelable("shareable_data") : null;
                                    if (qeb != null) {
                                        jeb jeb2 = this.D0;
                                        if (jeb2 != null) {
                                            qeb[] qebArr = {qeb};
                                            h.e(qebArr, "items");
                                            jeb2.c = d.R(qebArr);
                                            heb heb2 = this.B0;
                                            if (heb2 != null) {
                                                h.e(qeb, "<set-?>");
                                                heb2.b = qeb;
                                                h5(qeb);
                                            } else {
                                                h.k("assetPickerPresenter");
                                                throw null;
                                            }
                                        } else {
                                            h.k("lyricsShareAssetAdapter");
                                            throw null;
                                        }
                                    }
                                    LyricsShareSocialIconBar lyricsShareSocialIconBar2 = this.z0;
                                    if (lyricsShareSocialIconBar2 != null) {
                                        lyricsShareSocialIconBar2.d(qeb);
                                        h.d(inflate, "view");
                                        inflate.getViewTreeObserver().addOnPreDrawListener(new b(this, inflate));
                                        return inflate;
                                    }
                                    h.k("socialIconBar");
                                    throw null;
                                }
                                h.k("assetPickerPresenter");
                                throw null;
                            }
                            h.k("socialIconBar");
                            throw null;
                        }
                        h.k("colorTransitionHelperFactory");
                        throw null;
                    }
                    h.k("colorTransitionHelperFactory");
                    throw null;
                }
                h.k("recyclerView");
                throw null;
            }
            h.k("lyricsShareAssetAdapter");
            throw null;
        }
        h.k("recyclerView");
        throw null;
    }
}
