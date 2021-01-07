package com.spotify.encore.consumer.components.yourlibrary.impl.searchheader;

import android.view.View;
import com.spotify.encore.consumer.components.yourlibrary.api.searchheader.SearchHeaderLibrary;

final class DefaultSearchHeaderLibrary$onEvent$3 implements View.OnClickListener {
    final /* synthetic */ nmf $event;
    final /* synthetic */ DefaultSearchHeaderLibrary this$0;

    DefaultSearchHeaderLibrary$onEvent$3(DefaultSearchHeaderLibrary defaultSearchHeaderLibrary, nmf nmf) {
        this.this$0 = defaultSearchHeaderLibrary;
        this.$event = nmf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.this$0.binding.editText.setText("");
        this.$event.invoke(SearchHeaderLibrary.Events.ClearButtonClicked.INSTANCE);
    }
}
