package com.bsuir.rppba.data.api;

import androidx.annotation.NonNull;

import com.bsuir.rppba.data.entity.RawMaterialsResponse;
import com.bsuir.rppba.data.entity.SendMaterialsToManufactureBody;
import com.bsuir.rppba.data.entity.WaybillResponse;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface LogisticsAPI {

    @GET("/api/product/raw-materials")
    @NonNull
    Observable<List<RawMaterialsResponse>> getRawMaterials();

    @GET("/api/waybill")
    @NonNull
    Observable<List<WaybillResponse>> getWaybills();

    @GET("/api/product/products")
    @NonNull
    Observable<List<RawMaterialsResponse>> getProducts();

    @POST("/api/product/{id}/send-materials-to-manufacture")
    Completable sendMaterialsToManufacture(@Path("id") int id, @Body SendMaterialsToManufactureBody body);

}
