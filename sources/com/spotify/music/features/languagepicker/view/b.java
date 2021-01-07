package com.spotify.music.features.languagepicker.view;

import android.view.View;
import androidx.fragment.app.c;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ LanguagePickerFragment a;

    public /* synthetic */ b(LanguagePickerFragment languagePickerFragment) {
        this.a = languagePickerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LanguagePickerFragment languagePickerFragment = this.a;
        c j4 = languagePickerFragment.j4();
        j4.setResult(-1);
        languagePickerFragment.h0.k(j4.getIntent().getStringExtra("chained_uri"));
    }
}
