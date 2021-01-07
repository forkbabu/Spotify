package com.spotify.music.lyrics.share.selection.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.contract.b;
import com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment;
import com.spotify.music.lyrics.core.experience.model.Lyrics;
import kotlin.jvm.internal.h;

public final class SelectionFragment extends BaseLyricsFullscreenFragment implements mfd, a {
    public veb A0;
    public com.spotify.music.lyrics.core.experience.contract.a B0;
    public zeb C0;
    private View v0;
    private TextView w0;
    private b x0;
    private Button y0;
    private ImageButton z0;

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
                SelectionFragment selectionFragment = (SelectionFragment) this.b;
                veb veb = selectionFragment.A0;
                if (veb != null) {
                    Context l4 = selectionFragment.l4();
                    h.d(l4, "requireContext()");
                    veb.c(l4);
                    return;
                }
                h.k("selectionPresenter");
                throw null;
            } else if (i == 1) {
                ((SelectionFragment) this.b).M4();
            } else {
                throw null;
            }
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment, com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        veb veb = this.A0;
        if (veb != null) {
            veb.a();
        } else {
            h.k("selectionPresenter");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.share.selection.ui.a
    public void W1(boolean z) {
        Button button = this.y0;
        if (button != null) {
            button.setEnabled(z);
        } else {
            h.k("shareButton");
            throw null;
        }
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public View b5() {
        Button button = this.y0;
        if (button != null) {
            return button;
        }
        h.k("shareButton");
        throw null;
    }

    @Override // com.spotify.music.lyrics.core.experience.fullscreen.BaseLyricsFullscreenFragment
    public void c5() {
        veb veb = this.A0;
        if (veb != null) {
            veb.b();
        } else {
            h.k("selectionPresenter");
            throw null;
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.LYRICS_FULLSCREEN;
    }

    @Override // com.spotify.music.lyrics.share.selection.ui.a
    public void o2(int i, int i2) {
        TextView textView = this.w0;
        if (textView != null) {
            textView.setText(R2().getQuantityString(C0707R.plurals.selection_subtitle, 2, Integer.valueOf(i), Integer.valueOf(i2)));
            int i3 = i == i2 ? 17170444 : 17170443;
            TextView textView2 = this.w0;
            if (textView2 != null) {
                textView2.setTextColor(androidx.core.content.a.b(l4(), i3));
            } else {
                h.k("subTitle");
                throw null;
            }
        } else {
            h.k("subTitle");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        reb reb;
        Lyrics lyrics;
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.selection_container, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.background);
        h.d(findViewById, "view.findViewById(R.id.background)");
        this.v0 = findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.selection_subtitle);
        h.d(findViewById2, "view.findViewById(R.id.selection_subtitle)");
        this.w0 = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.lyrics_view);
        h.d(findViewById3, "view.findViewById(R.id.lyrics_view)");
        b bVar = (b) findViewById3;
        this.x0 = bVar;
        com.spotify.music.lyrics.core.experience.contract.a aVar = this.B0;
        if (aVar != null) {
            bVar.n(aVar);
            com.spotify.music.lyrics.core.experience.contract.a aVar2 = this.B0;
            if (aVar2 != null) {
                b bVar2 = this.x0;
                if (bVar2 != null) {
                    aVar2.f(bVar2);
                    View findViewById4 = inflate.findViewById(C0707R.id.share_button);
                    h.d(findViewById4, "view.findViewById(R.id.share_button)");
                    Button button = (Button) findViewById4;
                    this.y0 = button;
                    button.setOnClickListener(new a(0, this));
                    View findViewById5 = inflate.findViewById(C0707R.id.close_button);
                    h.d(findViewById5, "view.findViewById(R.id.close_button)");
                    ImageButton imageButton = (ImageButton) findViewById5;
                    this.z0 = imageButton;
                    imageButton.setOnClickListener(new a(1, this));
                    veb veb = this.A0;
                    if (veb != null) {
                        h.e(this, "binder");
                        veb.a = this;
                        zeb zeb = this.C0;
                        if (zeb != null) {
                            h.d(inflate, "view");
                            TextView textView = this.w0;
                            if (textView != null) {
                                zeb.a(inflate, textView);
                                Bundle D2 = D2();
                                com.spotify.music.lyrics.core.experience.model.a aVar3 = D2 != null ? (com.spotify.music.lyrics.core.experience.model.a) D2.getParcelable("colors") : null;
                                if (aVar3 != null) {
                                    View view = this.v0;
                                    if (view != null) {
                                        view.setBackgroundColor(aVar3.b());
                                        b bVar3 = this.x0;
                                        if (bVar3 != null) {
                                            bVar3.a(aVar3.a(), aVar3.a());
                                            veb veb2 = this.A0;
                                            if (veb2 != null) {
                                                h.e(aVar3, "colors");
                                                veb2.b = aVar3;
                                            } else {
                                                h.k("selectionPresenter");
                                                throw null;
                                            }
                                        } else {
                                            h.k("lyricsView");
                                            throw null;
                                        }
                                    } else {
                                        h.k("background");
                                        throw null;
                                    }
                                }
                                Bundle D22 = D2();
                                if (!(D22 == null || (lyrics = (Lyrics) D22.getParcelable("lyrics")) == null)) {
                                    b bVar4 = this.x0;
                                    if (bVar4 != null) {
                                        h.d(lyrics, "it");
                                        bVar4.g(lyrics, false);
                                        veb veb3 = this.A0;
                                        if (veb3 != null) {
                                            h.e(lyrics, "lyrics");
                                            veb3.c = lyrics;
                                        } else {
                                            h.k("selectionPresenter");
                                            throw null;
                                        }
                                    } else {
                                        h.k("lyricsView");
                                        throw null;
                                    }
                                }
                                Bundle D23 = D2();
                                if (!(D23 == null || (reb = (reb) D23.getParcelable("track_infos")) == null)) {
                                    veb veb4 = this.A0;
                                    if (veb4 != null) {
                                        h.d(reb, "it");
                                        h.e(reb, "<set-?>");
                                        veb4.d = reb;
                                    } else {
                                        h.k("selectionPresenter");
                                        throw null;
                                    }
                                }
                                Bundle D24 = D2();
                                if (D24 != null) {
                                    int i = D24.getInt("start_y");
                                    b bVar5 = this.x0;
                                    if (bVar5 != null) {
                                        bVar5.setStartY(i);
                                    } else {
                                        h.k("lyricsView");
                                        throw null;
                                    }
                                }
                                return inflate;
                            }
                            h.k("subTitle");
                            throw null;
                        }
                        h.k("educationTooltipManager");
                        throw null;
                    }
                    h.k("selectionPresenter");
                    throw null;
                }
                h.k("lyricsView");
                throw null;
            }
            h.k("lyricsContainerPresenter");
            throw null;
        }
        h.k("lyricsContainerPresenter");
        throw null;
    }
}
