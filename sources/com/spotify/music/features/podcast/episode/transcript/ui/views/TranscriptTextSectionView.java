package com.spotify.music.features.podcast.episode.transcript.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class TranscriptTextSectionView extends ConstraintLayout {
    private CharSequence a;
    private List<? extends CharSequence> b;
    private TextView c;
    private ViewGroup f;
    private final List<TextView> n;

    public TranscriptTextSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void C(int i) {
        while (true) {
            ViewGroup viewGroup = this.f;
            if (viewGroup == null) {
                h.k("paragraphContainer");
                throw null;
            } else if (viewGroup.getChildCount() < i) {
                LayoutInflater from = LayoutInflater.from(getContext());
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 != null) {
                    View inflate = from.inflate(C0707R.layout.transcript_text_section_paragraph, viewGroup2, false);
                    if (inflate != null) {
                        TextView textView = (TextView) inflate;
                        textView.setVisibility(8);
                        this.n.add(textView);
                        ViewGroup viewGroup3 = this.f;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(textView);
                        } else {
                            h.k("paragraphContainer");
                            throw null;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                } else {
                    h.k("paragraphContainer");
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    public final CharSequence getHeading() {
        return this.a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.lang.CharSequence>, java.util.List<java.lang.CharSequence> */
    public final List<CharSequence> getParagraphs() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0707R.id.transcript_section_heading);
        h.d(findViewById, "findViewById(R.id.transcript_section_heading)");
        this.c = (TextView) findViewById;
        View findViewById2 = findViewById(C0707R.id.transcript_paragraph_container);
        h.d(findViewById2, "findViewById(R.id.transcript_paragraph_container)");
        this.f = (ViewGroup) findViewById2;
        C(5);
    }

    public final void setHeading(CharSequence charSequence) {
        h.e(charSequence, "value");
        this.a = charSequence;
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
        } else {
            h.k("sectionHeading");
            throw null;
        }
    }

    public final void setParagraphs(List<? extends CharSequence> list) {
        h.e(list, "value");
        this.b = list;
        C(list.size());
        int i = 0;
        for (T t : this.n) {
            if (i <= d.m(list)) {
                t.setVisibility(0);
                t.setText((CharSequence) list.get(i));
            } else {
                t.setVisibility(8);
            }
            i++;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptTextSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.a = "";
        this.b = EmptyList.a;
        this.n = new ArrayList();
        ViewGroup.inflate(context, C0707R.layout.transcript_text_section_view, this);
    }
}
