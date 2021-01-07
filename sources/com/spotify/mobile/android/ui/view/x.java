package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.libs.facepile.FacePileView;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.text.DateFormat;
import java.util.Calendar;

public class x extends LinearLayout {
    private TextView a = ((TextView) findViewById(C0707R.id.description));
    private FacePileView b = ((FacePileView) findViewById(C0707R.id.facepile));
    private Button c = ((Button) findViewById(C0707R.id.button));
    private TextView f;
    private TextView n;
    private TextView o = ((TextView) findViewById(C0707R.id.by_text));

    public x(Context context) {
        super(context);
        LinearLayout.inflate(getContext(), C0707R.layout.header_info_page, this);
        int g = nud.g(16.0f, getResources());
        setPadding(g, 0, g, nud.g(6.0f, getResources()));
        setGravity(17);
        setOrientation(1);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.RELEASED, (float) nud.g(32.0f, getContext().getResources()));
        Context context2 = getContext();
        int i = R.color.white_70;
        spotifyIconDrawable.r(a.b(context2, i));
        TextView textView = (TextView) findViewById(C0707R.id.date);
        this.f = textView;
        spotifyIconDrawable.w(textView.getTextSize() * 1.25f);
        c.h(this.f, spotifyIconDrawable, null, null, null);
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(getContext(), SpotifyIconV2.TIME, (float) nud.g(32.0f, getContext().getResources()));
        spotifyIconDrawable2.r(a.b(getContext(), i));
        TextView textView2 = (TextView) findViewById(C0707R.id.duration);
        this.n = textView2;
        spotifyIconDrawable2.w(textView2.getTextSize() * 1.2f);
        c.h(this.n, spotifyIconDrawable2, null, null, null);
    }

    public void a(boolean z) {
        this.a.setMovementMethod(z ? LinkMovementMethod.getInstance() : null);
    }

    public void b(cqe cqe, long j) {
        if (j > 0) {
            Calendar e = cqe.e();
            e.setTimeInMillis(j * 1000);
            this.f.setText(DateFormat.getDateInstance(2).format(e.getTime()));
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    public void c(boolean z) {
        if (!z) {
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(0);
        this.a.setMaxLines(4);
        this.a.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.header_info_page_image_size_small);
        layoutParams.height = dimensionPixelSize;
        this.b.setLayoutParams(layoutParams);
        this.b.setFaceSize(dimensionPixelSize);
    }

    public TextView getByTextView() {
        return this.o;
    }

    public TextView getDescriptionView() {
        return this.a;
    }

    public TextView getInfoPageDateTextView() {
        return this.f;
    }

    public FacePileView getInfoPageIconFacePileView() {
        return this.b;
    }

    public TextView getInfoPageLengthTextView() {
        return this.n;
    }

    public Button getInfoPageOwnerButton() {
        return this.c;
    }

    public void setByText(String str) {
        this.o.setText(str);
    }

    public void setByTextContentDescription(String str) {
        q4.J(this.o, true);
        q4.S(this.o, true);
        this.o.setContentDescription(str);
    }

    public void setDescriptionText(String str) {
        c(!TextUtils.isEmpty(str));
        this.a.setText(str);
    }

    public void setDuration(int i) {
        String str;
        int i2 = i / 60;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 > 0) {
            str = getResources().getString(C0707R.string.header_hours_minutes_format, Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            str = getResources().getString(C0707R.string.header_minutes_format, Integer.valueOf(i4));
        }
        this.n.setText(str);
    }

    public void setModifiedTime(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f.setText(str);
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    public void setOnOwnerClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
        this.c.setOnClickListener(onClickListener);
    }

    public void setOwnerButtonText(String str) {
        this.c.setText(str);
    }

    public void setOwnerClickable(boolean z) {
        this.c.setEnabled(z);
        this.b.setEnabled(z);
    }
}
