package com.adjust.sdk;

import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.SocketTimeoutException;
import java.util.List;

public class RequestHandler implements IRequestHandler {
    private WeakReference<IActivityHandler> activityHandlerWeakRef;
    private String basePath;
    private ThreadExecutor executor = new SingleThreadCachedScheduler("RequestHandler");
    private String gdprPath;
    private ILogger logger = AdjustFactory.getLogger();
    private WeakReference<IPackageHandler> packageHandlerWeakRef;
    private String subscriptionPath;

    public RequestHandler(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler) {
        init(iActivityHandler, iPackageHandler);
        this.basePath = iPackageHandler.getBasePath();
        this.gdprPath = iPackageHandler.getGdprPath();
        this.subscriptionPath = iPackageHandler.getSubscriptionPath();
    }

    private void closePackageI(ActivityPackage activityPackage, String str, Throwable th) {
        String formatString = Util.formatString("%s. (%s) Will retry later", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
        this.logger.error(formatString, new Object[0]);
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        buildResponseData.message = formatString;
        IPackageHandler iPackageHandler = this.packageHandlerWeakRef.get();
        if (iPackageHandler != null) {
            iPackageHandler.closeFirstPackage(buildResponseData, activityPackage);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean sendI(ActivityPackage activityPackage, int i, String str, boolean z) {
        IActivityHandler iActivityHandler;
        try {
            ResponseData createPOSTHttpsURLConnection = UtilNetworking.createPOSTHttpsURLConnection(str, activityPackage, i);
            IPackageHandler iPackageHandler = this.packageHandlerWeakRef.get();
            if (iPackageHandler == null || (iActivityHandler = this.activityHandlerWeakRef.get()) == null) {
                return true;
            }
            if (createPOSTHttpsURLConnection.trackingState == TrackingState.OPTED_OUT) {
                iActivityHandler.gotOptOutResponse();
                return true;
            } else if (createPOSTHttpsURLConnection.jsonResponse == null) {
                iPackageHandler.closeFirstPackage(createPOSTHttpsURLConnection, activityPackage);
                return true;
            } else {
                iPackageHandler.sendNextPackage(createPOSTHttpsURLConnection);
                return true;
            }
        } catch (UnsupportedEncodingException e) {
            sendNextPackageI(activityPackage, "Failed to encode parameters", e);
            return true;
        } catch (SocketTimeoutException e2) {
            if (z) {
                closePackageI(activityPackage, "Request timed out", e2);
            }
            return false;
        } catch (IOException e3) {
            if (z) {
                closePackageI(activityPackage, "Request failed", e3);
            }
            return false;
        } catch (Throwable th) {
            sendNextPackageI(activityPackage, "Runtime exception", th);
            return true;
        }
    }

    private void sendNextPackageI(ActivityPackage activityPackage, String str, Throwable th) {
        String formatString = Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
        this.logger.error(formatString, new Object[0]);
        ResponseData buildResponseData = ResponseData.buildResponseData(activityPackage);
        buildResponseData.message = formatString;
        IPackageHandler iPackageHandler = this.packageHandlerWeakRef.get();
        if (iPackageHandler != null) {
            iPackageHandler.sendNextPackage(buildResponseData);
        }
    }

    @Override // com.adjust.sdk.IRequestHandler
    public void init(IActivityHandler iActivityHandler, IPackageHandler iPackageHandler) {
        this.packageHandlerWeakRef = new WeakReference<>(iPackageHandler);
        this.activityHandlerWeakRef = new WeakReference<>(iActivityHandler);
    }

    @Override // com.adjust.sdk.IRequestHandler
    public void sendPackage(final ActivityPackage activityPackage, final int i) {
        this.executor.submit(new Runnable() {
            /* class com.adjust.sdk.RequestHandler.AnonymousClass1 */

            @Override // java.lang.Runnable
            public void run() {
                if (activityPackage.getActivityKind() == ActivityKind.GDPR) {
                    List<String> gdprUrls = UrlFactory.getGdprUrls();
                    int i = 0;
                    boolean z = false;
                    while (i < gdprUrls.size() && !z) {
                        String str = gdprUrls.get(i);
                        if (RequestHandler.this.gdprPath != null) {
                            StringBuilder V0 = je.V0(str);
                            V0.append(RequestHandler.this.gdprPath);
                            str = V0.toString();
                        }
                        StringBuilder V02 = je.V0(str);
                        V02.append(activityPackage.getPath());
                        z = RequestHandler.this.sendI(activityPackage, i, V02.toString(), i == gdprUrls.size() + -1);
                        if (z && i > 0) {
                            UrlFactory.prioritiseGdprUrl(gdprUrls.get(i));
                        }
                        i++;
                    }
                } else if (activityPackage.getActivityKind() == ActivityKind.SUBSCRIPTION) {
                    List<String> subscriptionUrls = UrlFactory.getSubscriptionUrls();
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < subscriptionUrls.size() && !z2) {
                        String str2 = subscriptionUrls.get(i2);
                        if (RequestHandler.this.subscriptionPath != null) {
                            StringBuilder V03 = je.V0(str2);
                            V03.append(RequestHandler.this.subscriptionPath);
                            str2 = V03.toString();
                        }
                        StringBuilder V04 = je.V0(str2);
                        V04.append(activityPackage.getPath());
                        z2 = RequestHandler.this.sendI(activityPackage, i, V04.toString(), i2 == subscriptionUrls.size() + -1);
                        if (z2 && i2 > 0) {
                            UrlFactory.prioritiseSubscriptionUrl(subscriptionUrls.get(i2));
                        }
                        i2++;
                    }
                } else {
                    List<String> baseUrls = UrlFactory.getBaseUrls();
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < baseUrls.size() && !z3) {
                        String str3 = baseUrls.get(i3);
                        if (RequestHandler.this.basePath != null) {
                            StringBuilder V05 = je.V0(str3);
                            V05.append(RequestHandler.this.basePath);
                            str3 = V05.toString();
                        }
                        StringBuilder V06 = je.V0(str3);
                        V06.append(activityPackage.getPath());
                        z3 = RequestHandler.this.sendI(activityPackage, i, V06.toString(), i3 == baseUrls.size() + -1);
                        if (z3 && i3 > 0) {
                            UrlFactory.prioritiseBaseUrl(baseUrls.get(i3));
                        }
                        i3++;
                    }
                }
            }
        });
    }

    @Override // com.adjust.sdk.IRequestHandler
    public void teardown() {
        this.logger.verbose("RequestHandler teardown", new Object[0]);
        ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        WeakReference<IPackageHandler> weakReference = this.packageHandlerWeakRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference<IActivityHandler> weakReference2 = this.activityHandlerWeakRef;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.executor = null;
        this.packageHandlerWeakRef = null;
        this.activityHandlerWeakRef = null;
        this.logger = null;
    }
}
