package com.spotify.inappmessaging.preview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.music.C0707R;
import java.util.ArrayList;

public class PreviewSubmissionView extends LinearLayout {
    public static final /* synthetic */ int n = 0;
    private EditText a;
    private Spinner b;
    private Button c;
    private Button f;

    public PreviewSubmissionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    private void b() {
        LinearLayout.inflate(getContext(), C0707R.layout.preview_submission, this);
        this.a = (EditText) q4.G(this, C0707R.id.creative_id);
        this.b = (Spinner) q4.G(this, C0707R.id.trigger_type);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(TriggerType.URI.toString());
        arrayList.add(TriggerType.PLAYBACK_STARTED.toString());
        arrayList.add(TriggerType.CLIENT_EVENT.toString());
        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), (int) C0707R.layout.preview_submission_spinner_textview, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        this.b.setAdapter((SpinnerAdapter) arrayAdapter);
        this.b.setOnFocusChangeListener(new b(this));
        this.c = (Button) q4.G(this, C0707R.id.button_positive);
        this.f = (Button) q4.G(this, C0707R.id.button_negative);
    }

    public void a() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    public void c() {
        this.a.requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.a, 1);
    }

    public String getCreativeId() {
        if (this.a.getText() == null) {
            return null;
        }
        return this.a.getText().toString();
    }

    public TriggerType getTriggerType() {
        return TriggerType.valueOf(this.b.getSelectedItem().toString());
    }

    public void setCancelAction(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
    }

    public void setSubmitAction(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
        this.a.setOnEditorActionListener(new a(onClickListener));
    }

    public PreviewSubmissionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
