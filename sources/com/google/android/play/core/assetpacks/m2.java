package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* access modifiers changed from: package-private */
public final class m2 {
    private static final a b = new a("VerifySliceTaskHandler");
    private final z a;

    m2(z zVar) {
        this.a = zVar;
    }

    public final void a(l2 l2Var) {
        File b2 = this.a.b(l2Var.b, l2Var.c, l2Var.d, l2Var.e);
        if (b2.exists()) {
            try {
                File t = this.a.t(l2Var.b, l2Var.c, l2Var.d, l2Var.e);
                if (t.exists()) {
                    try {
                        if (s1.b(k2.a(b2, t)).equals(l2Var.f)) {
                            b.f("Verification of slice %s of pack %s successful.", l2Var.e, l2Var.b);
                            File h = this.a.h(l2Var.b, l2Var.c, l2Var.d, l2Var.e);
                            if (!h.exists()) {
                                h.mkdirs();
                            }
                            if (!b2.renameTo(h)) {
                                throw new bv(String.format("Failed to move slice %s after verification.", l2Var.e), l2Var.a);
                            }
                            return;
                        }
                        throw new bv(String.format("Verification failed for slice %s.", l2Var.e), l2Var.a);
                    } catch (NoSuchAlgorithmException e) {
                        throw new bv("SHA256 algorithm not supported.", e, l2Var.a);
                    } catch (IOException e2) {
                        throw new bv(String.format("Could not digest file during verification for slice %s.", l2Var.e), e2, l2Var.a);
                    }
                } else {
                    throw new bv(String.format("Cannot find metadata files for slice %s.", l2Var.e), l2Var.a);
                }
            } catch (IOException e3) {
                throw new bv(String.format("Could not reconstruct slice archive during verification for slice %s.", l2Var.e), e3, l2Var.a);
            }
        } else {
            throw new bv(String.format("Cannot find unverified files for slice %s.", l2Var.e), l2Var.a);
        }
    }
}
