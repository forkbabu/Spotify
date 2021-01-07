package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;

/* renamed from: dk8  reason: default package */
public class dk8 extends bk8 {
    private final SeekBar n;
    private int o;
    private PopupWindow p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private TextView v;
    private final com.spotify.music.settings.a w;
    private final String x = b().getString(C0707R.string.settings_crossfade_off);
    private Optional<b> y;

    /* renamed from: dk8$a */
    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                dk8.W(dk8.this, i);
                Point e0 = dk8.e0(dk8.this, i);
                dk8.this.p.update(seekBar, e0.x, e0.y, -1, -1);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            dk8.this.q = ((seekBar.getThumbOffset() * 2) + ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) - dk8.this.s;
            dk8.this.r = (dk8.this.s / 2) + (seekBar.getPaddingLeft() - seekBar.getThumbOffset());
            int progress = seekBar.getProgress();
            dk8.W(dk8.this, seekBar.getProgress());
            Point e0 = dk8.e0(dk8.this, progress);
            dk8.this.p.showAsDropDown(seekBar, e0.x, e0.y);
            dk8.this.u = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            dk8.this.I0();
            dk8.this.p.dismiss();
            dk8.this.u = false;
            if (dk8.this.y.isPresent()) {
                ((b) dk8.this.y.get()).a(seekBar.getProgress());
            }
        }
    }

    /* renamed from: dk8$b */
    public interface b {
        void a(int i);
    }

    public dk8(View view, x90 x90, com.spotify.music.settings.a aVar) {
        super(view, x90);
        this.w = aVar;
        SeekBar seekBar = (SeekBar) view.findViewById(C0707R.id.seekbar);
        this.n = seekBar;
        seekBar.setMax(12);
        seekBar.refreshDrawableState();
        TextView textView = new TextView(b());
        this.v = textView;
        textView.setGravity(17);
        this.v.setBackgroundResource(C0707R.drawable.bg_settings_bubble);
        this.v.setTextSize(1, 16.0f);
        this.v.setTextColor(androidx.core.content.a.b(b(), C0707R.color.txt_cell_title_normal));
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        int round = Math.round(TypedValue.applyDimension(1, 4.0f, b().getResources().getDisplayMetrics()));
        TextView textView2 = this.v;
        textView2.setPadding(textView2.getPaddingLeft() + round, this.v.getPaddingTop(), this.v.getPaddingRight() + round, this.v.getPaddingBottom());
        PopupWindow popupWindow = new PopupWindow(this.v);
        this.p = popupWindow;
        popupWindow.setFocusable(false);
        this.p.setTouchable(false);
        this.p.setClippingEnabled(false);
        this.p.setWidth(-2);
        this.p.setHeight(-2);
        Drawable d = androidx.core.content.a.d(b(), C0707R.drawable.player_progress_thumb);
        d.getClass();
        this.s = d.getIntrinsicWidth();
        Drawable d2 = androidx.core.content.a.d(b(), C0707R.drawable.player_progress_thumb);
        d2.getClass();
        this.t = d2.getIntrinsicHeight();
        ((TextView) view.findViewById(C0707R.id.offText)).setText(C0707R.string.settings_crossfade_off);
        ((TextView) view.findViewById(C0707R.id.maxText)).setText(b().getString(C0707R.string.settings_seconds, 12));
        seekBar.setOnSeekBarChangeListener(new a());
    }

    static void W(dk8 dk8, int i) {
        if (dk8.p.isShowing()) {
            dk8.v.getClass();
            if (i < 1) {
                dk8.v.setText(dk8.x);
            } else {
                dk8.v.setText(dk8.b().getString(C0707R.string.settings_seconds, Integer.valueOf(i)));
            }
        }
    }

    static Point e0(dk8 dk8, int i) {
        int i2;
        int i3;
        dk8.v.getClass();
        dk8.v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (nud.n(dk8.getView())) {
            i2 = (-((int) ((((float) i) / ((float) dk8.n.getMax())) * ((float) dk8.q)))) - dk8.r;
            i3 = Math.round(((float) dk8.v.getMeasuredWidth()) / 2.0f);
        } else {
            i2 = ((int) ((((float) i) / ((float) dk8.n.getMax())) * ((float) dk8.q))) + dk8.r;
            i3 = Math.round(((float) dk8.v.getMeasuredWidth()) / 2.0f);
        }
        int measuredHeight = dk8.v.getMeasuredHeight();
        return new Point(i2 - i3, -((dk8.t / 2) + measuredHeight + (dk8.n.getHeight() / 2)));
    }

    public void I0() {
        a.C0340a<Boolean> aVar = com.spotify.music.settings.a.o;
        int progress = this.n.getProgress();
        boolean z = false;
        if (progress == this.o) {
            Logger.b("Not saving crossfade settings, they are the same.", new Object[0]);
            return;
        }
        if (progress >= 0 && progress <= 12) {
            z = true;
        }
        Assertion.j("Out of range again! aaargh.", z);
        if (progress == 0) {
            this.w.b(aVar, Boolean.FALSE);
            return;
        }
        this.w.b(aVar, Boolean.TRUE);
        this.w.b(com.spotify.music.settings.a.p, Integer.valueOf(progress));
    }

    public void J0(b bVar) {
        this.y = Optional.fromNullable(bVar);
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.getView().setEnabled(z);
        this.n.setEnabled(z);
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
        if (!this.u) {
            boolean crossfade = settingsState.crossfade();
            int crossfadeTimeSeconds = settingsState.crossfadeTimeSeconds();
            if (crossfadeTimeSeconds < 0 || crossfadeTimeSeconds > 12) {
                Assertion.p("Out of range: " + crossfadeTimeSeconds);
            }
            if (!crossfade) {
                crossfadeTimeSeconds = 0;
            }
            this.o = crossfadeTimeSeconds;
            this.n.setProgress(crossfadeTimeSeconds);
        }
    }
}
