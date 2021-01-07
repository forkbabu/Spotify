package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

@Deprecated
public class b implements LayoutInflater.Factory {
    private PasteViewInflater a;

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (this.a == null) {
            this.a = new PasteViewInflater();
        }
        return this.a.createView(context, str, attributeSet);
    }
}
