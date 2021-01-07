package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.podcastinteractivity.presenter.PodcastPollPresenter;
import com.spotify.music.podcastinteractivity.proto.Poll;
import com.spotify.music.podcastinteractivity.proto.PollOption;
import com.spotify.music.podcastinteractivity.proto.PollType;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bwc  reason: default package */
public class bwc implements awc, dwc {
    private final PodcastPollPresenter a;
    private final vvc b;
    private final qtc c;
    private final otc d;
    private ViewGroup e;

    public bwc(PodcastPollPresenter podcastPollPresenter, vvc vvc, qtc qtc, otc otc) {
        this.a = podcastPollPresenter;
        this.b = vvc;
        this.c = qtc;
        this.d = otc;
    }

    @Override // defpackage.awc
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = (ViewGroup) layoutInflater.inflate(C0707R.layout.view_poll, viewGroup, false);
        this.a.k(this);
        this.a.a();
        this.c.a(layoutInflater, (ViewGroup) this.e.findViewById(C0707R.id.options_container_frame));
        this.d.a((ViewGroup) this.e.findViewById(C0707R.id.poll_info_container));
        return this.e;
    }

    @Override // defpackage.awc
    public void b() {
        this.a.i();
    }

    @Override // defpackage.awc
    public void c(String str) {
        this.d.c();
        this.a.f(str);
    }

    public void d() {
        this.e.setVisibility(8);
    }

    public /* synthetic */ void e(PollOption pollOption, View view) {
        this.a.l(pollOption.l(), pollOption, -1);
    }

    public void f(Poll poll, PollOption pollOption, int i, LinearLayout linearLayout, Button button, CompoundButton compoundButton, boolean z) {
        boolean z2;
        this.a.h(poll.l(), pollOption, i);
        int childCount = linearLayout.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                z2 = false;
                break;
            } else if (((CheckBox) linearLayout.getChildAt(i2)).isChecked()) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
    }

    public void g(Poll poll, LinearLayout linearLayout, View view) {
        ArrayList arrayList = new ArrayList();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            CheckBox checkBox = (CheckBox) linearLayout.getChildAt(i);
            if (checkBox.isChecked()) {
                arrayList.add(checkBox.getText().toString());
            }
        }
        if (!arrayList.isEmpty()) {
            PodcastPollPresenter podcastPollPresenter = this.a;
            int l = poll.l();
            List<PollOption> m = poll.m();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator<PollOption> it2 = m.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PollOption next = it2.next();
                    if (str.equals(next.h())) {
                        arrayList2.add(next);
                        break;
                    }
                }
            }
            podcastPollPresenter.g(l, arrayList2);
            return;
        }
        Logger.b("POLL_HACK - no optionselected", new Object[0]);
    }

    public void h(boolean z) {
        this.c.b(z);
    }

    public void i(Poll poll, int i) {
        ((LinearLayout) this.e.findViewById(C0707R.id.options_container)).setVisibility(8);
        ((TextView) this.e.findViewById(C0707R.id.question)).setText(poll.n());
        Resources resources = this.e.getContext().getResources();
        ((TextView) this.e.findViewById(C0707R.id.subtitle)).setText(resources.getQuantityString(C0707R.plurals.podcast_poll_poll_subtitle, i, Integer.valueOf(i), this.b.a(poll.h(), resources)));
        this.e.setVisibility(0);
    }

    public void j(Poll poll) {
        Button button = (Button) this.e.findViewById(C0707R.id.button);
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(C0707R.id.options_container);
        linearLayout.setVisibility(8);
        linearLayout.removeAllViews();
        if (poll.p() == PollType.SINGLE_CHOICE) {
            for (PollOption pollOption : poll.m()) {
                Button button2 = (Button) LayoutInflater.from(this.e.getContext()).inflate(C0707R.layout.single_option_button, this.e, false);
                button2.setText(pollOption.h());
                button2.setOnClickListener(new zvc(this, pollOption));
                linearLayout.addView(button2);
            }
            button.setVisibility(8);
        } else {
            List<PollOption> m = poll.m();
            for (int i = 0; i < m.size(); i++) {
                PollOption pollOption2 = m.get(i);
                xvc xvc = new xvc(this, poll, pollOption2, i, linearLayout, button);
                String h = pollOption2.h();
                Context context = this.e.getContext();
                CheckBox checkBox = (CheckBox) LayoutInflater.from(context).inflate(C0707R.layout.multiple_selection_option_button, this.e, false);
                Resources resources = context.getResources();
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK_ALT_FILL, (float) resources.getDimensionPixelSize(C0707R.dimen.checkbox_icon_size));
                spotifyIconDrawable.r(resources.getColor(C0707R.color.checkbox_selected_background));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842912}, spotifyIconDrawable);
                stateListDrawable.addState(new int[0], resources.getDrawable(C0707R.drawable.radio_unchecked));
                checkBox.setCompoundDrawablesWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                checkBox.setText(h);
                checkBox.setOnCheckedChangeListener(xvc);
                linearLayout.addView(checkBox);
            }
            button.setOnClickListener(new yvc(this, poll, linearLayout));
            button.setEnabled(false);
            button.setVisibility(0);
        }
        linearLayout.setVisibility(0);
    }

    public void k(Poll poll, List<PollOption> list, int i) {
        boolean z;
        bwc bwc = this;
        Button button = (Button) bwc.e.findViewById(C0707R.id.button);
        LinearLayout linearLayout = (LinearLayout) bwc.e.findViewById(C0707R.id.options_container);
        linearLayout.removeAllViews();
        List<PollOption> m = poll.m();
        int i2 = -1;
        for (PollOption pollOption : m) {
            if (pollOption.m() > i2) {
                i2 = pollOption.m();
            }
        }
        for (PollOption pollOption2 : m) {
            String h = pollOption2.h();
            int m2 = pollOption2.m();
            boolean z2 = pollOption2.m() == i2;
            Iterator<PollOption> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (pollOption2.i() == it.next().i()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(bwc.e.getContext()).inflate(C0707R.layout.result_bar_percent, bwc.e, false);
            TextView textView = (TextView) constraintLayout.findViewById(C0707R.id.option_text);
            TextView textView2 = (TextView) constraintLayout.findViewById(C0707R.id.option_score);
            float f = ((float) m2) / ((float) i);
            float f2 = 1.0f - f;
            View findViewById = constraintLayout.findViewById(C0707R.id.left_bar);
            View findViewById2 = constraintLayout.findViewById(C0707R.id.right_bar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.weight = f;
            findViewById.setLayoutParams(layoutParams);
            if (z2) {
                findViewById.setBackgroundResource(C0707R.drawable.rounded_button_background_grey_light);
            } else {
                findViewById.setBackgroundResource(C0707R.drawable.rounded_button_background_grey_default);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            layoutParams2.weight = f2;
            findViewById2.setLayoutParams(layoutParams2);
            View findViewById3 = constraintLayout.findViewById(C0707R.id.checkmark);
            if (z) {
                int dimensionPixelSize = findViewById3.getResources().getDimensionPixelSize(C0707R.dimen.check_mark_icon_size);
                Context context = findViewById3.getContext();
                SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHECK_ALT, (float) dimensionPixelSize);
                spotifyIconDrawable.r(a.b(context, R.color.gray_70));
                findViewById3.setBackground(spotifyIconDrawable);
                findViewById3.setVisibility(0);
            } else {
                findViewById3.setVisibility(8);
            }
            textView.setText(h);
            textView2.setText(textView2.getContext().getString(C0707R.string.podcast_poll_percentage, Integer.valueOf(Math.round(f * 100.0f))));
            linearLayout.addView(constraintLayout);
            bwc = this;
        }
        button.setVisibility(8);
        linearLayout.setVisibility(0);
    }

    public void l() {
        this.e.findViewById(C0707R.id.top_divider).setVisibility(0);
    }

    public void m() {
        this.d.d();
    }

    @Override // defpackage.awc
    public void stop() {
        this.a.stop();
    }
}
