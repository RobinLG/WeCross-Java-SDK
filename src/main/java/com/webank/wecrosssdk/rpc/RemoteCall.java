package com.webank.wecrosssdk.rpc;

import com.webank.wecrosssdk.rpc.methods.Callback;
import com.webank.wecrosssdk.rpc.methods.Request;
import com.webank.wecrosssdk.rpc.methods.Response;
import com.webank.wecrosssdk.rpc.service.WeCrossService;

public class RemoteCall<T extends Response> {

    private WeCrossService weCrossService;
    private Class<T> responseType;
    private Request<?> request;

    public RemoteCall(WeCrossService weCrossService, Class<T> responseType, Request<?> request) {
        this.weCrossService = weCrossService;
        this.responseType = responseType;
        this.request = request;
    }

    public T send() throws Exception {
        return weCrossService.send(request, responseType);
    }

    public void asyncSend(Callback<T> callback) throws Exception {
        weCrossService.asyncSend(request, responseType, callback);
    }

    public WeCrossService getWeCrossService() {
        return weCrossService;
    }

    public void setWeCrossService(WeCrossService weCrossService) {
        this.weCrossService = weCrossService;
    }

    public Class<T> getResponseType() {
        return responseType;
    }

    public void setResponseType(Class<T> responseType) {
        this.responseType = responseType;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
