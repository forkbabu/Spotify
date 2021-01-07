package io.branch.referral.network;

import android.content.Context;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class a extends BranchRemoteInterface {
    private r a;

    a(Context context) {
        this.a = r.r(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4 A[SYNTHETIC, Splitter:B:48:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.branch.referral.network.BranchRemoteInterface.a h(java.lang.String r7, int r8) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.h(java.lang.String, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d1, code lost:
        r1.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d5, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d8, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00da, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        java.lang.Thread.sleep((long) r8.a.z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0113, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0114, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0117, code lost:
        r9 = i(r9, r10, r11 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x011c, code lost:
        if (r3 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011e, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0121, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0129, code lost:
        throw new io.branch.referral.network.BranchRemoteInterface.BranchRemoteException(-111);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5 A[SYNTHETIC, Splitter:B:34:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[SYNTHETIC, Splitter:B:49:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A[SYNTHETIC, Splitter:B:56:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:13:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0108 A[SYNTHETIC, Splitter:B:82:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.branch.referral.network.BranchRemoteInterface.a i(java.lang.String r9, org.json.JSONObject r10, int r11) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.a.i(java.lang.String, org.json.JSONObject, int):io.branch.referral.network.BranchRemoteInterface$a");
    }

    private String j(InputStream inputStream) {
        if (inputStream != null) {
            try {
                return new BufferedReader(new InputStreamReader(inputStream)).readLine();
            } catch (IOException unused) {
            }
        }
        return null;
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.a b(String str) {
        return h(str, 0);
    }

    @Override // io.branch.referral.network.BranchRemoteInterface
    public BranchRemoteInterface.a c(String str, JSONObject jSONObject) {
        return i(str, jSONObject, 0);
    }
}
