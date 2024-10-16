package icu.xwang.xwapisdk.service;

import cn.hutool.http.HttpResponse;
import icu.xwang.xwapisdk.client.XwApiClient;
import icu.xwang.xwapisdk.exception.ApiException;
import icu.xwang.xwapisdk.model.request.*;
import icu.xwang.xwapisdk.model.response.*;

/**
 * @Author: xiaowang
 * @Date: 2023年09月17日 08:34
 * @Version: 1.0
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(XwApiClient xwApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 随机毒鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 喝毒鸡汤
     *
     * @param xwApiClient Xw api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(XwApiClient xwApiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(XwApiClient xwApiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 随意情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 随意情话
     *
     * @param xwApiClient Xw api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(XwApiClient xwApiClient) throws ApiException;

    /**
     * 星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 星座运势
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(XwApiClient xwApiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(XwApiClient xwApiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(XwApiClient xwApiClient, WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;


    /**
     * 获取操作系统，浏览器，浏览器版本，访客IP地址，访问时间，访客IP地址天气
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getVisitorInfo(XwApiClient xwApiClient, VisitorRequest request) throws ApiException;

    /**
     * 获取操作系统，浏览器，浏览器版本，访客IP地址，访问时间，访客IP地址天气
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getVisitorInfo(VisitorRequest request) throws ApiException;

    /**
     * IT热榜资讯
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getItNews(XwApiClient xwApiClient, ItNewsRequest request) throws ApiException;

    /**
     * IT热榜资讯
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getItNews(ItNewsRequest request) throws ApiException;

    /**
     * 获取手机号归属地
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getPhoneInfo(XwApiClient xwApiClient, PhoneRequest request) throws ApiException;

    /**
     * 获取手机号归属地
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getPhoneInfo(PhoneRequest request) throws ApiException;

    /**
     * 获取实时抖音热榜
     *
     * @param xwApiClient Xw api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getDouyinHot(XwApiClient xwApiClient, DouYinHotRequest request) throws ApiException;

    /**
     * 获取实时抖音热榜
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getDouyinHot(DouYinHotRequest request) throws ApiException;

    /**
     * 获取实时哔哩哔哩热榜
     *
     * @param xwApiClient Xw api客户端
     * @param request     请求参数
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getBiliHot(XwApiClient xwApiClient, BilibiliHotRequest request) throws ApiException;

    /**
     * 获取实时哔哩哔哩热榜
     *
     * @param request 请求参数
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getBiliHot(BilibiliHotRequest request) throws ApiException;

    /**
     * 获取实时微博热榜
     *
     * @param xwApiClient Xw api客户端
     * @param request     请求参数
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWbHot(XwApiClient xwApiClient, WbHotRequest request) throws ApiException;

    /**
     * 获取实时微博热榜
     *
     * @param request 请求参数
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWbHot(WbHotRequest request) throws ApiException;

    /**
     * 获取平台名称
     *
     * @param xwApiClient Xw api客户端
     * @return 平台名称 {@link String}
     * @throws ApiException 业务异常
     */
    NameResponse getNameInfo(XwApiClient xwApiClient, NameRequest request) throws ApiException;

    /**
     * 获取平台名称
     *
     * @return 平台名称 {@link String}
     * @throws ApiException 业务异常
     */
    NameResponse getNameInfo(NameRequest request) throws ApiException;


}
