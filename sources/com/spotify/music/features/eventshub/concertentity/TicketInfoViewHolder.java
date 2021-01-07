package com.spotify.music.features.eventshub.concertentity;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;

public class TicketInfoViewHolder {
    private final Context a;
    TextView b;
    TextView c;
    LinearLayout d;
    private final boolean e;

    /* JADX WARN: Init of enum b can be incorrect */
    /* JADX WARN: Init of enum c can be incorrect */
    private enum Partner {
        TICKETMASTER("ticketmaster", "Ticketmaster", Type.VENDOR),
        SONGKICK("songkick", "Songkick", r1),
        AXS("axs", "AXS", r1),
        UNKNOWN("", "", Type.UNKNOWN);
        
        private static final Partner[] n = values();
        private final String mName;
        private final String mPartnerId;
        private final Type mType;

        /* access modifiers changed from: package-private */
        public enum Type {
            AGGREGATOR,
            VENDOR,
            UNKNOWN
        }

        static {
            Type type = Type.AGGREGATOR;
        }

        private Partner(String str, String str2, Type type) {
            this.mPartnerId = str;
            this.mName = str2;
            this.mType = type;
        }

        public static Partner h(String str) {
            Partner[] partnerArr = n;
            for (Partner partner : partnerArr) {
                if (partner.mPartnerId.equals(str)) {
                    return partner;
                }
            }
            return UNKNOWN;
        }
    }

    public TicketInfoViewHolder(Context context, boolean z) {
        this.a = context;
        this.e = z;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(1);
        if (z) {
            linearLayout.setOrientation(1);
        } else {
            linearLayout.setOrientation(0);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, (int) context.getResources().getDimension(C0707R.dimen.concert_entity_subtitle_text_bottom_margin));
        linearLayout.setLayoutParams(layoutParams);
        this.d = linearLayout;
    }

    public void a(String str, String str2, String str3, boolean z) {
        String str4;
        Partner h = Partner.h(str);
        if (z) {
            str4 = this.a.getString(C0707R.string.events_hub_concert_entity_ticket_partner_virtual, h.mName);
        } else {
            Partner.Type type = h.mType;
            Partner.Type type2 = Partner.Type.VENDOR;
            if (type == type2 && str2.equals(ConcertEntityModel.FEW_TICKETS_LEFT)) {
                this.b = c.f(this.a);
                j.e(this.b, this.a, a.b(this.a, C0707R.color.concert_sunflower_yellow));
                this.b.setVisibility(8);
                this.d.addView(this.b);
                this.b.setVisibility(0);
                this.b.setText(this.a.getText(C0707R.string.events_hub_concert_entity_ticket_selling_fast));
                str4 = this.a.getString(C0707R.string.events_hub_concert_entity_ticketing_partner_preposition, h.mName);
                if (!this.e) {
                    str4 = je.x0(" ", str4);
                }
            } else {
                if (h.mType == type2 && str2.equals(ConcertEntityModel.TICKETS_NOT_AVAILABLE)) {
                    str4 = this.a.getString(C0707R.string.events_hub_concert_entity_sold_out_text, h.mName);
                } else {
                    if (h.mType == type2 && !MoreObjects.isNullOrEmpty(str3)) {
                        str4 = this.a.getString(C0707R.string.events_hub_concert_entity_ticket_price_with_partner, str3, h.mName);
                    } else {
                        if (h.mType == type2 && !str2.equals(ConcertEntityModel.FEW_TICKETS_LEFT) && !str2.equals(ConcertEntityModel.TICKETS_NOT_AVAILABLE)) {
                            str4 = this.a.getString(C0707R.string.events_hub_concert_entity_ticket_partner, h.mName);
                        } else {
                            if (h.mType == Partner.Type.AGGREGATOR) {
                                str4 = this.a.getString(C0707R.string.events_hub_concert_entity_ticket_aggregator, h.mName);
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.c = c.f(this.a);
        j.e(this.c, this.a, a.b(this.a, C0707R.color.glue_row_subtitle_color));
        this.c.setText(str4);
        this.d.addView(this.c);
    }
}
