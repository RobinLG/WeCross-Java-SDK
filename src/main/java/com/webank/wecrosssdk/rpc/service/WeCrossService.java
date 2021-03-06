package com.webank.wecrosssdk.rpc.service;

import com.webank.wecrosssdk.exception.WeCrossSDKException;
import com.webank.wecrosssdk.rpc.methods.Callback;
import com.webank.wecrosssdk.rpc.methods.Request;
import com.webank.wecrosssdk.rpc.methods.Response;

public interface WeCrossService {

    void init() throws WeCrossSDKException;

    <T extends Response> T send(Request request, Class<T> responseType) throws Exception;

    <T extends Response> void asyncSend(
            Request<?> request, Class<T> responseType, Callback<T> callback);
    //    void sendOnly(Request request);
    //
    //    <T extends Response> CompletableFuture<T> sendAsync(Request request, Class<T>
    // responseType);
}
