package icu.xwang.xwapisdk.service.impi;

import icu.xwang.xwapisdk.client.XwApiClient;
import icu.xwang.xwapisdk.exception.ApiException;
import icu.xwang.xwapisdk.model.request.*;
import icu.xwang.xwapisdk.model.response.LoveResponse;
import icu.xwang.xwapisdk.model.response.PoisonousChickenSoupResponse;
import icu.xwang.xwapisdk.model.response.RandomWallpaperResponse;
import icu.xwang.xwapisdk.model.response.ResultResponse;
import icu.xwang.xwapisdk.service.ApiService;
import icu.xwang.xwapisdk.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: xiaowang
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(XwApiClient xwApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(xwApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(XwApiClient xwApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(XwApiClient xwApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(XwApiClient xwApiClient, HoroscopeRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(XwApiClient xwApiClient, IpInfoRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(XwApiClient xwApiClient, WeatherRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getVisitorInfo(XwApiClient xwApiClient, VisitorRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse getVisitorInfo(VisitorRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getItNews(XwApiClient xwApiClient, ItNewsRequest request) throws ApiException {
        return request(xwApiClient, request);
    }

    @Override
    public ResultResponse getItNews(ItNewsRequest request) throws ApiException {
        return request(request);
    }

}
