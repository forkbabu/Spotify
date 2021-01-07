package com.spotify.music.podcast.entity.adapter.description;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.entity.adapter.description.DescriptionViewBinderModel;
import com.spotify.music.podcast.entity.adapter.description.h;
import defpackage.kqc;

public class j implements h {
    private final ajf<h.a> a;
    private final kqc.a b;
    private final eoa c;
    private final eoa d;
    private TextView e;
    private String f = "";
    private DescriptionViewBinderModel.DescriptionType g;
    private CharSequence h = "";

    public j(ajf<h.a> ajf, kqc.a aVar, eoa eoa, eoa eoa2) {
        this.a = ajf;
        this.b = aVar;
        this.c = eoa;
        this.d = eoa2;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.h
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_adapter_delegate_show_description, viewGroup, false);
        TextView textView = (TextView) q4.G(inflate, C0707R.id.txt_description);
        this.e = textView;
        yoa.a(textView);
        this.e.setLongClickable(false);
        return inflate;
    }

    @Override // com.spotify.music.podcast.entity.adapter.description.h
    public void b(DescriptionViewBinderModel descriptionViewBinderModel) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        String a2 = descriptionViewBinderModel.a();
        DescriptionViewBinderModel.DescriptionType b2 = descriptionViewBinderModel.b();
        if (this.g != b2 || !this.f.equals(a2)) {
            this.f = a2;
            if (b2 == DescriptionViewBinderModel.DescriptionType.HTML) {
                this.h = this.c.a(a2);
            } else {
                this.h = this.d.a(a2);
            }
            this.g = descriptionViewBinderModel.b();
            charSequence = this.h;
        } else {
            charSequence = this.h;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (descriptionViewBinderModel.d()) {
            spannableStringBuilder.append('\n');
            this.e.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.e.setMaxLines(2);
        }
        this.e.setText(spannableStringBuilder);
        this.e.addOnLayoutChangeListener(new i(this, descriptionViewBinderModel, spannableStringBuilder));
        if (descriptionViewBinderModel.c()) {
            TextView textView = this.e;
            if (descriptionViewBinderModel.d()) {
                onClickListener = new a(this);
            } else {
                onClickListener = new c(this);
            }
            textView.setOnClickListener(onClickListener);
            return;
        }
        this.e.setOnClickListener(null);
    }

    public Spannable d(SpannableStringBuilder spannableStringBuilder) {
        this.e.setMaxLines(2);
        kqc.a aVar = this.b;
        TextView textView = this.e;
        Spannable b2 = aVar.b(textView, textView.getContext().getString(C0707R.string.show_description_see_more), new b(this)).b(spannableStringBuilder);
        this.e.setText(b2, TextView.BufferType.SPANNABLE);
        return b2;
    }

    public Spannable e(SpannableStringBuilder spannableStringBuilder) {
        this.e.setMaxLines(Integer.MAX_VALUE);
        this.e.setContentDescription(spannableStringBuilder.toString());
        String string = this.e.getContext().getString(C0707R.string.show_description_show_less);
        spannableStringBuilder.append((CharSequence) string);
        spannableStringBuilder.setSpan(new mqc(new d(this), ""), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        this.e.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        return spannableStringBuilder;
    }

    public /* synthetic */ void f(View view) {
        this.a.get().b();
    }

    public /* synthetic */ void g(View view) {
        this.a.get().a();
    }

    public /* synthetic */ void h(CharSequence charSequence) {
        this.a.get().a();
    }

    public /* synthetic */ void i(CharSequence charSequence) {
        this.a.get().b();
    }
}
