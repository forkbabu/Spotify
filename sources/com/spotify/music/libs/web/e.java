package com.spotify.music.libs.web;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;

class e extends d {
    private final WebView a;
    private final WebBackForwardList b;

    public e(WebView webView) {
        this.a = webView;
        this.b = webView.copyBackForwardList();
    }

    @Override // com.spotify.music.libs.web.d
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
