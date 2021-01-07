package com.spotify.encore.mobile.utils.picassocolorextractor;

import com.squareup.picasso.g;
import kotlin.jvm.internal.h;

public abstract class ColorCallback extends g.a {
    private PaletteApplyStrategy paletteApplyStrategy = new DefaultPaletteApplyStrategy(this);

    private static final class DefaultPaletteApplyStrategy extends PaletteApplyStrategy {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DefaultPaletteApplyStrategy(ColorCallback colorCallback) {
            super(colorCallback);
            h.e(colorCallback, "colorCallback");
        }

        @Override // com.spotify.encore.mobile.utils.picassocolorextractor.ColorCallback.PaletteApplyStrategy
        public void onReceivedPalette(kvd kvd) {
            h.e(kvd, "palette");
            reportColor(ColorCallbackKt.access$extractColor(kvd));
        }
    }

    public static abstract class PaletteApplyStrategy {
        private final ColorCallback colorCallback;

        public PaletteApplyStrategy(ColorCallback colorCallback2) {
            h.e(colorCallback2, "colorCallback");
            this.colorCallback = colorCallback2;
            colorCallback2.setPaletteApplyStrategy(this);
        }

        public abstract void onReceivedPalette(kvd kvd);

        /* access modifiers changed from: protected */
        public final void reportColor(int i) {
            this.colorCallback.onColorExtracted(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setPaletteApplyStrategy(PaletteApplyStrategy paletteApplyStrategy2) {
        this.paletteApplyStrategy = paletteApplyStrategy2;
    }

    public abstract void onColorExtracted(int i);

    public final void onPaletteGenerated(kvd kvd) {
        h.e(kvd, "palette");
        this.paletteApplyStrategy.onReceivedPalette(kvd);
    }
}
