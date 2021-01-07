package com.spotify.encore.consumer.components.yourlibrary.impl.searchheader;

import android.text.Editable;
import android.text.TextWatcher;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;

public final class DefaultSearchHeaderLibrary$onEvent$1 implements TextWatcher {
    final /* synthetic */ nmf $event;
    final /* synthetic */ DefaultSearchHeaderLibrary this$0;

    DefaultSearchHeaderLibrary$onEvent$1(DefaultSearchHeaderLibrary defaultSearchHeaderLibrary, nmf nmf) {
        this.this$0 = defaultSearchHeaderLibrary;
        this.$event = nmf;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$event.invoke(new SearchHeaderLibrary.Events.SearchTextChanged((charSequence != null ? charSequence : "").toString()));
        this.this$0.updateClearIconVisibility(charSequence);
    }
}
