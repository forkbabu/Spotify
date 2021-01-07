package com.spotify.music.features.checkout.web;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;

public abstract class g {

    /* access modifiers changed from: private */
    public static class b extends g {
        private final WebView a;
        private final WebBackForwardList b;

        b(WebView webView, a aVar) {
            this.a = webView;
            this.b = webView.copyBackForwardList();
        }

        @Override // com.spotify.music.features.checkout.web.g
        public boolean a() {
            int i;
            int currentIndex = this.b.getCurrentIndex();
            int i2 = currentIndex - 1;
            while (true) {
                if (i2 < 0) {
                    i = Integer.MAX_VALUE;
                    break;
                }
                WebHistoryItem itemAtIndex = this.b.getItemAtIndex(i2);
                if (itemAtIndex != null ? !"about:blank".equals(itemAtIndex.getUrl()) : false) {
                    i = i2 - currentIndex;
                    break;
                }
                i2--;
            }
            if (i == Integer.MAX_VALUE) {
                return false;
            }
            this.a.goBackOrForward(i);
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static class c extends g {
        c(a aVar) {
        }

        @Override // com.spotify.music.features.checkout.web.g
        public boolean a() {
            return false;
        }
    }

    public static g b(WebView webView) {
        if (webView != null && webView.canGoBack()) {
            return new b(webView, null);
        }
        return new c(null);
    }

    public abstract boolean a();
}
