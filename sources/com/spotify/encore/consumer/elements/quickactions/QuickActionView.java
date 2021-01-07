package com.spotify.encore.consumer.elements.quickactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.encore.consumer.elements.R;
import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.encore.consumer.elements.heart.HeartButton;
import com.spotify.encore.consumer.elements.quickactions.Action;
import com.spotify.encore.consumer.elements.quickactions.ban.BanButton;
import com.spotify.encore.consumer.elements.quickactions.hide.HideButton;
import com.spotify.encore.consumer.elements.quickactions.profile.ProfileButton;
import com.spotify.libs.facepile.c;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class QuickActionView extends FrameLayout implements QuickAction {
    private final String contentDescContext;
    private nmf<? super Events, f> eventHandler;
    private ViewContext viewContext;

    public static final class ViewContext {
        private Picasso picasso;

        public ViewContext(Picasso picasso2) {
            h.e(picasso2, "picasso");
            this.picasso = picasso2;
        }

        public final Picasso getPicasso() {
            return this.picasso;
        }

        public final void setPicasso(Picasso picasso2) {
            h.e(picasso2, "<set-?>");
            this.picasso = picasso2;
        }
    }

    public QuickActionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public QuickActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuickActionView(Context context, AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void addQuickActionFor(Action action) {
        int i;
        if (h.a(action, Action.Ban.INSTANCE)) {
            i = R.layout.ban_button_layout;
        } else if (action instanceof Action.Profile) {
            i = R.layout.profile_button_layout;
        } else if (h.a(action, Action.Heart.INSTANCE)) {
            i = R.layout.heart_button_layout;
        } else if (h.a(action, Action.Hide.INSTANCE)) {
            i = R.layout.hide_button_layout;
        } else if (!h.a(action, Action.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
    }

    private final void renderProfile(ProfileButton profileButton, Action.Profile profile) {
        ViewContext viewContext2 = this.viewContext;
        if (viewContext2 != null) {
            profileButton.setPicasso(viewContext2.getPicasso());
            List<Face> faces = profile.getFaces();
            ArrayList arrayList = new ArrayList(d.e(faces, 10));
            for (T t : faces) {
                arrayList.add(c.a(t.getImageUrl(), t.getInitials().getInitials(), t.getInitials().getColor()));
            }
            profileButton.render((List<? extends c>) arrayList);
            return;
        }
        h.k("viewContext");
        throw null;
    }

    @Override // com.spotify.encore.Item
    public void onEvent(nmf<? super Events, f> nmf) {
        h.e(nmf, "event");
        this.eventHandler = nmf;
    }

    public final void setViewContext(ViewContext viewContext2) {
        h.e(viewContext2, "viewContext");
        this.viewContext = viewContext2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.eventHandler = QuickActionView$eventHandler$1.INSTANCE;
        String string = context.getString(R.string.element_content_description_context_song);
        h.d(string, "context.getString(\n     …iption_context_song\n    )");
        this.contentDescContext = string;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.spotify.encore.consumer.elements.quickactions.QuickActionView.AnonymousClass1 */
            final /* synthetic */ QuickActionView this$0;

            {
                this.this$0 = r1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                View view2 = (View) kotlin.sequences.h.a(e4.b(this.this$0));
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    public void render(Action action) {
        h.e(action, "model");
        View view = (View) kotlin.sequences.h.a(e4.b(this));
        if (!h.a((Action) (view != null ? view.getTag() : null), action)) {
            removeAllViews();
            addQuickActionFor(action);
        }
        View view2 = (View) kotlin.sequences.h.a(e4.b(this));
        if (view2 != null) {
            view2.setTag(action);
        }
        if (!h.a(action, Action.None.INSTANCE)) {
            if (h.a(action, Action.Ban.INSTANCE)) {
                if (view2 != null) {
                    BanButton banButton = (BanButton) view2;
                    banButton.render(true);
                    banButton.onEvent(new QuickActionView$render$1(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.quickactions.ban.BanButton");
            } else if (action instanceof Action.Profile) {
                if (view2 != null) {
                    ProfileButton profileButton = (ProfileButton) view2;
                    renderProfile(profileButton, (Action.Profile) action);
                    profileButton.onEvent(new QuickActionView$render$2(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.quickactions.profile.ProfileButton");
            } else if (h.a(action, Action.Heart.INSTANCE)) {
                if (view2 != null) {
                    HeartButton heartButton = (HeartButton) view2;
                    heartButton.render(new Heart.Model(true, this.contentDescContext));
                    heartButton.onEvent(new QuickActionView$render$3(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.heart.HeartButton");
            } else if (!h.a(action, Action.Hide.INSTANCE)) {
            } else {
                if (view2 != null) {
                    HideButton hideButton = (HideButton) view2;
                    hideButton.render(true);
                    hideButton.onEvent(new QuickActionView$render$4(this));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.encore.consumer.elements.quickactions.hide.HideButton");
            }
        }
    }
}
