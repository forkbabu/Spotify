package com.spotify.music.features.yourlibrary.musicpages.view;

import android.view.View;
import android.widget.Button;
import com.spotify.music.C0707R;

public class h0 {

    /* access modifiers changed from: private */
    public static class a implements g90 {
        private final View a;
        private final Button b;

        public a(View view) {
            this.a = view;
            this.b = (Button) view.findViewById(C0707R.id.button);
        }

        @Override // com.spotify.encore.ViewProvider
        public View getView() {
            return this.a;
        }

        public Button l() {
            return this.b;
        }
    }
}
