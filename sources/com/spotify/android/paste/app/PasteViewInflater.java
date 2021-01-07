package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;

@Keep
public class PasteViewInflater extends q {
    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        AppCompatAutoCompleteTextView appCompatAutoCompleteTextView = (AppCompatAutoCompleteTextView) createView(context, "AutoCompleteTextView", attributeSet);
        return appCompatAutoCompleteTextView == null ? super.createAutoCompleteTextView(context, attributeSet) : appCompatAutoCompleteTextView;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        AppCompatButton appCompatButton = (AppCompatButton) createView(context, "Button", attributeSet);
        return appCompatButton == null ? super.createButton(context, attributeSet) : appCompatButton;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) createView(context, "CheckBox", attributeSet);
        return appCompatCheckBox == null ? super.createCheckBox(context, attributeSet) : appCompatCheckBox;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) createView(context, "CheckedTextView", attributeSet);
        return appCompatCheckedTextView == null ? super.createCheckedTextView(context, attributeSet) : appCompatCheckedTextView;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        AppCompatEditText appCompatEditText = (AppCompatEditText) createView(context, "EditText", attributeSet);
        return appCompatEditText == null ? super.createEditText(context, attributeSet) : appCompatEditText;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) createView(context, "ImageButton", attributeSet);
        return appCompatImageButton == null ? super.createImageButton(context, attributeSet) : appCompatImageButton;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) createView(context, "ImageView", attributeSet);
        return appCompatImageView == null ? super.createImageView(context, attributeSet) : appCompatImageView;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView = (AppCompatMultiAutoCompleteTextView) createView(context, "MultiAutoCompleteTextView", attributeSet);
        return appCompatMultiAutoCompleteTextView == null ? super.createMultiAutoCompleteTextView(context, attributeSet) : appCompatMultiAutoCompleteTextView;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) createView(context, "RadioButton", attributeSet);
        return appCompatRadioButton == null ? super.createRadioButton(context, attributeSet) : appCompatRadioButton;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) createView(context, "RatingBar", attributeSet);
        return appCompatRatingBar == null ? super.createRatingBar(context, attributeSet) : appCompatRatingBar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) createView(context, "SeekBar", attributeSet);
        return appCompatSeekBar == null ? super.createSeekBar(context, attributeSet) : appCompatSeekBar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) createView(context, "Spinner", attributeSet);
        return appCompatSpinner == null ? super.createSpinner(context, attributeSet) : appCompatSpinner;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) createView(context, "TextView", attributeSet);
        return appCompatTextView == null ? super.createTextView(context, attributeSet) : appCompatTextView;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        AppCompatToggleButton appCompatToggleButton = (AppCompatToggleButton) createView(context, "ToggleButton", attributeSet);
        return appCompatToggleButton == null ? super.createToggleButton(context, attributeSet) : appCompatToggleButton;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.q
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return c.c(context, str, attributeSet);
    }
}
