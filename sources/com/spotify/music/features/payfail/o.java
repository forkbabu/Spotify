package com.spotify.music.features.payfail;

import com.spotify.music.features.payfail.PaymentFailureRepository;
import io.reactivex.functions.l;

public final /* synthetic */ class o implements l {
    public static final /* synthetic */ o a = new o();

    private /* synthetic */ o() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PaymentFailureRepository.Resources resources = (PaymentFailureRepository.Resources) obj;
        int size = resources.offlineAvailabilities().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if ("yes".equals(resources.offlineAvailabilities().get(i2).offlineAvailability())) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }
}
