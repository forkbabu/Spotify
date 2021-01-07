package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

public final class TextHeaderView extends LinearLayout {
    private final TextView a;
    private final TextView b;

    public TextHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.pasteDefaultsHeaderStyle);
    }

    public TextView getSubtitleView() {
        return this.a;
    }

    public TextView getTitleView() {
        return this.a;
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.setText(charSequence);
        this.b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public TextHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(17);
        int g = nud.g(16.0f, context.getResources());
        int g2 = nud.g(40.0f, context.getResources());
        int g3 = nud.g(16.0f, context.getResources());
        setPadding(g3, g, g3, g2);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0707R.layout.paste_text_header, (ViewGroup) this, true);
        TextView textView = (TextView) linearLayout.findViewById(C0707R.id.title);
        this.a = textView;
        this.b = (TextView) linearLayout.findViewById(C0707R.id.header_subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.e, i, 0);
        setTitle(obtainStyledAttributes.getString(0));
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            c.n(textView, resourceId);
        }
        obtainStyledAttributes.recycle();
    }
}
