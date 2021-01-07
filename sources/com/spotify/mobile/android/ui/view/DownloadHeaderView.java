package com.spotify.mobile.android.ui.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.c;
import com.comscore.streaming.WindowState;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.o;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.offline.WaitingReason;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public class DownloadHeaderView extends LinearLayout implements v {
    public static final /* synthetic */ int A = 0;
    private final Context a;
    private boolean b;
    private boolean c;
    private o f;
    private Animator n;
    private Animator o;
    private State p = State.INIT;
    private ProgressBar q;
    private ViewGroup r;
    private SwitchCompat s;
    private TextView t;
    private TextView u;
    private a v;
    private int w;
    private int x;
    private y y;
    private final CompoundButton.OnCheckedChangeListener z = new f(this);

    public enum State {
        INIT,
        HIDDEN,
        DOWNLOADABLE,
        DOWNLOADING,
        DOWNLOADED,
        WAITING,
        NO_INTERNET,
        OFFLINE_MODE,
        SYNC_NOT_ALLOWED
    }

    public interface a {
        void a();

        void b(boolean z);
    }

    public DownloadHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        Resources resources = getResources();
        this.w = resources.getDimensionPixelSize(C0707R.dimen.download_header_content_height) - 1;
        this.x = resources.getDimensionPixelSize(C0707R.dimen.download_header_progress_bar_height) - 1;
        this.y = new y(context);
    }

    public static DownloadHeaderView a(Context context, ViewGroup viewGroup) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) LayoutInflater.from(context).inflate(C0707R.layout.header_download, viewGroup, false);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        downloadHeaderView.setBackground(null);
        return downloadHeaderView;
    }

    private static ValueAnimator b(View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(i2, i3);
        valueAnimator.setDuration((long) i);
        valueAnimator.addUpdateListener(new d(marginLayoutParams, view));
        return valueAnimator;
    }

    public static void c(DownloadHeaderView downloadHeaderView) {
        downloadHeaderView.q(downloadHeaderView.p, downloadHeaderView.q.getProgress());
    }

    private void o(View view, int i, boolean z2) {
        if (z2) {
            this.f.b(view, b(view, WindowState.NORMAL, -i, 0), false);
        } else {
            view.setVisibility(0);
        }
    }

    private void p(View view, int i, boolean z2) {
        if (z2) {
            this.f.b(view, b(view, WindowState.NORMAL, 0, -i), true);
        } else {
            view.setVisibility(8);
        }
    }

    private f q(State state, int i) {
        int i2;
        f fVar = f.a;
        State state2 = State.INIT;
        State state3 = State.HIDDEN;
        State state4 = State.DOWNLOADING;
        if (state == state4) {
            this.q.setProgress(i);
        }
        this.s.setOnCheckedChangeListener(null);
        this.s.setChecked((state == State.DOWNLOADABLE || state == state3 || state == state2) ? false : true);
        this.s.setOnCheckedChangeListener(this.z);
        State state5 = this.p;
        if (state5 == state) {
            return fVar;
        }
        boolean z2 = state5 != state2;
        if (state5 == state4) {
            p(this.q, this.x, z2);
        }
        boolean z3 = (state == state3 || state == state2) ? false : true;
        State state6 = this.p;
        boolean z4 = (state6 == state3 || state6 == state2) ? false : true;
        boolean t2 = t(state);
        boolean t3 = t(this.p);
        if (t2) {
            TextView textView = this.t;
            int ordinal = state.ordinal();
            if (ordinal != 5) {
                if (ordinal == 6) {
                    i2 = C0707R.string.header_download_waiting_no_internet;
                } else if (ordinal == 7) {
                    i2 = C0707R.string.header_download_waiting_in_offline_mode;
                } else if (ordinal != 8) {
                    Assertion.p("State " + state + " is not a waiting state.");
                } else {
                    i2 = C0707R.string.header_download_waiting_sync_not_allowed;
                }
                textView.setText(i2);
            }
            i2 = C0707R.string.header_download_waiting;
            textView.setText(i2);
        }
        if (this.p == state3) {
            if (z3) {
                o(this.r, this.w, z2);
            } else {
                this.r.setVisibility(8);
            }
            if (t2) {
                o(this.t, this.w, z2);
            } else {
                this.t.setVisibility(8);
            }
        } else if (state == state3) {
            if (z4) {
                p(this.r, this.w, z2);
            }
            if (t3) {
                p(this.t, this.w, z2);
            }
        } else {
            if (z4 && !z3) {
                ViewGroup viewGroup = this.r;
                if (z2) {
                    this.f.b(viewGroup, this.o, true);
                } else {
                    viewGroup.setVisibility(8);
                }
            }
            if (t3 && !t2) {
                TextView textView2 = this.t;
                if (z2) {
                    this.f.b(textView2, this.o, true);
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (z3 && !z4) {
                ViewGroup viewGroup2 = this.r;
                if (z2) {
                    this.f.b(viewGroup2, this.n, false);
                } else {
                    viewGroup2.setVisibility(0);
                }
            }
            if (t2 && !t3) {
                TextView textView3 = this.t;
                if (z2) {
                    this.f.b(textView3, this.n, false);
                } else {
                    textView3.setVisibility(0);
                }
            }
        }
        if (state == state4) {
            o(this.q, this.x, z2);
        }
        this.p = state;
        s();
        return fVar;
    }

    private void s() {
        int i;
        String str;
        TextView textView = this.u;
        if (textView != null) {
            int ordinal = this.p.ordinal();
            if (ordinal != 2) {
                i = ordinal != 4 ? !this.b ? C0707R.string.header_download_available_offline_new_copy_downloading : C0707R.string.header_download_available_offline_songs_downloading : !this.b ? C0707R.string.header_download_available_offline_new_copy_downloaded : C0707R.string.header_download_available_offline_songs_downloaded;
            } else {
                i = !this.b ? C0707R.string.header_download_available_offline_new_copy : C0707R.string.header_download_available_offline_songs;
            }
            textView.setText(i);
            SwitchCompat switchCompat = this.s;
            int ordinal2 = this.p.ordinal();
            if (ordinal2 == 2) {
                str = this.a.getString(C0707R.string.header_download_available_offline_content_description_download);
            } else if (ordinal2 != 4) {
                str = this.a.getString(C0707R.string.header_download_available_offline_content_description_downloading);
            } else {
                str = this.a.getString(C0707R.string.header_download_available_offline_content_description_downloaded);
            }
            switchCompat.setContentDescription(str);
        }
    }

    private static boolean t(State state) {
        return state == State.WAITING || state == State.NO_INTERNET || state == State.OFFLINE_MODE || state == State.SYNC_NOT_ALLOWED;
    }

    public void d(CompoundButton compoundButton, boolean z2) {
        if (!this.c || this.s.isChecked()) {
            boolean isChecked = this.s.isChecked();
            a aVar = this.v;
            if (aVar != null) {
                aVar.b(isChecked);
                return;
            }
            return;
        }
        this.y.a(new b(this), new e(this));
    }

    public void e(View view) {
        a aVar = this.v;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void f() {
        a aVar = this.v;
        if (aVar != null) {
            aVar.b(false);
        }
    }

    public /* synthetic */ f g(a.g gVar) {
        return q(State.DOWNLOADABLE, 0);
    }

    public SwitchCompat getDownloadButton() {
        return this.s;
    }

    public TextView getWaitingTextView() {
        return this.t;
    }

    public /* synthetic */ f h(a.f fVar) {
        return q(State.DOWNLOADABLE, 0);
    }

    public f i(a.h hVar) {
        WaitingReason d = hVar.d();
        State state = State.WAITING;
        int ordinal = d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                state = State.OFFLINE_MODE;
            } else if (ordinal == 2) {
                state = State.NO_INTERNET;
            } else if (ordinal == 3) {
                state = State.SYNC_NOT_ALLOWED;
            }
        }
        return q(state, hVar.c());
    }

    public /* synthetic */ f j(a.b bVar) {
        return q(State.DOWNLOADING, bVar.c());
    }

    public /* synthetic */ f k(a.C0377a aVar) {
        return q(State.DOWNLOADED, 0);
    }

    public /* synthetic */ f l(a.c cVar) {
        return q(State.DOWNLOADABLE, 0);
    }

    public /* synthetic */ f m(a.e eVar) {
        return q(State.DOWNLOADABLE, 0);
    }

    public /* synthetic */ f n(a.d dVar) {
        return q(State.DOWNLOADABLE, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            this.f = new o();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, View.ALPHA, 0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.setDuration(400L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, View.ALPHA, 1.0f, 0.0f);
            this.o = ofFloat2;
            ofFloat2.setDuration(400L);
            this.r = (ViewGroup) findViewById(C0707R.id.button_download_layout);
            SwitchCompat switchCompat = new SwitchCompat(this.a, null, C0707R.attr.switchStyle);
            this.s = switchCompat;
            switchCompat.setId(C0707R.id.download_switch_toggle);
            this.r.addView(this.s, new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(C0707R.dimen.download_header_button_height)));
            this.q = (ProgressBar) findViewById(C0707R.id.progress_bar);
            this.t = (TextView) findViewById(C0707R.id.text_waiting);
            this.u = (TextView) findViewById(C0707R.id.title);
            s();
            c.n(this.u, R.style.TextAppearance_Encore_BalladBold);
            this.u.setTextColor(androidx.core.content.a.b(this.a, R.color.white));
            Context context = this.a;
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.DOWNLOAD, (float) nud.g(16.0f, context.getResources()));
            spotifyIconDrawable.r(androidx.core.content.a.b(this.a, R.color.gray_50));
            this.t.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            this.t.setOnClickListener(new g(this));
            this.s.setOnCheckedChangeListener(this.z);
        }
    }

    public void r(com.spotify.playlist.models.offline.a aVar) {
        aVar.b(new m(this), new a(this), new k(this), new l(this), new h(this), new c(this), new j(this), new i(this));
    }

    public void setObserver(a aVar) {
        this.v = aVar;
    }

    public void setRemoveDownloadConfirmationDialog(y yVar) {
        this.y = yVar;
    }

    public void setShowConfirmationDialogOnRemoveDownload(boolean z2) {
        this.c = z2;
    }

    public void setSongsOnly(boolean z2) {
        this.b = z2;
        s();
    }
}
