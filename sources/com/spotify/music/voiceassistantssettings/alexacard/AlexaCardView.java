package com.spotify.music.voiceassistantssettings.alexacard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.alexaaccountlinking.errors.b;
import com.spotify.music.voiceassistantssettings.alexacard.c;
import kotlin.jvm.internal.h;

public final class AlexaCardView extends ConstraintLayout implements c {
    private final View a;
    private c.a b;
    private final Button c;
    private final Button f;
    private final TextView n;
    private final TextView o;
    private ViewGroup p;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                AlexaCardView.C((AlexaCardView) this.b);
            } else if (i == 1) {
                AlexaCardView.D((AlexaCardView) this.b);
            } else {
                throw null;
            }
        }
    }

    public AlexaCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final void C(AlexaCardView alexaCardView) {
        c.a aVar = alexaCardView.b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public static final void D(AlexaCardView alexaCardView) {
        c.a aVar = alexaCardView.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    static int E(AlexaCardView alexaCardView, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = R.color.white;
        }
        Context context = alexaCardView.getContext();
        if (!z) {
            i = R.color.white_30;
        }
        return androidx.core.content.a.b(context, i);
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c
    public void a() {
        this.a.setVisibility(0);
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c
    public void b() {
        this.a.setVisibility(8);
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c
    public void o(com.spotify.music.alexaaccountlinking.errors.a aVar) {
        h.e(aVar, "errorBanner");
        ViewGroup viewGroup = this.p;
        if (viewGroup != null) {
            aVar.b(new b(), viewGroup);
        }
    }

    public void setDefaultProviderEnabled(boolean z) {
        this.n.setTextColor(E(this, z, 0, 2));
        this.f.setTextColor(E(this, z, 0, 2));
        this.f.setEnabled(z);
        TextView textView = this.o;
        int i = R.color.white_70;
        Context context = getContext();
        if (!z) {
            i = R.color.white_30;
        }
        textView.setTextColor(androidx.core.content.a.b(context, i));
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c
    public void setLinkState(LinkState linkState) {
        h.e(linkState, "linkState");
        int ordinal = linkState.ordinal();
        if (ordinal == 0) {
            this.c.setText(getResources().getString(C0707R.string.alexa_linked_button_text));
            this.c.setTextColor(androidx.core.content.a.b(getContext(), R.color.green_light));
            this.c.setEnabled(true);
        } else if (ordinal != 1) {
            this.c.setTextColor(androidx.core.content.a.b(getContext(), R.color.white_30));
            this.c.setEnabled(false);
        } else {
            this.c.setText(getResources().getString(C0707R.string.alexa_link_button_text));
            this.c.setTextColor(androidx.core.content.a.b(getContext(), R.color.white));
            this.c.setEnabled(true);
        }
    }

    @Override // com.spotify.music.voiceassistantssettings.alexacard.c
    public void setListener(c.a aVar) {
        this.b = aVar;
    }

    public final void setParentView(ViewGroup viewGroup) {
        h.e(viewGroup, "parentView");
        this.p = viewGroup;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlexaCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.alexa_card_view, this);
        h.d(inflate, "LayoutInflater.from(cont…ut.alexa_card_view, this)");
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.alexa_link_button);
        h.d(findViewById, "cardView.findViewById(R.id.alexa_link_button)");
        Button button = (Button) findViewById;
        this.c = button;
        button.setOnClickListener(new a(0, this));
        View findViewById2 = inflate.findViewById(C0707R.id.set_default_button);
        h.d(findViewById2, "cardView.findViewById(R.id.set_default_button)");
        Button button2 = (Button) findViewById2;
        this.f = button2;
        button2.setOnClickListener(new a(1, this));
        View findViewById3 = inflate.findViewById(C0707R.id.set_default_title);
        h.d(findViewById3, "cardView.findViewById(R.id.set_default_title)");
        this.n = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.set_default_description);
        h.d(findViewById4, "cardView.findViewById(R.….set_default_description)");
        this.o = (TextView) findViewById4;
        setLinkState(LinkState.UNLINKED);
    }
}
